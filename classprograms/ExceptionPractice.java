package classprograms;

import java.util.Scanner;
/*
public class ExceptionPractice {
	public static void main(String[] args) {
		System.out.println("Please enter the amount to be withdrawn");
		ATMS a = new ATMS();
		Scanner scan = new Scanner(System.in);
		int amount = scan.nextInt();
		try {
			a.withdraw(amount);
			System.out.println("You have withdrawn"+ amount);
		}
		catch(AmountWithdrawalLimit me) {
			System.out.println(me);
			System.out.println("Please withdraw an amount less than or equal to 2000Rs");
		}
	}
}

class ATMS{
	public void withdraw (int amount)throws AmountWithdrawalLimit,InsufficientFunds {
		if(amount>2000) {
			throw new AmountWithdrawalLimit("Cannot Withdraw More Than 2000Rs");
		}
	}

}

class InsufficientFunds extends Exception{
	public InsufficientFunds() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return ;
	}
}

class AmountWithdrawalLimit extends Exception{
	String msg;
	AmountWithdrawalLimit(String msg){
		this.msg = msg;
	}
	@Override
	public String toString() {
		return msg;
	}
}
*/