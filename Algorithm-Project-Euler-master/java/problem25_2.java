package eulerProject;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;

public class problem25_2 {
	
//	public static BigInteger pibonachi(BigInteger n) { // 피보나치 함수
//		   
//	    if(n.compareTo(BigInteger.ZERO) == 0) return BigInteger.ZERO; //기저사례1
//	    if(n.compareTo(BigInteger.ONE) == 0) return BigInteger.ONE; //기저사례2
//	    if(n.compareTo(BigInteger.valueOf(2)) == 0) return BigInteger.valueOf(2); //기저사례3
//	    
//	 
//	 return  pibonachi(n.subtract(BigInteger.ONE)).add(pibonachi(n.subtract(BigInteger.valueOf(2)))); // 재귀호출                               
//	}
	
	private static Map<Integer, BigInteger> record = new HashMap<>();

	public static BigInteger fibonacci(int order) {
	    if (order == 0 || order == 1) {
	        return BigInteger.ONE;
	    }
	    if (record.containsKey(order)) {
	        return record.get(order);
	    }
	    BigInteger value = fibonacci(order - 2).add(fibonacci(order - 1));
	    record.put(order, value);
	    return value;
	}
	

	public static void main(String[] args) {
		
		int digit = 1; // 자릿수 (min : 1, max : 1000(answer))
		int order = 0; // 피보나치수열의 순서 (min : 1, max : unlimit)
		 
		String conversion = new String();
		
		
		while(digit != 1000 ) {
			
			order = order+1; // 수열의순서 증가
			conversion = fibonacci(order).toString();
			digit = conversion.length();
			
		}
		order = order +1;
		
		System.out.println("피보나치값 : " + conversion);
		System.out.println("자릿수 :" + digit);
		System.out.println("정답 : " + order);	
		
	}
	
}
