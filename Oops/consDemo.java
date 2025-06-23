package Employeajava;
import java.util.*;

class Student {
    int studentId;
    String studentName;
    String courseName;
    double courseCost;
    private String studentPwd;

    public Student(int studentId, String studentName, String courseName, double courseCost, String studentPwd) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.courseName = courseName;
        this.courseCost = courseCost;
        this.studentPwd = studentPwd;
    }

    public Student() {
        System.out.println("Default constructor called");
        studentId = 39;
        studentName = "Saiteja";
        courseName = "Full Stack Java";
        courseCost = 3000;
        studentPwd = "hihibi@123";
    }

    private void printLine(int noOfTimes) {
        for (int i = 0; i < noOfTimes; i++) {
            System.out.print("*");
        }
        System.out.println();
    }

    public void displayStudDetails() {
        printLine(10);
        System.out.println("Student ID: " + studentId);
        System.out.println("Student Name: " + studentName);
        System.out.println("Course Name: " + courseName);
        System.out.println("Course Cost: " + courseCost);
        printLine(10);
    }
}

public class consDemo {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.displayStudDetails();

        Student student2 = new Student(101, "Saiteja", "Java Full Stack", 50000, "HEll2131");
        student2.displayStudDetails();

        Student[] stuList = new Student[3];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < stuList.length; i++) {
            System.out.print("Student ID: ");
            int id = sc.nextInt();
            sc.nextLine();

            System.out.print("Student Name: ");
            String name = sc.nextLine();

            System.out.print("Course Name: ");
            String course = sc.nextLine();

            System.out.print("Course Cost: ");
            double cost = sc.nextDouble();
            sc.nextLine();

            System.out.print("Student Password: ");
            String pwd = sc.nextLine();

            stuList[i] = new Student(id, name, course, cost, pwd);
            System.out.println();
        }

        System.out.println("\n--- Student Details ---");
        for (Student s : stuList) {
            s.displayStudDetails();
        }

        sc.close();
    }
}
