package interview;

import java.util.ArrayList;
import java.util.List;

public class Fibonacci {

	public static void main(String[] args) {
		
	System.out.println(isFibo(100));
		
	}
	public static ArrayList<Integer>isFibo(int num){
		int a=1;
		int b=1;
		int c= a+b;
		
		ArrayList<Integer>list= new ArrayList<Integer>();
	while(b<num) {
		a=b;
		b=c; 
		c= a+b;
		list.add(a);
	}
	return list;
		
	}
	


}
