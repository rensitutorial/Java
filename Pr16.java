interface Classify {
    String getDivision(double average);
}

public class Pr16 implements Classify {

    @Override
    public String getDivision(double average) {
        if (average >= 60) {
            return "First Division";
        } else {
            return "No Division";
        }
    }

    public static void main(String[] args) {
        Pr16 result = new Pr16();
        double avg = 65.5;
        System.out.println(result.getDivision(avg));
    }
}
// output : First Division



