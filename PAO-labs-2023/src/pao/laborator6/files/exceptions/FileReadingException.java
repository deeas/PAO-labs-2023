package pao.laborator6.files.exceptions;

public class FileReadingException extends Exception {
    public FileReadingException(String message, Throwable cause) {
        super(message, cause);
    }

    public FileReadingException(String message) {
        super(message);
    }
}
