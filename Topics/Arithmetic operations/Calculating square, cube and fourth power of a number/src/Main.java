import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        // Create a Scanner object to read input
        final Scanner INPUT = new Scanner(System.in);

        // Read the next integer
        final int NUMBER = INPUT.nextInt();

        // Compute and print the square of n
        System.out.println(NUMBER * NUMBER);

        // Compute and print the cube of n
        System.out.println(NUMBER * NUMBER * NUMBER);

        // Compute and print the fourth power of n
        System.out.println((int) Math.pow(NUMBER, 4));
    }
}