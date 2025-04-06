import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Use a Scanner to read user input
        final Scanner INPUT = new Scanner(System.in);

        // Read the number of apples from the user
        final int COUNT_OF_APPLES = INPUT.nextInt();

        // Read the number of oranges from the user
        final int COUNT_OF_ORANGES = INPUT.nextInt();

        // Calculate the total number of fruits and print the result
        System.out.print(COUNT_OF_APPLES + COUNT_OF_ORANGES);
    }
}