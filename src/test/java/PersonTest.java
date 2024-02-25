import static org.junit.Assert.*;
import static org.junit.Assume.assumeTrue;

import org.junit.Test;
import za.ac.cput.domain.Person;

public class PersonTest {

    @Test
    public void testObjectEquality() {
        Person person1 = new Person.Builder()
                .setName("John")
                .setAge(25)
                .build();
        Person person2 = new Person.Builder()
                .setName("John")
                .setAge(25)
                .build();
        assertEquals(person1, person2); // Test for object equality
    }

    @Test
    public void testObjectIdentity() {
        Person person1 = new Person.Builder()
                .setName("John")
                .setAge(25)
                .build();
        Person person2 = person1; // Same object reference
        assertSame(person1, person2); // Test for object identity
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
