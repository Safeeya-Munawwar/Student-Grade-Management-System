//@author Shafiya Munawwar
package studentgrademanagementsystem;
import java.util.ArrayList;
import java.util.Scanner;
//Class to represent a school managing students, and grades
class School {
    
    //Define a list to store students and a scanner for input
    private ArrayList<Student> students = new ArrayList<>();
    private Scanner newObject = new Scanner (System.in);
    
    //Method to manage students
    public void manageStudents()
    {
        while (true)
        {
            //Display the student management menu
            System.out.println("----------------------------------------------------");
            System.out.println("Student Management");
            System.out.println("----------------------------------------------------");
            System.out.println("1. Add Student");
            System.out.println("2. Update Student");
            System.out.println("3. Remove Student");
            System.out.println("4. View Students");
            System.out.println("5. Back to Main Menu");
            System.out.println("----------------------------------------------------");
            System.out.println("Choose an Option: ");
            
            int choice = newObject.nextInt();
            
            //Handle different menu options using a switch statement
            switch (choice)
            {
                case 1:
                    addStudent(); //Call addStudent method
                    break;
                case 2:
                    updateStudent(); //Call updateStudent method
                    break;
                case 3:
                    removeStudent(); //Call removeStudent method
                    break;
                case 4:
                    viewStudents(); //Call viewStudents method
                    break;
                case 5:
                    return; //Return to the main menu
                default:
                    System.out.println("Invalid choice. Please try again."); //Handle invalid choices
            }
        }
    }
    
    //Method to add a new student
    private void addStudent()
    {
        System.out.println("----------------------------------------------------");
        System.out.println("Enter Student Name: ");
        String name = newObject.next();
        System.out.println("Enter Student ID: ");
        int id = newObject.nextInt();
        //Add new students to the list
        students.add(new Student(name, id));
        System.out.println("Student Added Successfully.");
    }
    
    //Method to update an existing student's name
    private void updateStudent()
    {
        System.out.println("----------------------------------------------------");
        System.out.println("Enter Student ID to Update: ");
        int id = newObject.nextInt();
        //Iterate through students list to find the student by ID
        for (Student student : students)
        {
            if (student.getId() == id)
            {
                System.out.println("Enter New Name: ");
                String name = newObject.next();
                //Update student name
                student.setName(name);
                System.out.println("Student Updated Successfully.");
                return;
            }
        }
        //Handle case when student is not found
        System.out.println("Student Not Found.");
    }
    
    //Method to remove a student
    private void removeStudent()
    {
        System.out.println("----------------------------------------------------");
        System.out.println("Enter Student ID to Remove: ");
        int id = newObject.nextInt();
        //Remove student from the list by ID
        students.removeIf(student -> student.getId() == id);
        System.out.println("Student Removed Successfully.");
    }
    
    //Method to view all students
    private void viewStudents()
    {
        System.out.println("----------------------------------------------------");
        System.out.print("");
        //Iterate through students list and print each student 
        for (Student student : students)
        {
            System.out.println(student);
        }
    }
    
    //Method to manage grades
    public void manageGrades()
    {
        System.out.println("----------------------------------------------------");
        System.out.println("Enter Student ID to Add Grades: ");
        int id = newObject.nextInt();
        //Iterate through students list to find the student by ID
        for (Student student : students)
        {
            if (student.getId() == id)
            {
                System.out.println("Enter Number of Subjects: ");
                int subjects = newObject.nextInt();
                //Iterate to get grades for each subjects
                for (int x = 0; x < subjects; x++) 
                {
                    System.out.println("Enter Subject Name: ");
                    String subject = newObject.next();
                    System.out.println("Enter Grade for Subject: ");
                    int grade = newObject.nextInt();
                    //Set grades for the student
                    student.setGrades(subject, grade);
                } 
                System.out.println("Grades Added Successfully.");
                return;
            }
        }
        //Handle case when student is not found
        System.out.println("Student Not Found.");
    }
    
    //Method to display student information
    public void displayInformation()
    {
        System.out.println("----------------------------------------------------");
        System.out.println("Student Information: ");
        //Iterate through students list and print each student and their average grade
        for (Student student : students)
        {
            System.out.println(student);
            System.out.println("Average Grade: " + student.calculateAverageGrade());
        }
    }
}
