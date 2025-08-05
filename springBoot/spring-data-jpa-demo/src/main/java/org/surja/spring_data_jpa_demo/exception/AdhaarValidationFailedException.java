package org.surja.spring_data_jpa_demo.exception;

public class AdhaarValidationFailedException extends Exception{
    public AdhaarValidationFailedException(String message) {
        super(message);
    }
}
