package com.example.dell.lab3;

public class model { private String uri;
    private String name;
    private String id;

    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public model(String uri, String name, String id) {

        this.uri = uri;
        this.name = name;
        this.id = id;
    }
}
