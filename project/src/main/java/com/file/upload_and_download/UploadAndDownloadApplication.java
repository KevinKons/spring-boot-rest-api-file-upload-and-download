package com.file.upload_and_download;

import com.file.upload_and_download.property.FileStorageProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties({
        FileStorageProperties.class
})
public class UploadAndDownloadApplication {

    public static void main(String[] args) {
        SpringApplication.run(UploadAndDownloadApplication.class, args);
    }

}
