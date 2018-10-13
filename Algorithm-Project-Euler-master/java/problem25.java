package eulerProject;

import java.math.BigInteger;
import java.util.ArrayList;

public class problem25 {
	
	public static ArrayList<BigInteger> record = new ArrayList<BigInteger>();
	
	public static BigInteger pibonachi(BigInteger n) { // �Ǻ���ġ �Լ�
		   
	    if(n.compareTo(BigInteger.ZERO) == 0) return BigInteger.ZERO; //�������1
	    if(n.compareTo(BigInteger.ONE) == 0) return BigInteger.ONE; //�������2
	    if(n.compareTo(BigInteger.valueOf(2)) == 0) return BigInteger.valueOf(2); //�������3
	    
	    
	
	 return  pibonachi(n.subtract(BigInteger.ONE)).add(pibonachi(n.subtract(BigInteger.valueOf(2)))); // ���ȣ��                               
	}
	

	public static void main(String[] args) {
		
		
	 // 4�ڸ��� �Ǵ� �Ǻ���ġ�� ��������� ���ϱ�
	 // �Ǻ���ġ ���Ҷ����� String���� ��ȯ�ؼ� legnth �� 4�� break;
		
		int digit = 1; // �ڸ��� (min : 1, max : 1000(answer))
		BigInteger order = BigInteger.ZERO; // �Ǻ���ġ������ ���� (min : 1, max : unlimit)
		 
		String conversion = new String();
		
		
		while(digit != 7 ) {
			
			order = order.add(BigInteger.ONE); // �����Ǽ��� ����
			conversion = pibonachi(order).toString();
			digit = conversion.length();
			
		}
		
		System.out.println(conversion);
		System.out.println(digit);
		System.out.println("���� : " + order);	
		
	}
	
}
