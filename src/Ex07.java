
import java.util.*;

//讓使用者輸入一正整數n，用for迴圈，while迴圈與遞迴三種方式計算n!後輸出。
public class Ex07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();

		System.out.println("for " + n + "!:" + For(n));

		System.out.println("while " + n + "!:" + While(n));
		System.out.println("遞迴 " + n + "!:" + Recursion(n));
	}

	static public int For(int n) {

		int sum = 1;
		for (int i = 1; i <= n; i++) {
			sum = sum * i;
		}
		return sum;
	}

	static public int While(int n) {
		int w = 1;
		int sum = 1;
		while (w <= n) {
			sum = sum * w;
			w++;
		}
		return sum;
	}

	static public int Recursion(int n) {
		if (n == 1) {
			return 1;
		} else {
			return n * Recursion(n - 1);
		}
	}
}