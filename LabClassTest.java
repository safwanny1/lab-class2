import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

/**
 * JUnit test class for LabClass without using System.out redirection.
 */
public class LabClassTest {
    private LabClass lab;
    private Instructor instructor;
    private Student student1;
    private Student student2;

    @Before
    public void setUp() {
        lab = new LabClass("Room 101", "Monday 10 AM");
        instructor = new Instructor("Dr. Smith", "smith@university.edu", "Office 12B");
        student1 = new Student("Alice", "alice@school.edu", "S123");
        student2 = new Student("Bob", "bob@school.edu", "S124");

        lab.setInstructor(instructor);
        lab.enrollStudent(student1);
        lab.enrollStudent(student2);
    }

    @Test
    public void testInstructorAssignment() {
        assertNotNull("Instructor should be assigned.", lab.getInstructor());
        assertEquals("Instructor name mismatch.", "Dr. Smith", lab.getInstructor().getName());
        assertEquals("Instructor office mismatch.", "Office 12B", lab.getInstructor().getOfficeNumber());
    }

    @Test
    public void testStudentEnrollmentCount() {
        assertEquals("Student count mismatch.", 2, lab.getStudentCount());

        Student student3 = new Student("Charlie", "charlie@school.edu", "S125");
        lab.enrollStudent(student3);

        assertEquals("Student count mismatch after adding another student.", 3, lab.getStudentCount());
    }

    @Test
    public void testStudentCreditsFunctionality() {
        student1.addCredits(3);
        student1.addCredits(2);
        assertEquals("Student credits not incremented correctly.", 5, student1.getCredits());
    }
}
