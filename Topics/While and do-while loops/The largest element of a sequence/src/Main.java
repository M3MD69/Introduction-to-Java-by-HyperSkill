import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        int largestNumber = 0;

        while (true) {
            int currentNumber = inputScanner.nextInt();
            if (currentNumber == 0)
                break;
            if (currentNumber > largestNumber)
                largestNumber = currentNumber;
        }

        System.out.println(largestNumber);
    }
}
