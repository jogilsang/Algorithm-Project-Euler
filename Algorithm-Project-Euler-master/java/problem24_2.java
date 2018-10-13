// Solved on 2017. 09. 29
// Author : jogilsang <jogilsang@naver.com>
// language : java
// Question : 1,000,000��° ������ ������? (0,1,2,3,4,5,6,7,8,9 ����)

package eulerProject;

import java.util.ArrayList;

public class problem24_2 {
	
	public static ArrayList<Integer> numMatarial = new ArrayList<Integer>();
	// 0~9 ���� ����
	public static ArrayList<Integer> answerMatarial = new ArrayList<Integer>();
	// x���� ������ ������ ��
	
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
		//0,1,2,3,4,5,6,7,8,9 ����
		
		lexicographic(10,999999);
        // 0~999999 : �����ļ���
		
	}
	
	public static void lexicographic(int num, int input) {
		
		if (numMatarial.size()==1) {
			answerMatarial.add(numMatarial.get(0));
			 printMatarial();		
			return ;
		}
		// ������� : 0~9���� ���� �ڸ����� �ϳ��϶� �� �ڸ����� ����ְ� ��
		
		int total = 0; // ���� input�� ���ϱ����Ѱ�
		int count = 0; // while�� �ݺ�Ƚ��
		int sub = factorial(num)/num;
		
		while(total <= input) {
			total = total + sub;
		    count++;
		}
		total = total - sub;
		count = count - 1;
		input = input-total;
		// input ���� �Ѿ�Եɋ�, �Ѿ�� �������� ���� ���Ѵ�.
		
		answerMatarial.add(numMatarial.get(count));
		numMatarial.remove(count);
		// �����ļ����� ���ڰ� �ѹ����ۿ� ���ȵǹǷ�, ���ȼ��ڴ� �����.
		
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
