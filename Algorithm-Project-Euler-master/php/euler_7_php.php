<html>
<head>
<?php

/*euler_7

소수를 크기 순으로 나열하면 2, 3, 5, 7, 11, 13, ... 과 같이 됩니다.
이 때 10,001번째의 소수를 구하세요. */

include 'prime_func.php';

$n=10001; // $n번째 소수
$prime_count=0; // 소수 순번 2=1, 3=2, 5=3....

$i=2;
 while(true) {
    if(prime($i)==true) {// 소수면
		 $prime_count++;
		 $i+=1;
    if($prime_count==10001) {
		 break;
	 }
	 
 }
 }
 
 echo $prime_count."번째 소수는=".$i."<br>";



?>
</head>
</html>