package src;

public class SalesCommission {
public static void main(String[] args) {
	SalesPerson sp1=new SalesPerson();
	SalesPerson sp2=new SalesPerson();
	sp1.inputDetails();
	sp1.name="junk fellow";

	sp2.inputDetails();
	sp1.printDetails();
	sp2.printDetails();
}
}
