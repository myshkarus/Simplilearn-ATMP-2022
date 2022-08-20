package oops;

public class BOABank extends Bank{

	public int CreditCardNum;
	//int AccountNum;
	
	public void CCBalance() {
		System.out.println("Inside CC balance");
	
	
	this.CreditCardNum = 1000;
	super.AccountNum = 12345;
	this.AccountNum = 7898;
    }
	
	public void CloseAccount(int CCNumber) {
		System.out.println("Inside BOA CloseAccount");
	}
	
}	
