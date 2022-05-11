package org.overriding;

/*Method Overriding*/
public class AxisBank extends BankInfo {

	public void deposit() {
		System.out.println("The amount is deposited in Axis Bank's Savings Account");
	}

	public static void main(String[] args) {
		AxisBank axisBank = new AxisBank();
		axisBank.deposit();
		BankInfo bank = new BankInfo();
		bank.deposit();

	}

}
