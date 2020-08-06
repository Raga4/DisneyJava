import java.util.Scanner;

public class Student {
	public static void main(String[] args) {
		String name;
		int e,m,s,avg,tot;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Student Name:");
		name=sc.nextLine();
		System.out.println("Enter English Marks:");
		e=sc.nextInt();
		System.out.println("Enter Math Marks:");
		m=sc.nextInt();
		System.out.println("Enter Science Marks:");
		s=sc.nextInt();
		tot=e+m+s;
		avg=tot/3;
		if(avg>60) {
			System.out.printf("%s got %d has passed",name,avg);
		} else {
			System.out.printf("%s got %d has failed",name,avg);
		}
		
		
	}
}
