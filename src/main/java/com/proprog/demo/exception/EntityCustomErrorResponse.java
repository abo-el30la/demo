package com.proprog.demo.exception;

public class EntityCustomErrorResponse {
    public String message;
    public  int status;

    public  Throwable throwable;

    public EntityCustomErrorResponse(String message, int status, Throwable throwable) {
        this.message = message;
        this.status = status;
        this.throwable = throwable;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public Throwable getThrowable() {
        return throwable;
    }

    public void setThrowable(Throwable throwable) {
        this.throwable = throwable;
    }
}
