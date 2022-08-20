package test;

public class ConditionsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int age = 17;
		
		if(age >= 18) {
			System.out.println("I am eligible for voting");
		}
		else if (age== 17) {
			System.out.println("Sorry try again next year");
		}
		else {
			System.out.println("Not eligible for voting");
		}
	}

}
