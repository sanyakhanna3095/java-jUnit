package com.bridgelabz.basicProblems;

public class DatabaseConnection {
    private boolean connected;

    public void disconnect() {
        connected=false;
        System.out.println("Database Disconnected !");
    }

    public void connect() {
        connected=true;
        System.out.println("Database connected");
    }

    public boolean isConnected() {
        return connected;
    }
}
