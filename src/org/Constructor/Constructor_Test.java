package org.Constructor;

public class Constructor_Test {

	
	public static void main(String[] args) {

		String s = "AntoVargheese";
		int vowelCount = 0;
		String vowels = "";
		int consonentCount = 0 ;
		String consonents = "";
		
		for (int i = 0; i < s.length(); i++) {
			
			char c = s.charAt(i);
			
			if (c==65||c==69||c==73||c==79||c==85||c==97||c==101||c==105||c==111||c==117) {
				
				vowels = vowels+c;
				vowelCount++;
			}
			else {
				consonents = consonents + c;
				consonentCount++;	
			}
		}
		System.out.println("Vowels Present 		:" + vowels);
		System.out.println("Vowels Count 		:" + vowelCount);
		System.out.println("Consonent Count 	:" + consonentCount);
		System.out.println("Consonents Present 	:" + consonents);
		System.out.println("New Modified Print Ln");
		System.out.println("New line is added");
	}



	


}


