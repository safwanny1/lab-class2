/**
 * Parent class for both Student and Instructor containing 
 * shared variables and methods like name, email and print details
 * 
 * @author Safwan C
 * @version 2025.04.15
 */
public class Person 
{
    private String name;
    private String email;

    public Person(String fullName, String emailAddress) 
    {
        name = fullName;
        email = emailAddress;
    }

    public String getName() 
    {
        return name;
    }

    public String getEmail() 
    {
        return email;
    }

    public void printDetails() 
    {
        System.out.println("Name: " + name + ", Email: " + email);
    }
}
