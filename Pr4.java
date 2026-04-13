import java.util.Scanner;

public class Pr4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter weight in pounds: ");
        double pounds = sc.nextDouble();

        System.out.print("Enter height in inches: ");
        double inches = sc.nextDouble();

        double weightKg = pounds * 0.45359237;
        double heightM = inches * 0.0254;

        double bmi = weightKg / (heightM * heightM);

        System.out.printf("BMI is: %.2f", bmi);

        
    }
}

//output: Enter weight in pounds: 150
//Enter height in inches: 65
//BMI is: 24.96
