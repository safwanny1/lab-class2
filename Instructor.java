public class Instructor extends Person 
{
    private String officeNumber;

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
