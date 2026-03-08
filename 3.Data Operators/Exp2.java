import java.util.Scanner;
public class Exp2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		System.out.println("Greatest Number");
        int a;
        int b;
        int c;
        System.out.print("Enter first number: ");
        a = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter second number: ");
        b = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter third number: ");
        c = sc.nextInt();
        sc.nextLine();
		if(a>b && a>c){
			System.out.println("a is greatest number");
		}else if(b>a && b>c){
			System.out.println("b is greatest number");
		}else{
			System.out.println("c is greatest number");
		}
    }

}