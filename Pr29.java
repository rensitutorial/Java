import java.util.*;

public class Pr29 {
    public static void main(String[] args) {
        ArrayList<Integer> marks = new ArrayList<Integer>();

        marks.add(85);
        marks.add(90);
        marks.add(78);
        marks.add(88);
        marks.add(95);

        System.out.println("Student Marks:");
        for (int m : marks) {
            System.out.println(m);
        }

        System.out.println("Highest Marks: " + Collections.max(marks));
        System.out.println("Lowest Marks: " + Collections.min(marks));
    }
}
//output:Student Marks:
//85
//90
//78
//88
//95
//Highest Marks: 95
//Lowest Marks: 78
