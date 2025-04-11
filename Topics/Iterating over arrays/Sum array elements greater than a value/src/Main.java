import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt(); // Read size of the array
        int[] arr = new int[size]; // Create array

        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt(); // Read each array element
        }

        int n = sc.nextInt(); // Read the number n
        int sum = 0;

        for (int i = 0; i < size; i++) {
            if (arr[i] > n) {
                sum += arr[i]; // Add to sum if element > n
            }
        }

        System.out.println(sum); // Print the result
    }
}
