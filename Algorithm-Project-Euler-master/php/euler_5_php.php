<html>
<head>
<?php

//n이라는 숫자가 주어진다
//1~n까지 어떤수로도 나눠지는 가장작은수는
// 1~n 사이의 모든 소수를 구한다음
// 각각의 소수를 n이하가 나올때까지의 제곱수를 구한다음
// 다모아서 곱한다
// 끝!

echo "<font color=blue size=20>"."Fun Calculating~"."</font>";
echo "<br>";

$n=20; // 주어진 input값
$max=1; // 1~20 까지의 어떤수로도 나눠떨어지는 최소 수
$temp=1; // 소수의 거듭제곱수 
$j=0; // 소수의 거듭제곱수를 구하는 반복수

for($i=1  ;$i<=$n ; $i++  ) { // n이하의 소수를 찾는다.
	if(prime($i)==true) {// { 소수라면!!
	  
	   while(true) {
          if($temp>$n) // 거듭제곱해서 $n 을 넘어서기 직전까지 구한다.
		    break;		
		$temp = pow($i,$j++); // 소수의 거듭제곱수를 구한다.
	  }
	   $max=$max*($temp/$i); // 그것을 곱한다.
	  
	  echo $max."<br>";
	  
	   $temp=1; //끝낮으면 다시 초기화
	   $j=0;  //끝낮으면 다시 초기화
	 
}
	}
	
	
function prime($x) {
	
	for($t=2 ; $t<$x ; $t++) {
		
		if($x % $t ==0)
		  return false;
	}
	
	if($t==$x)
		return true;
	
}

?>
</head>
</html>