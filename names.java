import java.util.Scanner;

public class names {
	public static void main(String[] ars) {
		Scanner sc=new Scanner(System.in);
		String x,y;
		System.out.println("enter 1st name");
			x= sc.nextLine();
		System.out.println("enter 2nd name");
			y= sc.next();
		if (x.equalsIgnoreCase(y)) {
			System.out.println("both names are same");
		}
		else {
			System.out.println("names don't match");
		}
		
	}

}
