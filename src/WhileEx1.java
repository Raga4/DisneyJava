import java.util.Scanner;

public class WhileEx1 {
	public static void main(String[] args) {
		int n=1;
		int eno;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first value");
		eno=sc.nextInt();
		while(n<=eno) {
			System.out.println("last value is ");
			System.out.printf("%d ",eno);
			n++;
		}
	}
}