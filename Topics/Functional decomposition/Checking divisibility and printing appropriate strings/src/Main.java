import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt(); // Read an integer from user

        // Check divisibility and print corresponding result
        if (isDivByThreeAndFive(num)) {
            System.out.println("FizzBuzz");
        } else if (isDivByThree(num)) {
            System.out.println("Fizz");
        } else if (isDivByFive(num)) {
            System.out.println("Buzz");
        } else {
            System.out.println("None");
        }
    }

    // Checks if the number is divisible by 3
    public static boolean isDivByThree(int n) {
        return n % 3 == 0;
    }

    // Checks if the number is divisible by 5
    public static boolean isDivByFive(int n) {
        return n % 5 == 0;
    }

    // Checks if the number is divisible by both 3 and 5
    public static boolean isDivByThreeAndFive(int n) {
        return n % 3 == 0 && n % 5 == 0;
    }
}