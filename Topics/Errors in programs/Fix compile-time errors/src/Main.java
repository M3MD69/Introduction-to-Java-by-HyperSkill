import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final Scanner INPUT = new Scanner(System.in);

        final String FIRST_LINE = INPUT.nextLine();
        final String SECOND_LINE = INPUT.nextLine();

        System.out.printf(
                "%s%n%s",
                SECOND_LINE,
                FIRST_LINE
        );
    }
}