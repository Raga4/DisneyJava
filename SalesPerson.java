package src;
import java.util.Scanner;
public class SalesPerson {
	String name;
	String address;
	String job;
	int age;
	double sales,comm;
	void inputDetails() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Person Name: ");
		name = sc.nextLine();
		System.out.println("Enter Age: ");
		age=sc.nextInt();
		System.out.println("Enter Job: ");
		job=sc.next();
		System.out.println("Please enter sales in $");
		sales=sc.nextDouble();
	}
	void calculateComm() {
		int percentage;
		if(sales<=100) {
			percentage=20;
		}
		else if (sales>100 && sales<=200) {
			percentage=25;
		}
		else {
			percentage=35;
		}
		comm=sales*percentage/100;
		
		
	}
	void printDetails() {
		calculateComm();
		System.out.println("==========Details Of Person===================");
		System.out.println("Person Name: Mr./Ms."+name);
		System.out.println("Person Age: "+age+"yrs");
		System.out.println("Person Works as: "+job);
		System.out.println("Hurry!! Your commission is $"+comm);
		System.out.println("==============================================");
	}
}
 