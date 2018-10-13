package eulerProject;

import java.math.BigInteger;

public class problem20 {
        
    public static void main(String[] args ) {
        
            System.out.println("Project Euler : Problem 20");    
        
        long n = 1 ; // fot �� ����
        BigInteger cal = BigInteger.ONE ;     // cal = n!�� ��
        BigInteger answer = BigInteger.ZERO ; // answer = cal�� ��� �ڸ����� ��
        
        
        for (    ; n <= 100 ; n++ ) {
            
            cal = cal.multiply(BigInteger.valueOf(n));                                                                              
            
        } // cal = 100!
        
        
        System.out.println(n + "! = " + cal);
        
            while(cal != BigInteger.ZERO) { // �ڸ��� �ɰ���
            
            answer = answer.add(cal.mod(BigInteger.TEN)); // answer�� �ɰ����� �ڸ��� ���ϱ�
            cal = cal.divide(BigInteger.TEN); // cal���� �ɰ��� ���ߴ� �ڸ��� ���ֱ�
            
        } 
        
        System.out.println("���� : " + answer);
        
    }
 
}