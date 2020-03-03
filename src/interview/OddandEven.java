package interview;

public class OddandEven {

	public static void main(String[] args) {
		int num=145678;
		int oddcount=0;
		int evencount =0;
		while(num>0) {
			int rev= num%10;
			
			num = num/10;
			if(rev%2==0) {
				System.out.println("this is even number" + rev);
				evencount++;
			}
			else {
				System.out.println("this is odd number" + rev);
				oddcount++;
			}
		}
		System.out.println("total number of odd count" + oddcount);
		System.out.println("total number of even count" + evencount);

	}

}
