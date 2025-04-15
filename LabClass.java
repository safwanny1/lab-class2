import java.util.*;
/**
 * The LabClass class represents an enrolment list for one lab class. It stores
 * the time, room and participants of the lab, as well as the instructor's name.
 * 
 * @author Michael Kölling and David Barnes
 * @version 2016.02.29
 */

public class LabClass
{
    private Instructor instructor;
    private String room;
    private String timeAndDay;
    private ArrayList<Student> students;
    
    /**
     * Create a LabClass with a maximum number of enrolments. All other details
     * are set to default values.
     */
    public LabClass(String roomName, String time)
    {
       room = roomName;
       timeAndDay = time;
       students = new ArrayList<>();
    }

    /**
     * Add a student to this LabClass.
     */
    public void enrollStudent(Student student)
    {
        students.add(student);
    }

    /**
     * Set the name of the instructor for this LabClass.
     */
    public void setInstructor(Instructor labInstructor)
    {
        instructor = labInstructor;
    }
    
    public void printDetails() 
    {
        System.out.println("Lab Class in Room: " + room + ", at " + timeAndDay);
        
        if (instructor != null) 
        {
            System.out.println("Instructor:");
            instructor.printDetails();
        } else {
            System.out.println("No instructor assigned yet.");
        }
        
        System.out.println("Enrolled Students:");
        for (Student student : students) 
        {
            student.printDetails();
            System.out.println();
        }
    }
    
    public Instructor getInstructor() 
    {
        return instructor;
    }

    public int getStudentCount() 
    {
        return students.size();
    }
}