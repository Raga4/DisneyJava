//program to print the string given number of times
import java.util.Scanner;

public class WhileEx1 {
	public static void main(String[] args) {
		int n=1;
		int eno;
		Scanner sc=new Scanner(System.in);
		System.out.println("How many times to print?");
		eno=sc.nextInt();
		while(n<=eno) {
			System.out.printf("I am printed %d time",eno);
			n++;
		}
	}
}