import java.util.Scanner;

public class Exp1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int choice;
        int seats = 7;
        boolean ticketConfirmed = false;

        do {
            System.out.println("\n Welcome to ticket booking system");
            System.out.println("1. Book Ticket");
            System.out.println("2. Cancel Ticket");
            System.out.println("3. Check Status");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    if (seats > 0) {
                        System.out.print("Enter number of tickets to book:");
                        int f=sc.nextInt();
                        seats=seats-f;
                        ticketConfirmed = true;
                        System.out.println("Ticket Booked Successfully!");
                        System.out.println("Remaining seats: " + seats);
                    } else {
                        System.out.println("No seats available. Booking not allowed.");
                    }
                    break;

                case 2:
                    if (ticketConfirmed) {
                        System.out.print("Enter number of tickets to cancel:");
                        int c=sc.nextInt();
                        seats=seats+c;
                        ticketConfirmed = false;
                        System.out.println("Ticket Cancelled Successfully!");
                        System.out.println("Available seats: " + seats);
                    } else {
                        System.out.println("No ticket to cancel!");
                    }
                    break;

                case 3:
                    if (ticketConfirmed) {
                        System.out.println("Status: Ticket Confirmed");
                    } else {
                        System.out.println("Status: No Active Booking");
                    }
                    break;

                case 4:
                    System.out.println("Thank you! Exiting system...");
                    break;

                default:
                    System.out.println("Invalid menu choice! Please try again.");
            }

        } while (choice != 4);

        sc.close();
    }
}