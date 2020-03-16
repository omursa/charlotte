package interview;

public class ArmStrongNumbers {
///this is my code
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(int i=0; i<=1000; i++) {
			
			if(isArm(i)) {
				System.out.println(i);
			}
		}
	}
	public static boolean isArm(int num) {
		boolean flag= false;
		
		int sum=num;
		int r= 1;
		int cube= 0;
		
		
		
		while(num>0) {
			r= num %10; 
			num=num/10;
			cube= cube+ r*r*r;
			
		}
		
		if(sum==cube) {
			flag= true;
		}
		return flag;
		
	
	}
}
