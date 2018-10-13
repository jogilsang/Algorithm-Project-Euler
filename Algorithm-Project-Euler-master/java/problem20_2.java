package eulerProject;

import java.util.ArrayList;

public class problem20_2 {
	
//	private static ArrayList<Integer> mArrayList;
//	private static ArrayList<Integer> mValue;
	

	
	
	public static void main(String[] args ) {
		
		System.out.println("Project Euler : Problem 20");
		
		long n = 1;
		long sum = 1;
		long temp = 0;
		long a=0;
		
		for (   ; n<=73; n++ ) {
			
			sum = sum * n;
			
			long divide = 1;
			
			while(true) {
				
				if(sum == 0) {
					break;
				}
				
				if(sum % 10 != 0) {
				
				temp = temp + (sum % 10)*divide ;
				sum = sum / 10;
				divide = divide * 10;
				}
				
				else {
					// 0 이면 divide 안올려도됨
					temp = temp + (sum % 10)*divide ;
					sum = sum / 10;
					divide = divide * 1;
				}
				
			}
			
			sum = temp;
			temp = 0;
			// sum에 0이 들어가는지 확인해야됨
		
		}
		
		System.out.println(sum);
		
		while( sum % 10 != 0) {
			
			temp = temp + (sum % 10);
			sum = sum/10;
			
		}
		
		System.out.println("답 : " + temp);
	
		
	}

}
