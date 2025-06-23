package Employeajava;
public class Employee {
    public int empNumber;
    public String empName;
    public String empJob;
    private String empPwd;
    public int empDeptNo;

    // public Employee(int empNumber, String empName, String empJob, String empPwd, int empDeptNo) {
    //     this.empNumber = empNumber;
    //     this.empName = empName;
    //     this.empJob = empJob;
    //     this.empPwd = empPwd;
    //     this.empDeptNo = empDeptNo;
    // }
    public void initializeEmp(){
        System.out.println("Default method");
        empDeptNo=39;
        empJob="Java developer";
        empName="Saiteja";
        empNumber=76714428;
        empPwd = "password";
    }
    public void initializeEmp(String Epass , String Ename , int Enum , int Edeptno , String Ejob){
        empDeptNo = Edeptno;
        empJob = Ejob;
        empName = Ename;
        empNumber = Enum;
        empPwd = Epass;
    }

    private void printLine(int noOfTimes) {
        for (int i = 0; i < noOfTimes; i++) {
            System.out.print("*");
        }
        System.out.println();
    }


    

    public void printEmpStmt() {
        printLine(10);
        System.out.println("Employee Number: " + empNumber);
        System.out.println("Employee Name: " + empName);
        System.out.println("Employee Job: " + empJob);
        System.out.println("Employee Dept No: " + empDeptNo);
        printLine(10);
    }

    public static void main(String[] args) {
        // Employee emp = new Employee(101, "Sai Teja", "Developer", "pass123", 10);
        // emp.printEmpStmt();
    }
}
