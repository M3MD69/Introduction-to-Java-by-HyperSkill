import java.util.Scanner;

public class Main {

    /**
     * The method calculates the sum of integers in a given range
     *
     * @param from inclusive
     * @param to   exclusive
     * @return the sum (long)
     */
    public static long sumInRange(int from, int to) {
        long sum = 0;
        while (from < to)
            sum += from++;
        return sum;
    }

    /* Do not change code below */
    public static void main(String[] args) {
        final Scanner SCANNER = new Scanner(System.in);

        int from = SCANNER.nextInt();
        int to = SCANNER.nextInt();

        System.out.println(sumInRange(from, to));
    }
}
