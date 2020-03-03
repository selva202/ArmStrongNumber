package interview;



import java.util.Scanner;

public class ArmStrongNumber {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the number");
		int entry = scan.nextInt();
		int rev = 0;
		int sum = entry;
		int total=0;
		while(entry>0) {
			rev = entry%10;
			entry = entry/10;
			total= total + (rev*rev*rev);//27+125+1\\edited
			
			}
		if(total==sum) {
			System.out.println("the given number is armstrong:" + sum);
		}
		else
		{
			System.out.println("the given number is not armstrong"+ sum);
		}
		
		

	}

}
