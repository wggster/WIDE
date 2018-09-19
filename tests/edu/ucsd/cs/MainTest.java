package edu.ucsd.cs;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void main() {
        Main.main(new String[]{"arg1", "arg2"});
        assertTrue(true);
    }
}