package interview;

public class TryCatch {

	public static void main(String[] args) {
		try {
			String s= null;
			System.out.println(s.length());
		
	}
		catch(ArithmeticException e) {
			System.out.println("are");
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("ari");
		}
		catch(Exception e) {
			System.out.println("null exception");
		}
		System.out.println("rest of the code");

}
}