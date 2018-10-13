// Solved on 2017. 09. 29
// Author : jogilsang <jogilsang@naver.com>
// language : java
// Question : 1,000,000번째 사전식 순열은? (0,1,2,3,4,5,6,7,8,9 조합)

package eulerProject;

import java.util.ArrayList;

public class problem24_2 {
	
	public static ArrayList<Integer> numMatarial = new ArrayList<Integer>();
	// 0~9 까지 대입
	public static ArrayList<Integer> answerMatarial = new ArrayList<Integer>();
	// x번쨰 사전식 순열의 답
	
	public static void main(String[] args) {
		
		numMatarial.add(0);
		numMatarial.add(1);
		numMatarial.add(2);
		numMatarial.add(3);
		numMatarial.add(4);
		numMatarial.add(5);
		numMatarial.add(6);
		numMatarial.add(7);
		numMatarial.add(8);
     	numMatarial.add(9);
		//0,1,2,3,4,5,6,7,8,9 대입
		
		lexicographic(10,999999);
        // 0~999999 : 사전식순열
		
	}
	
	public static void lexicographic(int num, int input) {
		
		if (numMatarial.size()==1) {
			answerMatarial.add(numMatarial.get(0));
			 printMatarial();		
			return ;
		}
		// 기저사례 : 0~9까지 남은 자릿수가 하나일때 그 자릿수를 집어넣고 끝
		
		int total = 0; // 최종 input을 구하기위한값
		int count = 0; // while문 반복횟수
		int sub = factorial(num)/num;
		
		while(total <= input) {
			total = total + sub;
		    count++;
		}
		total = total - sub;
		count = count - 1;
		input = input-total;
		// input 값을 넘어가게될떄, 넘어가기 직전까지 값을 구한다.
		
		answerMatarial.add(numMatarial.get(count));
		numMatarial.remove(count);
		// 사전식순열은 숫자가 한번씩밖에 사용안되므로, 사용된숫자는 지운다.
		
		lexicographic(num-1,input);
	}
	
	public static int factorial(int n) {

		if (n <= 1) {
			return n;
		}

		else {
			return factorial(n-1) * n;
		}
	}
	
	public static void printMatarial() {
		
		System.out.println(answerMatarial.toString()); 
		   
	}

}
