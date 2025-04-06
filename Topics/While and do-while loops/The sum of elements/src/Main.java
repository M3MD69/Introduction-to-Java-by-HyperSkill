import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        final Scanner INPUT = new Scanner(System.in);
        int sum = 0;
        int currentNumber = INPUT.nextInt();
        while (currentNumber != 0) {
            sum += currentNumber;
            currentNumber = INPUT.nextInt();
        }
        System.out.print(sum);
    }
}
