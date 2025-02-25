import java.util.Scanner;

public class FactorialCalculator {
    private static Scanner scanner = new Scanner(System.in);

    /**
     * Gets a valid non-negative integer from the user.
     * Continues to prompt until valid input is received.
     * @return a non-negative integer
     */
    public static int getNonNegativeInteger() {
        int number;
        while (true) {
            System.out.print("Enter a non-negative integer: ");
            try {
                number = Integer.parseInt(scanner.nextLine());
                if (number >= 0) {
                    return number;
                } else {
                    System.out.println("Error: Please enter a non-negative number.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Error: Please enter a valid integer.");
            }
        }
    }

    /**
     * Calculates the factorial of a non-negative integer.
     * @param n the number to calculate factorial for
     * @return the factorial of n
     */
    public static long calculateFactorial(int n) {
        // Handle base case
        if (n == 0) {
            return 1;
        }
        
        // Calculate factorial using a loop
        long factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        return factorial;
    }

    public static void main(String[] args) {
        // Get input from user
        int number = getNonNegativeInteger();
        
        // Calculate factorial
        long result = calculateFactorial(number);
        
        // Display result
        System.out.println("The factorial of " + number + " is: " + result);
        
        // Close scanner
        scanner.close();
    }
}

