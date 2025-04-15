/**
 * Class for Instructors with office number and extending attributes of the 
 * parent class
 * 
 * @author Safwan C
 * @version 2025.04.15
 */

public class Instructor extends Person 
{
    // Limited to instructors
    private String officeNumber;

    /**
     * Stores constructor parameters into super call and local variable.
     */
    public Instructor(String fullName, String emailAddress, String office)
    {
        super(fullName, emailAddress);
        officeNumber = office;
    }

    public String getOfficeNumber() 
    {
        return officeNumber;
    }

    public void printDetails() 
    {
        super.printDetails();
        System.out.println("Office: " + officeNumber);
    }
}
