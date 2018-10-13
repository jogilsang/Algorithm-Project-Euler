package eulerProject;

import java.math.BigInteger;
import java.util.ArrayList;

public class problem25 {
	
	public static ArrayList<BigInteger> record = new ArrayList<BigInteger>();
	
	public static BigInteger pibonachi(BigInteger n) { // 피보나치 함수
		   
	    if(n.compareTo(BigInteger.ZERO) == 0) return BigInteger.ZERO; //기저사례1
	    if(n.compareTo(BigInteger.ONE) == 0) return BigInteger.ONE; //기저사례2
	    if(n.compareTo(BigInteger.valueOf(2)) == 0) return BigInteger.valueOf(2); //기저사례3
	    
	    
	
	 return  pibonachi(n.subtract(BigInteger.ONE)).add(pibonachi(n.subtract(BigInteger.valueOf(2)))); // 재귀호출                               
	}
	

	public static void main(String[] args) {
		
		
	 // 4자리가 되는 피보나치수 몇번쨰인지 구하기
	 // 피보나치 구할때마다 String으로 변환해서 legnth 가 4면 break;
		
		int digit = 1; // 자릿수 (min : 1, max : 1000(answer))
		BigInteger order = BigInteger.ZERO; // 피보나치수열의 순서 (min : 1, max : unlimit)
		 
		String conversion = new String();
		
		
		while(digit != 7 ) {
			
			order = order.add(BigInteger.ONE); // 수열의순서 증가
			conversion = pibonachi(order).toString();
			digit = conversion.length();
			
		}
		
		System.out.println(conversion);
		System.out.println(digit);
		System.out.println("정답 : " + order);	
		
	}
	
}
