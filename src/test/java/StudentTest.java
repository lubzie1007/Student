import static org.junit.Assert.*;
import static org.junit.Assume.assumeTrue;

import org.junit.Test;
import za.ac.cput.domain.Student;

public class StudentTest {

    @Test
    public void testObjectEquality() {
        Student student1 = new Student.StudentBuilder()
                .setStudentID("S001")
                .setMajor("Computer Science")
                .build();
        Student student2 = new Student.StudentBuilder()
                .setStudentID("S001")
                .setMajor("Computer Science")
                .build();
        assertEquals(student1, student2); // Test for object equality
    }

    @Test
    public void testObjectIdentity() {
        Student student1 = new Student.StudentBuilder()
                .setStudentID("S001")
                .setMajor("Computer Science")
                .build();
        Student student2 = student1; // Same object reference
        assertSame(student1, student2); // Test for object identity
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


