import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner sc = new Scanner(System.in);

        // Read the integer
        int age = sc.nextInt();

        // Write your code here to determine the life stage based on the input age
        // You should use if...else if...else statement
        // Then, print out the appropriate message
        if (age <= 12)
            System.out.print("Child");
        else if (age <= 17)
            System.out.print("Teenager");
        else if (age <= 59)
            System.out.print("Adult");
        else
            System.out.print("Senior Citizen");

        sc.close();
    }
}