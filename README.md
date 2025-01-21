STUDENT GRADE MANAGEMENT SYSTEM (SGMS)
DESCRIPTION
The Student Grade Management System is a Java-based console application designed to efficiently manage student data and grades. It provides features to:

Add, update, and remove student information.
Manage grades for multiple subjects.
Calculate average grades.
The application has an intuitive, menu-driven interface for seamless user interaction.

FEATURES
MAIN MENU OPTIONS
STUDENT MANAGEMENT

Add new students.
Update existing student information.
Remove students from the system.
View all student records.
GRADE MANAGEMENT

Assign grades to specific subjects for students.
Add multiple subjects and their grades to a student's record.
DISPLAY INFORMATION

View detailed student information, including subjects, grades, and average scores.
EXIT

Safely terminate the application.
CLASSES AND RESPONSIBILITIES
1. STUDENTGRADEMANAGEMENTSYSTEM (MAIN CLASS)
Serves as the application's entry point.
Displays the main menu and processes user input.
Interfaces with the School class to execute core functionalities.
2. STUDENT CLASS
Represents individual student data.

FIELDS:
name: Stores the student's name.
id: Stores the student's unique ID.
subjectsAndGrades: A HashMap to associate subjects with their grades.
METHODS:
Getters and Setters for name and id.
setGrades(String subject, int grade): Adds or updates grades for a subject.
calculateAverageGrade(): Calculates and returns the average grade.
toString(): Provides a formatted representation of the student's details, including their grades.
3. SCHOOL CLASS
Manages the list of students and their associated grades.

METHODS:
STUDENT MANAGEMENT:

addStudent(): Adds a new student with their name and unique ID.
updateStudent(): Updates a student's name using their ID.
removeStudent(): Removes a student from the system by their ID.
viewStudents(): Displays all students, including their subjects and grades.
GRADE MANAGEMENT:

manageGrades(): Assigns or updates grades for subjects linked to a specific student.
DISPLAY INFORMATION:

displayInformation(): Shows detailed student records, including average grades.
CODE FLOW
APPLICATION START

Displays the main menu.
User selects an option.
OPTION EXECUTION

Student Management: Navigate to a submenu for adding, updating, removing, or viewing students.
Grade Management: Assign or modify grades for students.
Display Information: List all students with their details and average grades.
USER INPUT HANDLING

Inputs are processed using a Scanner object.
Validations ensure smooth operation and error-free execution.
TERMINATION

Program continues running until the user selects the "Exit" option.
KEY FUNCTIONALITIES
ADDING STUDENTS
Prompts for the student's name and unique ID.
Adds the new student to the list.
UPDATING STUDENT INFORMATION
Prompts for the student ID.
Updates the name of the student if the ID exists.
REMOVING STUDENTS
Prompts for the student ID.
Removes the student from the system.
Handles errors if the ID does not exist.
MANAGING GRADES
Prompts for the student ID.
Allows entering multiple subjects with corresponding grades.
DISPLAYING INFORMATION
Lists each student's name, ID, subjects, grades, and their average grade.
LIMITATIONS AND FUTURE ENHANCEMENTS
CURRENT LIMITATIONS
DATA PERSISTENCE: The system does not save data; all records are lost when the application exits.
VALIDATION: Minimal checks during student addition (e.g., no validation for duplicate IDs).
FUTURE ENHANCEMENTS
Implement a database or file system for persistent data storage.
Add validation to ensure unique student IDs during addition.
Improve the user interface for better interaction (e.g., graphical UI).
AUTHOR
SHAFIYA MUNAWWAR
GitHub Profile: Shafiya-Munawwar0036

