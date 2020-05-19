

import java.util.*;

public class Ex11 {
//以遞迴設計函數,輸入一個正整數值(不含0),傳回該數值是幾位數(# of digits).例如,輸入4395,則函數傳回4.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		System.out.println(Digits(n));

	}

 public static int Digits(int i) {
		if (i < 10) {
			return 1;

		} else {
			return 1+Digits(i/10);
		}
	}
}
