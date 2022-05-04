package com.greenfoxacademy.springstart.method;

public class Greeting {

    long id;
    String content;

    public Greeting(){
        this.id = 0;
        this.content = "";
    }

    public long getId() {
        return id;
    }

    public void setId() {
        this.id += 1;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
