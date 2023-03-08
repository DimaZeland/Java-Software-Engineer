package com.dmdev.jdbc.starter;

import com.dmdev.jdbc.starter.util.ConnectionManager;
import com.dmdev.jdbc.starter.util.ConnectionPool;

import java.sql.*;
import java.sql.Connection;

public class TransactionRunner {
    public static void main(String[] args) throws SQLException {
        long flightId = 8;
        String deleteFlightSql = "DELETE FROM flight WHERE id = ?";
        var deleteTicketsSql = "DELETE FROM ticket WHERE flight_id = ?";
        Connection connection = null;
        PreparedStatement deleteFlightStatement = null;
        PreparedStatement deleteTicketsStatement = null;
        try  {
            connection = ConnectionPool.get();
            deleteFlightStatement = connection.prepareStatement(deleteFlightSql);
            deleteTicketsStatement = connection.prepareStatement(deleteTicketsSql);

            connection.setAutoCommit(false);

            deleteFlightStatement.setLong(1, flightId);
            deleteTicketsStatement.setLong(1, flightId);

            int deleteTicketsResult = deleteTicketsStatement.executeUpdate();
            if(true) {
                throw new RuntimeException("Oops");
            }
            int deleteFlightsResult = deleteFlightStatement.executeUpdate();
            connection.commit();
        } catch (Exception e) {
            if(connection != null) {
                connection.rollback();
            }
            throw e;
        } finally {
            if(connection != null) {
                connection.close();
            }
            if(deleteFlightStatement != null) {
                deleteFlightStatement.close();
            }
            if (deleteTicketsStatement != null) {
                deleteTicketsStatement.close();
            }
        }
    }

    public static void mainBatch(String[] args) throws SQLException {
        long flightId = 8;
        String deleteFlightSql = "DELETE FROM flight WHERE id = " + flightId;
        var deleteTicketsSql = "DELETE FROM ticket WHERE flight_id = " + flightId;
        Connection connection = null;
        Statement statement = null;
        try  {
            connection = ConnectionPool.get();
            connection.setAutoCommit(false);

            statement = connection.createStatement();
            statement.addBatch(deleteTicketsSql);
            statement.addBatch(deleteFlightSql);


            int[] ints = statement.executeBatch();
            connection.commit();
        } catch (Exception e) {
            if(connection != null) {
                connection.rollback();
            }
            throw e;
        } finally {
            if(connection != null) {
                connection.close();
            }
            if(statement != null) {
                statement.close();
            }
        }
    }
}
