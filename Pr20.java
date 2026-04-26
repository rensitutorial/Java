public class Pr20 {
    public static void main(String[] args) {
        try {
            if (args.length != 2) {
                System.out.println("Usage: java Pr20 <numerator> <denominator>");
                return;
            }

            int numerator = Integer.parseInt(args[0]);
            int denominator = Integer.parseInt(args[1]);

            int result = numerator / denominator;

            System.out.println("Numerator: " + numerator);
            System.out.println("Denominator: " + denominator);
            System.out.println("Result: " + result);

        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed.");
        } catch (NumberFormatException e) {
            System.out.println("Error: Please enter valid integer values.");
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }
}

