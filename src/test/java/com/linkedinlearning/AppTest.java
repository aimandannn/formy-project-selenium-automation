package com.linkedinlearning;

// The import for the Test annotation is now in the 'jupiter.api' package.
import org.junit.jupiter.api.Test;

// The import for assertions is also in a new package.
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Unit test for simple App.
 */
public class AppTest {
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue() {
        // The assertTrue method is now from the new Assertions class.
        assertTrue(true);
    }
}
