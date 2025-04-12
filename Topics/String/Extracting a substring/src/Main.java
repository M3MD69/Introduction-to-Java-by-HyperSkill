import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        final Scanner INPUT = new Scanner(System.in);
        final String TEXT = INPUT.next();
        final int START_INDEX = INPUT.nextInt();
        final int END_INDEX = INPUT.nextInt();
        System.out.print(TEXT.substring(START_INDEX, END_INDEX + 1));
    }
}