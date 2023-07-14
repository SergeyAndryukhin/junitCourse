package org.junitcourse;

public class ReverseString {

    public static String reverseString(String str) {
        char[] chars = str.toCharArray();
        int length = chars.length;

        for (int i = 0; i < length / 2; i++) {
            char temp = chars[i];
            chars[i] = chars[length - i - 1];
            chars[length - i - 1] = temp;
        }

        return new String(chars);
    }

    public static boolean isPalindrome(String str) {
        return str.equalsIgnoreCase(reverseString(str));
    }
}
