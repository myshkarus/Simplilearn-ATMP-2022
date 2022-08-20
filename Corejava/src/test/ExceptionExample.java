package test;

public class ExceptionExample {

	public static void main(String[] args) {
		int [] array = {3,4,5};
		int num = 10;
		try {
			//int res = num/0;
			System.out.println(array[2]);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Inside the catch block");
		}
		catch(ArithmeticException e) {
			System.out.println("Inside the arithmetic catch block");
		}
		finally {
			System.out.println("Inside finally");
		}
		System.out.println("After exception");
	}
}
