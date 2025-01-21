//@author Shafiya Munawwar
package studentgrademanagementsystem;
import java.util.HashMap;
import java.util.Map;
//Class to represent a student
class Student {
    
    //Define private fields for student name, id, and grades
    private String name;
    private int id;
    private Map<String, Integer> subjectsAndGrades;
    
    //Constructor to initialize student name and id, and an empty map for subjects and grades
    public Student(String name, int id)
    {
        this.name = name;
        this.id = id;
        this.subjectsAndGrades = new HashMap<>(); //Initialize with an empty map
    }
    
    //Getter for Name
    public String getName()
    {
        return name;
    }
    
    //Getter for Id
    public int getId()
    {
        return id;
    }
    
    //Setter for Name
    public void setName(String name)
    {
        this.name = name;
    }
    
    //Method to add or update grades for subjects 
    public void setGrades(String subject, int grade)
    {
        this.subjectsAndGrades.put(subject, grade);
    }
    
    //Method to calculate the average grade
    public double calculateAverageGrade()
    {
        //Check if there are no grades
        if (subjectsAndGrades.isEmpty())
        {
            return 0;
        }
        int sum = 0;
        //Iterate through map values to calculate sum
        for (int grade : subjectsAndGrades.values())
        {
            sum += grade;
        }
        //Calculate average by deviding sum by number of grades
        return (double) sum / subjectsAndGrades.size();
    }
    
    //Override toString method to provide a string representation of the student
    @Override
    public String toString()
    {
        StringBuilder sb = new StringBuilder();
        sb.append("Student: [ Name = ").append(name).append(", Id = ").append(id).append(", Subjects & Grades = ");
        //Append each subject and grade to the string
        for (Map.Entry < String, Integer > entry : subjectsAndGrades.entrySet()){
            sb.append(entry.getKey()).append(":").append(entry.getValue()).append(", ");          
        }
    sb.append("]");
    return sb.toString();
    }
}
