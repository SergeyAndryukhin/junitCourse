package org.junitcourse;

import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("AppTest")
public class AppTest  {

    @Test
    @DisplayName("Should always pass")
    public void testApp() {
        assertTrue(true);
    }
}
