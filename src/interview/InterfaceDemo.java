package interview;

public class InterfaceDemo {

	public static void main(String[] args) {
		BankInterface hdfcbank = new hdfcbank();
		BankInterface sbibank = new sbibank();
		hdfcbank.deposit();
		sbibank.withdraw();
		

	}

}

 class hdfcbank implements BankInterface{


	@Override
	public void deposit() {
		System.out.println("hdfcdep");
		
	}

	@Override
	public void withdraw() {
		
		System.out.println("hdfcwit");
	}

	@Override
	public void savings() {
		System.out.println("hdfcsav");
		
	}
}
 class sbibank implements BankInterface{

	@Override
	public void deposit() {
		System.out.println("sbicdep");
		
	}

	@Override
	public void withdraw() {
		System.out.println("sbi");
		
	}

	@Override
	public void savings() {
		System.out.println("sbisav");
		
	}
	 
 }