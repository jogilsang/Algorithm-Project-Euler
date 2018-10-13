// Solved on 2016. 07
// Author : jogilsang <jogilsang@naver.com>
// language : java

package eulerProject;

import java.math.BigInteger;

public class problem16 {
       
   public static void main(String[] args ) {
       
       System.out.println("Project Euler : Problem 16");    
       
       BigInteger cal = BigInteger.valueOf(2) ;     // cal = n����
       BigInteger answer = BigInteger.ZERO ; // answer = cal�� ��� �ڸ����� ��
       int n = 1000;
       
       cal = cal.pow(n); // cal = 2^1000
       
       System.out.println("2^"+ n + " = " + cal);
       
           while(cal != BigInteger.ZERO) { // �ڸ��� �ɰ���
           
           answer = answer.add(cal.mod(BigInteger.TEN)); // answer�� �ɰ����� �ڸ��� ���ϱ�
           cal = cal.divide(BigInteger.TEN); // cal���� �ɰ��� ���ߴ� �ڸ��� ���ֱ�
           
       } 
       
       System.out.println("���� : " + answer);
       
   }

}
