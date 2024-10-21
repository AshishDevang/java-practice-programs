import java.util.Scanner;

public class Diamond_print {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Java Program to Print Diamond Pattern
        System.out.println("enter the digit");
        int digit = sc.nextInt();
        for (int i = 1; i <= digit; i++) {

            for (int s = 1; s <= digit - i; s++) {
                System.out.print(" ");

            }
            for (int j = 1; j <= i * 2 - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = digit - 1; i >= 1; i--) {

            for (int s = 1; s <= digit - i; s++) {
                System.out.print(" ");

            }
            for (int j = 1; j <= i * 2 - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
