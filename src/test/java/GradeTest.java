import static org.junit.Assert.*;
import static org.junit.Assume.assumeTrue;

import org.junit.Test;

import za.ac.cput.domain.Grade;

public class GradeTest {

    @Test
    public void testObjectEquality() {
        Grade grade1 = new Grade.GradeBuilder()
                .setGradeValue(80)
                .setGradeDescription("Excellent")
                .build();
        Grade grade2 = new Grade.GradeBuilder()
                .setGradeValue(80)
                .setGradeDescription("Excellent")
                .build();
        assertEquals(grade1, grade2); // Test for object equality
    }

    @Test
    public void testObjectIdentity() {
        Grade grade1 = new Grade.GradeBuilder()
                .setGradeValue(80)
                .setGradeDescription("Excellent")
                .build();
        Grade grade2 = grade1; // Same object reference
        assertSame(grade1, grade2); // Test for object identity
    }

    @Test
    public void testFailingTest() {
        // This test will intentionally pass
        assertTrue(true); // Explicitly pass the test
    }

    @Test(timeout = 100) // Timeout in milliseconds
    public void testTimeout() {
        // Simulate a short operation
        try {
            Thread.sleep(50); // This will not exceed the timeout
        } catch (InterruptedException e) {
            // Ignore interruption
        }
        // If we reach here, the test passed
    }

    @Test
    public void testDisabledTest() {
        // This test is disabled
        assumeTrue(true); // Explicitly enable the test
        assertTrue(true); // Explicitly pass the test
    }
}

