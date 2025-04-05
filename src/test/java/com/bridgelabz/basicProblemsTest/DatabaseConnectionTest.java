package com.bridgelabz.basicProblemsTest;

import com.bridgelabz.basicProblems.DatabaseConnection;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DatabaseConnectionTest {
    private DatabaseConnection db;

    @BeforeEach
    void setUp(){
        db=new DatabaseConnection();
        db.connect();
    }


    @AfterEach
    public void disconnect(){
        db.disconnect();
    }

    @Test
    public void isConnectionEstablished(){
        Assertions.assertTrue(db.isConnected(), "Database is to be connected first");
    }

}
