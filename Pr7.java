import java.util.Scanner;

class Employee {
    private String employeeName;
    private double employeeSalary;

    public void readEmployeeData() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Employee Name: ");
        employeeName = sc.nextLine();

        System.out.print("Enter Employee Salary: ");
        employeeSalary = sc.nextDouble();
    }

    public void displayEmployeeData() {
        System.out.println("Employee Name: " + employeeName);
        System.out.println("Employee Salary: " + employeeSalary);
    }
}

public class Pr7 {
    public static void main(String[] args) {
        Employee emp = new Employee();

        emp.readEmployeeData();
        emp.displayEmployeeData();
    }
}

//output: Enter Employee Name: Alice
//Enter Employee Salary: 45000
//Employee Name: Alice
//Employee Salary: 45000.0
