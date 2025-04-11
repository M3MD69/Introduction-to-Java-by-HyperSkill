import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = scanner.nextInt();          // Read array size
        int[] arr = new int[size];             // Create array

        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();        // Read array elements
        }

        int n = scanner.nextInt();             // Read first number
        int m = scanner.nextInt();             // Read second number

        boolean found = false;

        for (int i = 0; i < size - 1; i++) {
            // Check if n and m appear next to each other in any order
            if ((arr[i] == n && arr[i + 1] == m) || (arr[i] == m && arr[i + 1] == n)) {
                found = true;
                break;
            }
        }

        System.out.println(found);             // Output true or false
    }
}