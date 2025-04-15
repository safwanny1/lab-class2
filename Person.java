/**
asdasdasd * Common base class for both Student and Instructor.
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
