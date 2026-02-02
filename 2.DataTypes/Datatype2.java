import java.util.Scanner;
public class Datatype2 {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
int a;
String b;
char c;
double d;
boolean e;
System.out.print("Enter Roll Number: ");
a = sc.nextInt();
sc.nextLine();
System.out.print("Enter Name: ");
b = sc.nextLine();
System.out.print("Enter Grade: ");
c = sc.next().charAt(0);
System.out.print("Enter Percentage: ");
d = sc.nextDouble();
e = d >= 80;        
        if (e) {
           System.out.println("Status:Pass");
        } else {
            System.out.println("Status:Fail");
        }
        sc.close();
    }
}