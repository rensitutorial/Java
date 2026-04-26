package student;

public class Student {
    protected int rollNo;
    protected String name;

    public Student(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }

    public void displayStudent() {
        System.out.println("Roll No: " + rollNo);
        System.out.println("Name: " + name);
    }
}

package exam;

import student.Student;

public class Pr19 extends Student {
    int marks1, marks2, marks3;

    public Pr19(int rollNo, String name, int marks1, int marks2, int marks3) {
        super(rollNo, name);
        this.marks1 = marks1;
        this.marks2 = marks2;
        this.marks3 = marks3;
    }

    public void displayResult() {
        int total = marks1 + marks2 + marks3;
        double average = total / 3.0;

        System.out.println("----- Mark Sheet -----");
        displayStudent();
        System.out.println("Marks1: " + marks1);
        System.out.println("Marks2: " + marks2);
        System.out.println("Marks3: " + marks3);
        System.out.println("Total: " + total);
        System.out.println("Average: " + average);
    }

    public static void main(String[] args) {
        Pr19 s = new Pr19(101, "Rency", 85, 90, 88);
        s.displayResult();
    }
}
//output:----- Mark Sheet -----
//Roll No: 101
//Name: Rency
//Marks1: 85
//Marks2: 90
//Marks3: 88
//Total: 263
//Average: 87.66666666666667
