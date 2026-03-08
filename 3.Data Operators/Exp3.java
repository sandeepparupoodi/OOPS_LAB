import java.util.Scanner;
public class Exp3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int a = sc.nextInt();
        System.out.print("Do you have a license? (true/false): ");
        boolean l = sc.nextBoolean();
        System.out.println();
        if (a >= 18 && l) {
            System.out.println("You can drive!");
        } else {
            System.out.println("You cannot drive.");
        }
        if (a < 18 || l) {
            System.out.println("You need age 18+ and a license.");
        }
        boolean m = !(a >= 18);
        System.out.println("Is minor? " + m);        
        sc.close();
    }
}