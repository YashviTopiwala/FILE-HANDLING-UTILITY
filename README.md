# FILE-HANDLING-UTILITY

**COMPANY:** CODTECH IT SOLUTIONS 

**NAME:** YASHVI TOPIWALA  

**INTERN ID:** CTIS4485  

**DOMAIN:** Java Programming  

**DURATION:** 16 Weeks 

**MENTOR:** NEELA SANTOSH  


## DESCRIPTION OF TASK

The objective of this task was to implement file handling operations in Java. File handling is an important concept because it allows a program to store data permanently in a text file instead of temporary memory. In real-world applications, programs need to save user data, read stored information, and update records. This project demonstrates how Java can interact with files using built-in I/O classes.

The developed application is a console-based File Handling Utility. The program provides a menu-driven interface where the user can perform operations such as writing data to a file, reading data from a file, and modifying existing file content. The file used in this project is sample.txt.

The program uses Java’s java.io package which contains classes required for file operations. The FileWriter class is used to write text into the file. The FileReader and BufferedReader classes are used to read the file content line by line efficiently. The Scanner class is used to take input from the user. Exception handling using try-catch blocks is implemented to prevent the program from crashing during errors such as missing files or invalid input.

In the write operation, the user enters text which gets stored inside the file. In the read operation, the program opens the file and displays the saved content. In the modify operation, the program searches for a specific word and replaces it with a new word entered by the user. The modification process works by reading the full file content, updating the text, and rewriting it back into the file.

This task helped in understanding how permanent data storage works in Java applications and how files can be manipulated programmatically.

🧠 CONCEPTS USED
Operation	Class Used
Write File	FileWriter
Read File	BufferedReader + FileReader
Modify File	Read + Rewrite
User Input	Scanner
Error Handling	Try-Catch (IOException)
📂 PROJECT STRUCTURE

FileHandlingUtility/
├── FileUtility.java
├── sample.txt
└── README.md

⚙️ FEATURES

1. Write text into a file
2. Read text from a file
3. Modify existing file content
4. Menu-driven console program
5. Exception handling implemented

💻 TECHNOLOGIES / TOOLS USED

Java (JDK 8+)
java.io package
FileWriter
FileReader
BufferedReader
Scanner Class
Command Prompt / PowerShell
Git & GitHub

▶️ HOW TO RUN
Compile

javac FileUtility.java

Run

java FileUtility

🧪 SAMPLE OUTPUT

Writing:
Enter content to write: Hello Internship Task
File written successfully.

Reading:
File Content:
Hello Internship Task

Modifying:
Enter text to replace: Internship
Enter new text: Java
File modified successfully.

Final File:
Hello Java Task

📘 LEARNING OUTCOME

Understanding Java file handling

Reading and writing text files

Modifying stored data

Handling runtime errors using exception handling

Working with menu-driven programs
