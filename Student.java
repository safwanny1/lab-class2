/**
 * The Student class represents a student in a student administration system.
 * It holds the student details relevant in our context.
 * 
 * @author Michael Kölling and David Barnes
 * @version 2016.02.29
 */

public class Student extends Person
{
    // the student's full name
    private String studentID;
    // the amount of credits for study taken so far
    private int credits;

    /**
     * Create a new student with a given name and ID number.
     */
    public Student(String fullName, String emailAddress, String id)
    {
        super(fullName, emailAddress);
        studentID = id;
        credits = 0;
    }

    /**
     * Add some credit points to the student's accumulated credits.
     */
    public void addCredits(int additionalPoints)
    {
        credits += additionalPoints;
    }

    /**
     * Return the number of credit points this student has accumulated.
     */
    public int getCredits()
    {
        return credits;
    }

    /**
     * Print the student's name and ID number to the output terminal.
     */
    public void printDetails()
    {
        super.printDetails();
        System.out.println("Student ID: " + studentID + ", Credits: " + credits);
    }
}
