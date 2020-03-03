package interview;

import java.util.List;

public class ReverseString1 {

	public static void main(String[] args) {
	String s = "welcome to java training";
		String[] split = s.split(" ");
		String m=" ";
		for(int j=0; j<split.length; j++) {
			String word = split[j];
			String revword=" ";
		
		for (int i=word.length()-1; i>=0; i--) {
			revword= revword + word.charAt(i);
		}
		m= m+revword+" ";
		
	}
		System.out.println(m);
}
}