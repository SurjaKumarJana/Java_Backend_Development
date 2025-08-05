package org.surja.spring_data_jpa_demo.exception;

public class LaptopAllocationFailedException extends Exception{
    public LaptopAllocationFailedException(String message) {
        super(message);
    }
}
