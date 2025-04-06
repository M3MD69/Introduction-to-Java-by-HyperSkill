import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        final Scanner INPUT = new Scanner(System.in);
        double a = INPUT.nextDouble();
        double b = INPUT.nextDouble();
        double c = INPUT.nextDouble();
        double d = INPUT.nextDouble();
        System.out.print(a * 10.5 + b * 4.4 + (c + d) / 2.2);
    }
}