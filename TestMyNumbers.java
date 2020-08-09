
public class TestMyNumbers {
public static void main(String[] args) {
	MyNumbers o1=new MyNumbers();
	o1.setNos(2, 4); //setting the value
	//o1.no1=40;   //this way of accessing variable directly is not acceptible
	//o1.no1 since specified as private cannot be accessed
	o1.add(); //performing addition
	o1.showResult();  //outputs result
	o1.mult();
	o1.showResult();  //outputs result
}
}
