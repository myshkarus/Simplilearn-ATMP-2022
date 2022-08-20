package oops;

public class RunnerClass {

	public static void main(String[] args) {
		
		//Employee E1 = new Employee();
		//E1.Name = "Mike";
		//E1.EmpId = 1000;
		//E1.Department = "HR";		
		//E1.Display();
		
		//Employee E2 = new Employee("Jack", 1001, "Finance");
		// E2.Name = "Jack";
		// E2.EmpId = 1001;
		// E2.Department = "Finance";
		//E2.Display();
		
		Bank B = new Bank();
		B.DisplayBalance();
		
		int Bal = B.GetBalance();
		System.out.println("The Balance is " + Bal);
		
		BOABank B1 = new BOABank();
		B1.CCBalance();
		B1.DisplayBalance();
		
		OverLoadingExample obj = new OverLoadingExample();
		int RecArea = obj.GetArea(3,  4);
		int SqArea = obj.GetArea(4);
		
		B1.CloseAccount(12345);
		B.CloseAccount(12345);
		
		ChromeBrowser Ch = new ChromeBrowser();
		Ch.OpenBrowser();
		
		Browser Br = new FirefoxBrowser();
		Br.OpenBrowser();
		Br.CloseBrowser();
		Br.DisplayName();
		
	}

}
