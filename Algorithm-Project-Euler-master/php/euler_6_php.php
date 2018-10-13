<html>
<head>
<?php

$n=100;   // 주어진 값
$max1=0;  // 제곱의합
$max2=0; // 합의제곱

for($i=1 ;$i<=$n; $i++) { //제곱의합과 합의제곱을 구한다.
	
	$max1=$max1+pow($i,2); // 1^2+..+1^100
	$max2=$max2+$i; // 1+...+100
}
$max2=pow($max2,2); // 합의제곱을 구했다.

echo "<font size=20><strong>제곱의합=</strong></font>".$max1."<br>";
echo "<font size=20><strong>합의제곱=</strong></font>".$max2."<br>";
echo "<font size=20 color=red><strong>|합의제곱-제곱의합|=</strong></font>".abs($max1-$max2);

?>
</head>
</html>