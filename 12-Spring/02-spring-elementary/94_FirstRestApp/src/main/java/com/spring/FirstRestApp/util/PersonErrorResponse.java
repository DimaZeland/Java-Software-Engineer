package com.spring.FirstRestApp.util;

public class PersonErrorResponse {
    private String message;
    private long timestamp;

    public PersonErrorResponse(String s, long currentTimeMillis) {
        message = s;
        timestamp = currentTimeMillis;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }
}
