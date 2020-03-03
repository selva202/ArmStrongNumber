package interview;

public class ReverseInteger {

	public static void main(String[] args) {
		int x = 2785;
		int z = 0;
		while(x!=0) {
			z=z*10+x%10;
			x= x/10;
		}
		
		System.out.println(z);
	
	int g=2547;
		int m = 9867;
		System.out.println(new StringBuffer(String.valueOf(g)).reverse());
		System.out.println(new StringBuffer(String.valueOf(m)).reverse());

	}

}
