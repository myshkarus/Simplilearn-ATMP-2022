package test;

public class VowelsCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "Clean World Green World";
		char[] vowels = {'a','e','i','o','u'};
		int count = 0;
		
		for(int index=0; index<str.length(); index++) {
			
			char ch = str.charAt(index);
			if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u') {
				count++;
			}
		}
		
		System.out.println("The Vowel count is " + count);
	}
}
