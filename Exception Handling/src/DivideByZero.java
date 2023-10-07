import java.util.*;

public class DivideByZero {
    public static float quotient(int numerator, int denominator) throws ArithmeticException {
       if (denominator == 0) {
            throw new ArithmeticException("Division by zero is not allowed");
        }
        return (float) numerator / denominator;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        boolean continuedLoop = true;
        do {
            try {
                System.out.println("Enter numerator");
                int num = s.nextInt();
                System.out.println("Enter denominator");
                int den = s.nextInt();

                float result = quotient(num, den);
                System.out.println(result);
                continuedLoop = false;
            } catch (InputMismatchException e) {
                System.err.println("InputMismatchException: Please enter valid integers.");
                s.nextLine(); // Consume the invalid input
            } catch (ArithmeticException a) {
                System.err.println("ArithmeticException: " + a.getMessage());

            } finally
            {
                System.out.println("you are done");
            }
        } while (continuedLoop);
        s.close(); // Close the scanner when done
    }
}
