package com.file.upload_and_download.exception;

public class FileStorageException extends RuntimeException {

    public FileStorageException(String message) {
        super(message);
    }
//i7uiu
    public FileStorageException(String message, Throwable cause) {
        super(message, cause);
    }
}
