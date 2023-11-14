package com.exercises.json;

public class TextToJSON {
    String message;

    public TextToJSON(String message) {
        setMessage(message);
    }

    public String getMessage() {
        return this.message;
    }

    private void setMessage(String message) {
        this.message = message;
    }
}
