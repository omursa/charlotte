package interview;

public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int i=2; i<=100; i++) {
			
			if(isPrime(i)) {
				System.out.print(i +", ");
			}
		}
		
	}
	public static boolean isPrime(int n) {
		boolean flag= true;
		
		
		for (int i=2; i<n; i++) {
			
			if(n%i==0) {
				flag= false;
				
			}
		}
		return flag;
		
	}
	   

}
