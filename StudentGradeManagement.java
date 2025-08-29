import java.util.Scanner;

class Student {
    String name;
    int[] marks = new int[3]; // marks for 3 subjects
    double average;
    char grade;

    // Method to calculate average
    void calculateAverage() {
        int sum = 0;
        for (int mark : marks) {
            sum += mark;
        }
        average = sum / 3.0;
    }

    // Method to calculate grade based on average
    void calculateGrade() {
        if (average >= 75) {
            grade = 'A';
        } else if (average >= 60) {
            grade = 'B';
        } else if (average >= 40) {
            grade = 'C';
        } else {
            grade = 'F'; // Fail
        }
    }

    // Display student report
    void displayReport() {
        System.out.println("\n---- Student Report ----");
        System.out.println("Name: " + name);
        System.out.println("Marks: ");
        for (int i = 0; i < marks.length; i++) {
            System.out.println(" Subject " + (i+1) + ": " + marks[i]);
        }
        System.out.println("Average: " + average);
        System.out.println("Grade: " + grade);
    }
}

public class StudentGradeManagement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Student student = new Student();

        // Input student name
        System.out.print("Enter student name: ");
        student.name = sc.nextLine();

        // Input marks for 3 subjects
        for (int i = 0; i < 3; i++) {
            System.out.print("Enter marks for Subject " + (i+1) + " (out of 100): ");
            student.marks[i] = sc.nextInt();
        }

        // Process calculations
        student.calculateAverage();
        student.calculateGrade();

        // Display report
        student.displayReport();

        sc.close();
    }
}
