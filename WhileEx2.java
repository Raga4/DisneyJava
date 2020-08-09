import java.util.Scanner;

public class WhileEx2 {
	public static void main(String[] args) {
		int n1,n2,n3, tot;
		String ans="y";
		Scanner sc=new Scanner(System.in);
		while(ans.equals("y")) {
			System.out.print("Enter no1:");
			n1=sc.nextInt();
			System.out.print("Enter no2:");
			n2=sc.nextInt();
			System.out.print("Enter no3:");
			n3=sc.nextInt();
			tot=n1+n2+n3;
			System.out.println("Total="+tot);
			System.out.print("Continue y/n?");
			ans=sc.next();
		}
		System.out.println("I am done");
	}
}
