import java.util.Scanner;

public class Main {
    public static void main(final String[] ARGUMENTS) {
        final Scanner INPUT = new Scanner(System.in);

        final String FIRST_WORD = INPUT.next(),
                SECOND_WORD = INPUT.next(),
                THIRD_WORD = INPUT.next();

        System.out.print(FIRST_WORD + SECOND_WORD + THIRD_WORD);
    }
}