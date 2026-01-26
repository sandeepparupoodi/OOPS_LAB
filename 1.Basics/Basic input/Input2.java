import java.util.Scanner;
public class Input2 {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.print("Enter gender:");
char gender = sc.next().charAt(0);
System.out.print("Enter age:");
int age = sc.nextInt();
System.out.print("Enter height:");
float height = sc.nextFloat();
System.out.print("Enter weight:");
double weight = sc.nextDouble();
System.out.print("Enter city:");
String city = sc.next();
System.out.println("Gender: " + gender);
System.out.println("Age: " + age);
System.out.println("Height: " + height);
System.out.println("Weight: " + weight);
System.out.println("City: " + city);
sc.close();
 }
}
