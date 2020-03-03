package interview;

public class AddallOddNumbers {

	public static void main(String[] args) {
		int num =0;
		int sum =0;
		
		for (int i=1; i<=100; i++) {
			if(i%2==0) {
				
				
				}
			else {
				sum = sum +i;
				System.out.println("this number is odd" + i);
				
			}
		}
		System.out.println("the total count of odd numbers from 1 to 100"+  sum);
	}

}
