import java.util.Scanner;

public class WhileEx {
	public static void main(String[] args) {
		int n=1;
		int eno;
		Scanner sc=new Scanner(System.in);
		System.out.println("Upto what number?");
		eno=sc.nextInt();
		while(n<=eno) {
			System.out.println(n);
			n++;
		}
	}
}
