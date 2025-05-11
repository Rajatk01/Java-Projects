# Java-Projects
# 💼 Employee Management System (Java + Swing + AWT + MySQL)

A **Minor Java Project** for managing employee data with a graphical user interface built using **Java Swing** and **AWT**, backed by a **MySQL database**. 

## ✨ Features

- 🔐 **User Login Authentication**
- ➕ Add New Employees
- 📝 **Update Existing Employee Details**
- ❌ Delete Employee Records
- 🔍 Search Employees by Name or ID
- 🧾 View All Employees in a Table
- 💾 Store and manage employee data in **MySQL Database**
- 🧠 Clean, modular code using OOP concepts (Classes, DAO pattern)

## 🛠️ Tech Stack

| Technology | Description                     |
|------------|---------------------------------|
| Java       | Programming Language            |
| Swing/AWT  | Frontend GUI Toolkit            |
| JDBC       | Java Database Connectivity      |
| MySQL      | Relational Database Management  |

## 🧱 Project Structure

'''EmployeeManagementSystem/
│
├── employee/
│ └── management/
│ └── system/
│
│ ├── SystemSplash.java # Splash screen on startup
│ ├── Login.java # Login screen and logic
│ ├── Conn.java # JDBC connection class
│ ├── Main_class.java # Main application entry point
│ ├── AddEmployee.java # UI/form to add new employees
│ ├── RemoveEmployee.java # UI to remove employees
│
│ ├── viewemployee/ # View and update employee records
│ │ ├── ViewEmployee.java # List employee records in a table
│ │ └── UpdateEmployee.java # Edit/update employee details
│
├── sql/
│ └── employee_db.sql # SQL schema and initial data

├── lib/
│ └── mysql-connector-java.jar # MySQL JDBC driver'''

Certainly! Here's a clear and professional workflow diagram (text-based) and description that outlines the flow of your Java Employee Management System — starting from the splash screen, going through login, and continuing to the main application.

+----------------------+
|  SystemSplash.java   |
| (Shows splash screen |
|   with title/logo)   |
+----------+-----------+
           |
           v
+----------------------+
|     Login.java       |
| (User enters ID & PW)|
+----------+-----------+
           |
           v
  +-----------------------------+
  | Validate Credentials in DB |
  |   using Conn.java + JDBC   |
  +-------------+--------------+
                |
      +---------+---------+
      |                   |
      v                   v
+-------------+     +------------------------+
| Credentials |     | Invalid Login Message  |
| Match DB?   | --> | (Stay on login screen) |
+-------------+     +------------------------+
      |
      v
+--------------------------+
|  Main_class.java         |
|  (Main dashboard loads)  |
|  Add / View / Remove     |
|  / Update employees      |
+--------------------------+

📝 Workflow Description

1. SystemSplash.java:
  . Displays a splash screen with “Employee Management System” and optionally a loading animation or delay.

2. Transition to Login.java:
  . After a few seconds, the splash screen closes, and the login window appears.

3. User Login Input:
 .  The user enters a username and password, which are submitted to the MySQL database.

4. Conn.java (JDBC Layer):
  . Establishes a connection with MySQL and verifies credentials from the users table.

5. Login Validation Logic:

  . If credentials match, the system opens the main application dashboard (Main_class.java).

  .  If they don’t match, an error message ("Invalid user ID or password") is shown, and the user stays on the login screen.

6. Main_class.java Dashboard:
   From here, the user can:

* ➕ Add a new employee (AddEmployee.java)

* 📋 View all employees (ViewEmployee.java)

* 📝 Update employee details (UpdateEmployee.java inside viewemployee/)

* ❌ Remove an employee (RemoveEmployee.java)


![Employee MainPage](https://github.com/user-attachments/assets/f5761b94-16e1-44fe-b39f-fb3ca4fbb4bc)
![Login page](https://github.com/user-attachments/assets/8ab23bc7-7c7e-4a5b-bd69-06ed389aebba)
![Database_emplyeemanagementTable](https://github.com/user-attachments/assets/5c788ddc-b77c-42db-80e0-612c77238d18)
![Main Page](https://github.com/user-attachments/assets/2526dafd-58e6-4ec4-9ede-e4a0d51bcc11)
![AddEmployee page](https://github.com/user-attachments/assets/8dbb7c6a-04ae-416b-9226-1789a1f8622f)
![Viewemployee Page](https://github.com/user-attachments/assets/a983799a-4c4e-428f-8357-220e5c3dbafb)
![Update page](https://github.com/user-attachments/assets/f0d28d16-e899-4dde-89a7-2da943a86aaa)
![removeemployee Page](https://github.com/user-attachments/assets/9a4576e1-1ae1-46a2-8ccd-7b69fe773177)








