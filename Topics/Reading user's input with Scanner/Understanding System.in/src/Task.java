import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        final Scanner INPUT = new Scanner(System.in);
        final String FIRST_LINE = INPUT.nextLine();
        final String SECOND_LINE = INPUT.nextLine();
        System.out.print(String.join("\n", FIRST_LINE.split(" ")));
        System.out.print(String.join("\n", SECOND_LINE.split(" ")));
    }
}
