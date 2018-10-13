// Solved on 2016. 07
// Author : jogilsang <jogilsang@naver.com>
// language : java

package eulerProject;

import java.math.BigInteger;

public class problem16 {
       
   public static void main(String[] args ) {
       
       System.out.println("Project Euler : Problem 16");    
       
       BigInteger cal = BigInteger.valueOf(2) ;     // cal = n제곱
       BigInteger answer = BigInteger.ZERO ; // answer = cal의 모든 자릿수의 합
       int n = 1000;
       
       cal = cal.pow(n); // cal = 2^1000
       
       System.out.println("2^"+ n + " = " + cal);
       
           while(cal != BigInteger.ZERO) { // 자릿수 쪼개기
           
           answer = answer.add(cal.mod(BigInteger.TEN)); // answer에 쪼개버린 자릿수 더하기
           cal = cal.divide(BigInteger.TEN); // cal에서 쪼개서 더했던 자릿수 없애기
           
       } 
       
       System.out.println("정답 : " + answer);
       
   }

}
