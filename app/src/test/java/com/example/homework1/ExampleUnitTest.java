package com.example.homework1;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() {
        assertEquals(4, 2 + 2);
    }

    @Test
    public void login_isCorrect() {
        String username = "admin";
        String password = "password";

        assertEquals(username, MainActivity.usernameChecker(username));
        assertEquals(password, MainActivity.passwordChecker(password));
    }
}