import java.util.Scanner;
public class Input1 
{
public static void main(String[] args) 
{
Scanner sc = new Scanner(System.in);
System.out.print("Enter employee code:");
char code = sc.next().charAt(0);
System.out.print("Enter employee ID:");
int id = sc.nextInt();
System.out.print("Enter working hours:");
float hours = sc.nextFloat();
System.out.print("Enter salary:");
double salary = sc.nextDouble();
System.out.print("Enter employee name:");
String name = sc.next();
System.out.println("Code: " + code);
System.out.println("ID: " + id);
System.out.println("Hours: " + hours);
System.out.println("Salary: " + salary);
System.out.println("Name: " + name);
sc.close();
 }
}
