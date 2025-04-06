import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        final Scanner INPUT = new Scanner(System.in);
        final int NUMBER = INPUT.nextInt();
        System.out.print(((NUMBER + 1) * NUMBER + 2) * NUMBER + 3);
    }
}