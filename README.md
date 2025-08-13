# **Student Grade Management System**

## **Description**
The **Student Grade Management System** is a **Java-based console application** designed to efficiently manage student data and grades. It provides features to:
- Add, update, and remove student information.
- Manage grades for multiple subjects.
- Calculate average grades.

The application has an **intuitive, menu-driven interface** for seamless user interaction.

## **Features**

### **Main Menu Options**

1. **Student Management**
   - Add new students.
   - Update existing student information.
   - Remove students from the system.
   - View all student records.

2. **Grade Management**
   - Assign grades to specific subjects for students.
   - Add multiple subjects and their grades to a student's record.

3. **Display Information**
   - View detailed student information, including subjects, grades, and average scores.

4. **Exit**
   - Safely terminate the application.

---

## **Classes and Responsibilities**

### **1. StudentGradeManagementSystem (Main Class)**
- Serves as the application's entry point.
- Displays the main menu and processes user input.
- Interfaces with the **School** class to execute core functionalities.

### **2. Student**
Represents individual student data.

#### **Fields:**
- **name**: Stores the student's name.
- **id**: Stores the student's unique ID.
- **subjectsAndGrades**: A `HashMap` to associate subjects with their grades.

#### **Methods:**
- Getters and Setters for `name` and `id`.
- `setGrades(String subject, int grade)`: Adds or updates grades for a subject.
- `calculateAverageGrade()`: Calculates and returns the average grade across all subjects.
- `toString()`: Provides a formatted representation of the student's details, including their grades.

### **3. School**
Manages the list of students and their associated grades.

#### **Methods:**
- **Student Management:**
   - `addStudent()`: Adds a new student with their name and unique ID.
   - `updateStudent()`: Updates a student's name using their ID.
   - `removeStudent()`: Removes a student from the system by their ID.
   - `viewStudents()`: Displays all students, including their subjects and grades.

- **Grade Management:**
   - `manageGrades()`: Assigns or updates grades for subjects linked to a specific student.

- **Display Information:**
   - `displayInformation()`: Shows detailed student records, including average grades.

---

## **Code Flow**

### **Application Start:**
- Displays the main menu.
- User selects an option.

### **Option Execution:**
- **Student Management**: Navigate to a submenu for adding, updating, removing, or viewing students.
- **Grade Management**: Assign or modify grades for students.
- **Display Information**: List all students with their details and average grades.

### **User Input Handling:**
- Inputs are processed using a `Scanner` object.
- Validations ensure smooth operation and error-free execution.

### **Termination:**
- Program continues running until the user selects the "Exit" option.

---

## **Key Functionalities**

### **Adding Students**
- Prompts for the student's name and unique ID.
- Adds the new student to the list.

### **Updating Student Information**
- Prompts for the student ID.
- Updates the name of the student if the ID exists.

### **Removing Students**
- Prompts for the student ID.
- Removes the student from the system.
- Handles errors if the ID does not exist.

### **Managing Grades**
- Prompts for the student ID.
- Allows entering multiple subjects with corresponding grades.

### **Displaying Information**
- Lists each student's name, ID, subjects, grades, and their average grade.

---

## Project Report
```bash
https://github.com/Shafiya-Munawwar0036/Student-Grade-Management-System/blob/main/Student%20Grade%20Management%20System%20Java%20Project.pdf
```

## **Limitations and Future Enhancements**

### **Current Limitations**
- **Data Persistence**: The system does not save data; all records are lost when the application exits.
- **Validation**: Minimal checks during student addition (e.g., no validation for duplicate IDs).

### **Future Enhancements**
- Implement a database or file system for persistent data storage.
- Add validation to ensure unique student IDs during addition.
- Improve the user interface for better interaction (e.g., graphical UI).

---

## Author
**Safeeya Munawwar**  
<p>
  <a href="https://www.linkedin.com/in/safeeya-munawwar" target="_blank">
    <img src="https://img.shields.io/badge/LinkedIn-0A66C2?style=for-the-badge&logo=linkedin&logoColor=white" alt="LinkedIn"/>
  </a>
  <a href="https://github.com/Safeeya-Munawwar" target="_blank">
    <img src="https://img.shields.io/badge/GitHub-181717?style=for-the-badge&logo=github&logoColor=white" alt="GitHub"/>
  </a>
  <a href="mailto:shafiyasha0036@gmail.com" target="_blank">
    <img src="https://img.shields.io/badge/Email-D14836?style=for-the-badge&logo=gmail&logoColor=white" alt="Email"/>
  </a>
  <a href="https://safeeya-munawwar-personal-portfolio.vercel.app/" target="_blank">
    <img src="https://img.shields.io/badge/Portfolio-0A66C2?style=for-the-badge&logo=firefox&logoColor=white" alt="Portfolio"/>
  </a>
</p>
