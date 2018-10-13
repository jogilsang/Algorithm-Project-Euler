<html>
<?php
 

# Solved on 2016. 07
# @Author : jogilsang <jogilsang@naver.com>
 

            var $sum; // 3 또는 5의 배수의 합
 
           
            for ($i = 1  ; $i <1000 ; $i++) // i가 1000 이 되는순간 종료
          { 
     
                   if( $i % 3 == 0 || $i % 5 ==0 ) // i가 3 또는 5의 배수라면 (3과 5의 배수도 포함됨)
     
                         $sum = $sum + $i; // 1~999 숫자중 3 또는 5의 배수를 계속 합한다.
 
          } 
 
                 echo "1000 미만의 숫자중 3 또는 5의 배수의 합은" . $sum . "입니다<br>" ;
 
 
?>
</html>   
