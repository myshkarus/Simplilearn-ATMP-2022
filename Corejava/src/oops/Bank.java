package oops;

public class Bank {
	public int AccountNum;
	
	public void DisplayBalance() {
		System.out.println("Inside DisplayBalance");
	}
	
	public int GetBalance() {
		return 1000;
	}
	
	public void CloseAccount(int AccountNum) {
		System.out.println("Inside Bank CloseAccount");
	}
	
}
