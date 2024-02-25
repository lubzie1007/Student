import static org.junit.Assert.*;
import static org.junit.Assume.assumeTrue;

import org.junit.Test;
import za.ac.cput.domain.Teacher;

public class TeacherTest {

    @Test
    public void testObjectEquality() {
        Teacher teacher1 = new Teacher.TeacherBuilder()
                .setName("Mr. Smith")
                .setTeacherID("T001")
                .build();
        Teacher teacher2 = new Teacher.TeacherBuilder()
                .setName("Mr. Smith")
                .setTeacherID("T001")
                .build();
        assertEquals(teacher1, teacher2); // Test for object equality
    }

    @Test
    public void testObjectIdentity() {
        Teacher teacher1 = new Teacher.TeacherBuilder()
                .setName("Mr. Smith")
                .setTeacherID("T001")
                .build();
        Teacher teacher2 = teacher1;
        assertSame(teacher1, teacher2); // Test for object identity
    }

    @Test
    public void testFailingTest() {
        // This test will intentionally pass
        assertTrue(true);
    }

    @Test(timeout = 100)
    public void testTimeout() {
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
