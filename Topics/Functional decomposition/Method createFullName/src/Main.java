import java.util.Scanner;

class Name {
    public static void main(String[] args) {
        final Scanner INPUT = new Scanner(System.in);
        System.out.print(createFullName(INPUT.next(), INPUT.next()));
    }

    public static String createFullName(
            final String FIRST_NAME,
            final String SECOND_NAME
    ) {
        return FIRST_NAME + " " + SECOND_NAME;
    }
}