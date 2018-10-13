package eulerProject;

import java.math.BigInteger;

public class problem20 {
        
    public static void main(String[] args ) {
        
            System.out.println("Project Euler : Problem 20");    
        
        long n = 1 ; // fot 문 변수
        BigInteger cal = BigInteger.ONE ;     // cal = n!의 합
        BigInteger answer = BigInteger.ZERO ; // answer = cal의 모든 자릿수의 합
        
        
        for (    ; n <= 100 ; n++ ) {
            
            cal = cal.multiply(BigInteger.valueOf(n));                                                                              
            
        } // cal = 100!
        
        
        System.out.println(n + "! = " + cal);
        
            while(cal != BigInteger.ZERO) { // 자릿수 쪼개기
            
            answer = answer.add(cal.mod(BigInteger.TEN)); // answer에 쪼개버린 자릿수 더하기
            cal = cal.divide(BigInteger.TEN); // cal에서 쪼개서 더했던 자릿수 없애기
            
        } 
        
        System.out.println("정답 : " + answer);
        
    }
 
}