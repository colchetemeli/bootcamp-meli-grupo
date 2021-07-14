package com.api.ecommerce.dto;

public class ExceptionDTO {
    
    private String status;
    private String message;
    
    public ExceptionDTO(String status, String message) {
        this.status = status;
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
    public String getStatus() {
        return status;
    }
}
