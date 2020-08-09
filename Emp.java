import java.util.Scanner;

public class Emp {
	int empno;
	String name;
	String desc;
	double basic,da,pf,net;
	void input() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Employee ID: ");
		empno=sc.nextInt();
		System.out.println("Enter Employee Name: ");
		name=sc.next();
		System.out.println("Enter Employee Designation: ");
		desc=sc.next();
		System.out.println("Enter Basic Salary: ");
		basic=sc.nextDouble();
		da = basic *20/100;
		pf = basic * 15/100;
		net = basic + da - pf;
	} 
	void printDetails() {
		System.out.println(">>>>>>>>>>>Employee Information<<<<<<<<<<<<<<<");
		System.out.println("Employee ID:"+empno);
		System.out.println("Employee Name:"+name);
		System.out.println("Employee Basic Salary $:"+basic);
		System.out.println("Dearness Allowance:"+da);
		System.out.println("Provident Fund:"+pf);
		System.out.println("Take Home Salary:"+net);
		System.out.println(">>>>>>>>>>>********************<<<<<<<<<<<<<<<");
	}
}
