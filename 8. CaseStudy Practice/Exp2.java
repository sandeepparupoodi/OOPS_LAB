import java.util.Scanner;
public class Exp2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of items: ");
        int n = sc.nextInt();
        double finalTotal = 0;
        for (int i = 1; i <= n; i++) {
            System.out.println("\nItem " + i);
            System.out.print("Enter item name: ");
            sc.nextLine();
            String itemName = sc.nextLine();
            System.out.print("Enter price per item: ");
            double price = sc.nextDouble();
            System.out.print("Enter quantity: ");
            int quantity = sc.nextInt();
            double itemTotal = price * quantity;
            finalTotal += itemTotal;
            System.out.println("Total cost for " + itemName + " = " + itemTotal);
        }
        System.out.println("Final Total Bill Amount = " + finalTotal);
        sc.close();
    }
}