package eulerProject;

import java.math.BigDecimal;

public class problem16_2 {
	

	public static void main(String[] args) {
		BigDecimal bd = new BigDecimal(2);
		bd = bd.pow(1000);

		String s = bd.toString();
		int result = 0;

		for (int i = 0; i < s.length(); i++)
			result = result + (s.charAt(i) - '0');

		System.out.println(result);

	}

}
