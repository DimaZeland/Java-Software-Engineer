package com.demo.jdbc.starter;

import com.demo.jdbc.starter.util.ConnectionPool;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.sql.*;

public class BlobRunner {
    public static void main(String[] args) throws SQLException, IOException {
        // blob - bytea
        // clob - TEXT
//        saveImage();
        getImage();
    }


    private static void saveImage() throws SQLException, IOException {
        var sql = """
                UPDATE aircraft
                SET image = ?
                WHERE id = 1
                """;

        try (Connection connection = ConnectionPool.get();
             PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
            preparedStatement.setBytes(1, Files.readAllBytes(Path.of("resources", "boing777.jpg")));

            preparedStatement.executeUpdate();
        }
    }

//    private static void saveImage() throws SQLException, IOException {
//        var sql = """
//                    UPDATE aircraft
//                    SET image = ?
//                    WHERE id = 1
//                    """;
//
//        try (Connection connection = ConnectionManager.open();
//             PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
//            connection.setAutoCommit(false);
//            Blob blob = connection.createBlob();
//            blob.setBytes(1, Files.readAllBytes(Path.of("resources","boing777.jpg")));
//
//            preparedStatement.setBlob(1,blob);
//            preparedStatement.executeUpdate();
//            connection.commit();
//        }
//    }

    private static void getImage() throws SQLException, IOException {
        var sql = """
                SELECT image
                FROM aircraft
                WHERE id = ?
                """;
        try (Connection connection = ConnectionPool.get();
             PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
            preparedStatement.setInt(1, 1);
            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                byte[] image = resultSet.getBytes("image");
                Files.write(Path.of("resources", "boing777_new.jpg"), image, StandardOpenOption.CREATE);
            }
        }
    }
}
