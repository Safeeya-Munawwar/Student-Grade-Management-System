//@author Shafiya Munawwar
package studentgrademanagementsystem;
import java.util.Scanner;
//Main class to run the application
public class StudentGradeManagementSystem {
    //Main method to start the program
    public static void main(String[] args) {
        School school = new School(); //Instatntiate the School class to manage students and grade
        Scanner newObject = new Scanner (System.in); //Scanner for user input
        while (true)
        {
            //Infinite loop to display the the main menu
            System.out.println("----------------------------------------------------");
            System.out.println("Student Grade Management System");
            System.out.println("----------------------------------------------------");
            System.out.println("1. Student Management");
            System.out.println("2. Grade Management");
            System.out.println("3. Display Information");
            System.out.println("4. Exit");
            System.out.println("----------------------------------------------------");
            System.out.println("Choose an Option");
            
            int choice = newObject.nextInt();
            
            //Handle different menu options using a switch statement
            switch (choice)
            {
                case 1:
                    school.manageStudents(); //Call manageStudents method from the School class
                    break;
                case 2:
                    school.manageGrades(); //Call manageGrades method from the School class 
                    break;
                case 3:
                    school.displayInformation(); //Call manageStudents method from the School class
                    break;
                case 4:
                    System.out.println("Exiting....");
                    System.exit(0); //Exit the program
                default:
                    System.out.println("Invalid choice. Please try again."); //Handle invalid choices
            }
        }
    }
    
}
