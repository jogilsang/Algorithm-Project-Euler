

<?php


# int는 21억까지고
# float으로 바로 넘어가는데, 제한이 500억까지...
# 그외 데이터형은 모르겠다
# float을 int 처럼 쓸라면 (int)$n 요렇게 캐스팅하던지, round($n) 요렇게 하면된다

 static $num=600851475143; //주어진수
 static $max=0; //최대값
 static $n=1;
 fact($num);
 
 
 
 function fact($x) {
	 
	 
	  while(true){
		  $n++;
		  
		  if($x%$n == 0) { #나눠진다면 
		     
			 if($x==$n) {
				 $max=$x;
				 echo $max;
				 break;
			 }
				 
			 
		    ; #몫
			$x=$x/$n;
			$max=$x;
			$n=1;
			
			echo $max;
			
		  }
		  
		  
	  }
	 
	 
	 
	 
 }
 



