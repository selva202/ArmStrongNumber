package interview;

public class ReverseString {

	public static void main(String[] args) {
	String s = "selva";
	String m = "";
	int len = s.length();
	for (int i=s.length()-1; i>=0; i--) {
		m= m + s.charAt(i);
	}
	
System.out.println(m);
	
	
	StringBuffer sf = new StringBuffer(s);
	System.out.println(sf.reverse());
	}

}
