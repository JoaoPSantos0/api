package com.projetosjava.locstation;

public class Localizacao {

    private String message;
    private long timestamp;
    private IssPosition iss_position;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Integer timestamp) {
        this.timestamp = timestamp;
    }

    public IssPosition getIssPosition() {
        return iss_position;
    }

    public void setIssPosition(IssPosition issPosition) {
        this.iss_position = issPosition;
    }

    @Override
    public String toString() {
        return "Localizacao{" + "message=" + message + ", timestamp=" + timestamp + ", issPosition=" + iss_position + '}';
    }
    
    

}
