import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        final Scanner INPUT = new Scanner(System.in);
        final String TEXT = INPUT.next();
        System.out.print(TEXT.replaceAll("a", "b"));
    }
}