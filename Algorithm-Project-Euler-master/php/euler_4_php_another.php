<html>
<head>
<?php


echo "<font color=blue size=20>"."Fun Calculating~"."</font>";
echo "<br>";


$max=0;

for($x=999 ;$x>=100 ; $x--     ) {
	for($y=999 ;$y>=100 ; $y--     ){
	$a=(string)($x*$y); #일단 숫자를 문자열로 바꾼다
	$b=strrev($a); # 문자열을 뒤집어서 하나 저장한다.
	
	$a=(int)$a; #다시 숫자로 바꾼다
	$b=(int)$b; #마찬가지로 다시 숫자로 바꾼다.
	
	if($a==$b)  # 펠린드롬이 뒤집어도 같은 수라면, 어차피 같은수이다.
		if($a>$max) # 하지만, 여기서 우리는 최대값을 찾는다.
	$max=$a;  # 세자리수 곱셈이 끝나면 최대값이 계속 바뀌다가 하나 남는다.

 }
 }

echo "palindrome=".$max."<br>"; # 세자리수 곱셈중 최대값을 가진 펠린드롬 출력


?>
</html>
</head>