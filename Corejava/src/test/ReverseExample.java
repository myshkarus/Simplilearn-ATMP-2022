package test;

public class ReverseExample {

	public static void main(String[] args) {
		String str = "Clean World Green World";
		String result = "";
		
		for(int index=str.length()-1; index>=0; index--) {
			result = result + str.charAt(index);
		}
		
		System.out.print(result);
	}

}
