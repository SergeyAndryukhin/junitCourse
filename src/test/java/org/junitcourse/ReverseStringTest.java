package org.junitcourse;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@DisplayName("ReverseStringTest")
public class ReverseStringTest {

    @Test
    @DisplayName("Reverse test")
    public void testReverse() {
        String result = ReverseString.reverseString("hello");
        assertEquals("olleh", result);
    }

    @Test
    @DisplayName("Palindrome Test")
    public void testPalindrome() {
        boolean result = ReverseString.isPalindrome("perurep");
        assertTrue(result);
    }
}
