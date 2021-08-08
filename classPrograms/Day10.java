package classPrograms;

public class Day10 {
	public static void main(String[] args) {
		new Human().work();//new is equivalent to KUN//ANONYMOUS HUMAN OBJECT
		Human shoiab=new Human();//NAMED HUMAN OBJECT
		shoiab.work();
		Human sho;//you are just creating a reference variable of type Human class
		//sho.work();//this will throw an error - Null pointer error
		int m=shoiab.giveMoney();
		System.out.println(m);
		
		m=shoiab.giveChange(100);
		System.out.println("The change is..:"+m);
	}
}
class Human{//any noun can be written as a class
	public void work() {
		System.out.println("work method of human called....");
	}
	public int giveMoney() {
		return 100;
	}
	public int giveChange(int amount) {
		if(amount>=100) {
			return amount-50;
		}
		else {
			return amount;
		}
	}
}



