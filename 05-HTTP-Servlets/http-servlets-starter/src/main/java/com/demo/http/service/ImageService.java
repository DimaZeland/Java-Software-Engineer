package com.demo.http.service;

import com.demo.http.util.PropertiesUtil;
import lombok.NoArgsConstructor;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Optional;

import static java.nio.file.StandardOpenOption.*;
import static lombok.AccessLevel.*;

@NoArgsConstructor(access = PRIVATE)
public class ImageService {
    private static final ImageService INSTANCE = new ImageService();

    private final String basePath = PropertiesUtil.get("image.base.url");

    public void upload(String imagePath, InputStream imageContent) {
        var imageFullPath = Path.of(basePath, imagePath);

        try (imageContent) {
            Files.createDirectories(imageFullPath.getParent());
            Files.write(imageFullPath, imageContent.readAllBytes(), CREATE,
                    TRUNCATE_EXISTING);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static ImageService getInstance() {
        return INSTANCE;
    }

    public Optional<InputStream> get(String imagePath) {
        var imageFullPath = Path.of(basePath, imagePath);

        try {
            return Files.exists(imageFullPath)
                    ? Optional.of(Files.newInputStream(imageFullPath))
                    : Optional.empty();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
