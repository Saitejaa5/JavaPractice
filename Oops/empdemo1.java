package Employeajava;
import java.util.*;

public class empdemo1 {
    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.printEmpStmt();

        employee.empDeptNo = 39;
        employee.empJob = "Java Developer";
        employee.empName = "Saiteja";
        employee.empNumber = 32324573;
        employee.printEmpStmt();

        Employee employee2 = new Employee();
        employee2.empDeptNo = 34;
        employee2.empJob = "Backend Developer";
        employee2.empName = "Aman Singh";
        employee2.empNumber = 44354277;
        employee2.printEmpStmt();

        Employee employee3 = new Employee();

        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter Employee name:");
            String name = sc.nextLine();

            System.out.println("Enter Dept Number:");
            int deptNo = sc.nextInt();
            sc.nextLine();

            System.out.println("Enter Job:");
            String job = sc.nextLine();

            System.out.println("Enter Employee number:");
            int empNum = sc.nextInt();
            sc.nextLine();

            System.out.println("Enter Password:");
            String password = sc.nextLine();

            employee3.initializeEmp(password, name, empNum, deptNo, job);
            employee3.printEmpStmt();
        }
    }
}
