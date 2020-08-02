import java.util.Scanner;

public class reenter {
	public static void main(String[] args) {
		int a,b;
		Scanner sc=new Scanner (System.in);
		System.out.println("enter first number ");	
		a=sc.nextInt();
		System.out.println("enter second number ");
		b=sc.nextInt();
		if (a>b) {
			System.out.println("b must be greater than a. \n Please re enter ");
		}
		else {
			for (int i= a; i<=b; i++) {
				System.out.println(i);
			}
		}
	}
}