import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class StudentRecord {
    public static void main(String[] args) {
        // Read input from file
        File inputFile = new File("input.txt");
        try {
            // Create a scanner object to read from the inputFile
            Scanner fileScanner = new Scanner(inputFile);
            // Read the first integer from the input file and store it in the id variable
            int id = fileScanner.nextInt();
            // Read the next string from the input file and store it in the name variable
            String name = fileScanner.next();
            // Read the next string from the input file and store it in the sex variable
            String sex = fileScanner.next();
            // Read the next integer from the input file and store it in the exam1 variable
            int exam1 = fileScanner.nextInt();
            // Read the next integer from the input file and store it in the exam2 variable
            int exam2 = fileScanner.nextInt();
            // Read the next integer from the input file and store it in the exam3 variable
            int exam3 = fileScanner.nextInt();

            // Check if student ID is between 111 and 999 (inclusive)
            if (id < 111 || id > 999) {
                System.out.println("Invalid student ID");
                return;
            }

            // Check if gender is either "M" or "F"
            if (!sex.equals("M") && !sex.equals("F")) {
                System.out.println("Invalid gender");
                return;
            }

            // Check if exam scores are between 0 and 100 (inclusive)
            if (exam1 < 0 || exam1 > 100 || exam2 < 0 || exam2 > 100 || exam3 < 0 || exam3 > 100) {
                System.out.println("Invalid exam score");
                return;
            }

            // Calculate average
            float average = (exam1 + exam2 + exam3) / 3.0f;

            // Output result
            System.out.printf("*~~< Stud Exam Report >~~*\n");
            // Output result
            System.out.printf("%-10s\t%s\t%d\t%d\t%d\t%d\t%.2f\t%s\n",
                    name, sex, id, exam1, exam2, exam3, average, (average >= 70.0f) ? "PASSED" : "FAILED");

            System.out.println("\n*< end >*");
            // Close the scanner object
            fileScanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("Input file not found");
        }
    }
}
