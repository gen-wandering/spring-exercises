package com.springexercises.partb.validationaspect;

public class Service {
    private int id;
    private String apiKey;

    public Service(int id, String apiKey) {
        this.id = id;
        this.apiKey = apiKey;
    }

    public boolean setNewIdAndApiKey(int newId, String newApiKey) {
        id = newId;
        apiKey = newApiKey;
        return true;
    }

    @Override
    public String toString() {
        return "Service{" +
                "id=" + id +
                ", apiKey='" + apiKey + '\'' +
                '}';
    }
}
