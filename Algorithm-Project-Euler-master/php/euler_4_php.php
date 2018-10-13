<html>
<head>
<?php

// 세자리수 두개를 곱해서 나올수있는 펠린드롬 최대값 만들기.

# 100*100=10000 : 5자리
# 1000*1000=1000000: 7자리
# 따라서 5~6자리
echo "<font color=blue size=20>"."Fun Calculating~"."</font>";
echo "<br>";
$max=0;

for($x=999 ;$x>=100 ; $x--     ) {
	for($y=999 ;$y>=100 ; $y--     ){
	$t=$x*$y;
	#echo $x."*".$y."=".$t."<br>";
	if(palindrome($t)==true){ # 만약, 대칭수가 맞다면
		if($t>$max)           # 기존에 구했던 펠린드롬과 최대값을 비교
			$max=$t;          # 새로운 펠린드롬 최대값
	  }
 }
 }

  echo "palindrome=".$max."<br>"; # 결과값출력



function palindrome($n) { # 대칭수 구하는 함수 (5~6자리에 한해서)
	
	$a;$b;$c;$d;$e;$f;
	
	if(10000 <= $n && $n <= 99999) {# 5자리인경우
	 $a=(int)($n/10000); // 5번쨰 자리수
	 #echo $a ."<br>";
	 
	 $b=(int)(($n-$a*10000)/1000); // 4번쨰 자리수
	 #echo $b."<br>";
	 
	 $d=(int)(($n-((int)($n/100))*100)/10);         //2번째 자리수
	  #echo $d."<br>";
	 $e=$n-((int)($n/10))*10; //1번째 자리수
	  #echo $e."<br>";
	
	  if($a==$e && $b==$d){ # 5번쨰자리=1번쨰자리, 4번째자리=2번째자리,3번째자리는 상관없음
		  #echo "palindrome"."<br>";
		  #echo $n;
	      return true;
		  }
	 else { # 이 수는 대칭수가 아니다!
          #echo "fail!";
	   return false;                
    }
	  
  
	
} // 5자리인경우

	else if(100000 <= $n && $n <= 999999) {# 6자리인경우
	 $a=(int)($n/100000); // 6번쨰 자리수
	# echo $a ."<br>";
	 
	 $b=(int)(($n-$a*100000)/10000); // 5번쨰 자리수
	 #echo $b."<br>";
	 
	 $c=(int)(($n-$a*100000-$b*10000)/1000); // 4번쨰 자리수
	 #echo $c."<br>";
	 
	  $d=(int)(($n-$a*100000-$b*10000-$c*1000)/100); // 4번쨰 자리수
	 #echo $d."<br>";
	 
	  $e=(int)(($n-((int)($n/100))*100)/10);  //2번째 자리수
	  #echo $e."<br>";
	 
	 $f=$n-((int)($n/10))*10; //1번째 자리수
	  #echo $f."<br>";
	 
	 
	 
	 if($a==$f && $b==$e && $c==$d) { # 6번쨰자리=1번쨰자리, 5번째자리=2번째자리,4번째자리=3번째자리
		  #echo "palindrome"."<br>";
		  #echo $n;
	      return true;
	}
	  else {                          # 이 수는 대칭수가 아니다!
       #echo "fail!";
	   return false;
    }
	
} // 6자리인경우

 
 }



?>
</head>
</html>
