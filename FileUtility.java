import java.io.*;
import java.util.*;
import java.io.*;
import java.util.Scanner;

public class FileUtility {

    // Method to write data to file
    public static void writeFile(String filename, String content) {
        try {
            FileWriter writer = new FileWriter(filename);
            writer.write(content);
            writer.close();
            System.out.println("File written successfully.");
        } catch (IOException e) {
            System.out.println("Error writing file: " + e.getMessage());
        }
    }

    // Method to read data from file
    public static void readFile(String filename) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(filename));
            String line;
            System.out.println("\nFile Content:");
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            reader.close();
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }

    // Method to modify file (replace text)
    public static void modifyFile(String filename, String oldText, String newText) {
        try {
            File file = new File(filename);
            BufferedReader reader = new BufferedReader(new FileReader(file));
            StringBuilder content = new StringBuilder();
            String line;

            while ((line = reader.readLine()) != null) {
                content.append(line.replace(oldText, newText)).append("\n");
            }
            reader.close();

            FileWriter writer = new FileWriter(file);
            writer.write(content.toString());
            writer.close();

            System.out.println("File modified successfully.");
        } catch (IOException e) {
            System.out.println("Error modifying file: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String filename = "sample.txt";

        System.out.println("=== File Handling Utility ===");

        System.out.println("1. Write to File");
        System.out.println("2. Read File");
        System.out.println("3. Modify File");
        System.out.print("Choose option: ");

        int choice = scanner.nextInt();
        scanner.nextLine();

        switch (choice) {
            case 1:
                System.out.print("Enter content to write: ");
                String content = scanner.nextLine();
                writeFile(filename, content);
                break;

            case 2:
                readFile(filename);
                break;

            case 3:
                System.out.print("Enter text to replace: ");
                String oldText = scanner.nextLine();
                System.out.print("Enter new text: ");
                String newText = scanner.nextLine();
                modifyFile(filename, oldText, newText);
                break;

            default:
                System.out.println("Invalid choice.");
        }

        scanner.close();
    }
}
