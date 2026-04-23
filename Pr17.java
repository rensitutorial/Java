interface Exam {
    boolean isPassed(int mark);
}

interface Classify {
    String getDivision(double average);
}

public class Pr17 implements Exam, Classify {

    @Override
    public boolean isPassed(int mark) {
        return mark >= 40;
    }

    @Override
    public String getDivision(double average) {
        if (average >= 60) {
            return "First Division";
        } else if (average >= 50) {
            return "Second Division";
        } else if (average >= 40) {
            return "Third Division";
        } else {
            return "Fail";
        }
    }

    public static void main(String[] args) {
        Pr17 result = new Pr17();

        int mark = 55;
        double average = 62.5;

        System.out.println("Mark: " + mark);
        System.out.println("Passed: " + result.isPassed(mark));
        System.out.println("Average: " + average);
        System.out.println("Division: " + result.getDivision(average));
    }
}
//output : Mark: 55
//Passed: true
//Average: 62.5
//Division: First Division
