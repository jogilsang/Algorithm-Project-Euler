<html>
<?php
 
 
# Solved on 2016. 07
# @Author : jogilsang <jogilsang@naver.com>
 
 
$k = 1; // 피보나치의 시작
$sum = 0; // 짝수이면서 400만 이하의 모든 피보나치 수의 합
 
while(true) { // 위의 Sum을 구하기위한 조건에 맞는 피보나치수 탐색
  
   $var = pibonachi($k);
 
    if( $var <= 4000000 )  { // 피보나치 값은 400만 보다 작아야함.
  
     if( $var % 2 == 0) {// 피보나치는 또한 짝수여야함
     
     echo "p(".$k.")=".$var."<br>"; // 피보나치수를 화면에 표시한다.                               
     $sum += $var; // 그런 수를 구했으면 더한다.
    
    }
   
     $k += 1;
  
 }
  
    
   else                  // 피보나치 값이 400만을 넘어서는 순간, loop 종료 
    break;
}
echo "my answer is ".$sum."<br>"; // 답변공개
 
function pibonachi($n) { // 피보나치 함수
   
 
    if($n <= 0) return 0; //기저사례1
    if($n == 1) return 1; //기저사례2
    if($n == 2) return 2; //기저사례3
    
 
 return  pibonachi($n-1)+pibonachi($n-2); // 재귀호출                               
}
 
?>
</html>