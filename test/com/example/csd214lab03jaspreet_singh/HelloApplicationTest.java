package com.example.csd214lab03jaspreet_singh;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HelloApplicationTest {

    @Test
    void yearsalary() {

        HelloApplication c =new HelloApplication();
        assertEquals(c.yearsalary(5000),60000);

    }
}

