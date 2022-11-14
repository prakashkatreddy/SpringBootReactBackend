package com.newreact.studentsystem.model;

public class ApiResponse {

    private int status;
    private String message;
    private Object result;

    public Object getResult() {

        return message;
    }

    public void setResult(Object result) {

        this.result = result;
    }

    public ApiResponse(int status, String message, Object result) {
        this.status = status;
        this.message = message;
        this.result = result;
    }

    public int getStatus() {
        return status;
    }

    public String getMessage() {

        return message;
    }

    public void setMessage(String message) {

        this.message = message;
    }

}
