import java.util.Scanner;
public class Exp1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		System.out.println("Simple Calculator");
        double a;
        double b;
        System.out.print("Enter first number: ");
        a = sc.nextDouble();
        sc.nextLine();
        System.out.print("Enter second number: ");
        b = sc.nextDouble();
        sc.nextLine();
		double c=a+b;
		double d=a-b;
		double e=a*b;
		double f=a/b;     
		double g=a%b;
        System.out.println("Sum: "+c);
        System.out.println("Difference: "+d);
        System.out.println("Product: "+e);
        System.out.println("Division: "+f);
		System.out.println("Modulo:"+g);
        sc.close();
    }
}