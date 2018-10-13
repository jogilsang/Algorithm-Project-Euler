package eulerProject;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;

public class problem25_2 {
	
//	public static BigInteger pibonachi(BigInteger n) { // �Ǻ���ġ �Լ�
//		   
//	    if(n.compareTo(BigInteger.ZERO) == 0) return BigInteger.ZERO; //�������1
//	    if(n.compareTo(BigInteger.ONE) == 0) return BigInteger.ONE; //�������2
//	    if(n.compareTo(BigInteger.valueOf(2)) == 0) return BigInteger.valueOf(2); //�������3
//	    
//	 
//	 return  pibonachi(n.subtract(BigInteger.ONE)).add(pibonachi(n.subtract(BigInteger.valueOf(2)))); // ���ȣ��                               
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
		
		int digit = 1; // �ڸ��� (min : 1, max : 1000(answer))
		int order = 0; // �Ǻ���ġ������ ���� (min : 1, max : unlimit)
		 
		String conversion = new String();
		
		
		while(digit != 1000 ) {
			
			order = order+1; // �����Ǽ��� ����
			conversion = fibonacci(order).toString();
			digit = conversion.length();
			
		}
		order = order +1;
		
		System.out.println("�Ǻ���ġ�� : " + conversion);
		System.out.println("�ڸ��� :" + digit);
		System.out.println("���� : " + order);	
		
	}
	
}
