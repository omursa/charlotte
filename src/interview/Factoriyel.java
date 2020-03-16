package interview;

public class Factoriyel {

	public static void main(String[] args) {
		
System.out.println(isfibo(4));
System.out.println(refibo(4));

	}
	public static int isfibo(int n) {
		int fac=1;
		for(int i=1; i<=n; i++) {
			fac= fac*i;
		}
		return fac;
		
	}
	public static int refibo(int s) {
		
		if(s==1) {
			return 1;
		}
		
		return s*refibo(s-1);
		
	}
	
	

}
