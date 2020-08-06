import java.util.Scanner;

public class SwitchEx {
public static void main(String[] args) {
	String alpha;
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter any alphabet:");
	alpha=sc.next();
	/*
	 * if(alpha.equals("a") || alpha.equals("e")){ //TODO: complete this
	 * System.out.println("it is vowel"); }else {
	 * System.out.println("it is consonent"); }
	 */	
	switch(alpha) {
	case "a":
		System.out.println("a is vowel");
		break;
	case "e":
		System.out.println("e is vowel");
		break;
	case "i":
		System.out.println("i is vowel");
		break;
	default:
		System.out.println("it is consonent");
	}
	}
}
