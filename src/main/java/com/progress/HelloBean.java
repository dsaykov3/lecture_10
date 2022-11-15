package com.progress;

public class HelloBean {
    public HelloBean(String message) {
        this.message = message;
    }

    public HelloBean() {
    }

    private String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
