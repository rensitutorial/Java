class Employee {
    String name = "Rency";
    String department = "IT";

    void displayDetails() {
        System.out.println("Employee Name: " + name);
        System.out.println("Department: " + department);
    }
}

class Manager extends Employee {
    int teamSize = 10;
    String project = "AI System";

    void displayDetails() {
        System.out.println("Manager Name: " + name);
        System.out.println("Department: " + department);
        System.out.println("Team Size: " + teamSize);
        System.out.println("Project: " + project);
    }
}

public class Pr15 {
    public static void main(String[] args) {
        Employee e = new Employee();
        e.displayDetails();

        Employee m = new Manager();
        m.displayDetails();
    }
}
//output: Employee Name: Rency
//Department: IT
//Manager Name: Rency
//Department: IT
//Team Size: 10
//Project: AI System
