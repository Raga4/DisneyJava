import java.util.Scanner;
public class reentervalues {
	public static void main(String[] args) {
		int n=1;
		int eno;
		Scanner sc=new Scanner(System.in);
		System.out.println("?");
		eno=sc.nextInt();
		while(n<=eno) {
			System.out.println(n);
			n++;
		}
	}
}