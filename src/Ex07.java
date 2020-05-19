
import java.util.*;

//���ϥΪ̿�J�@�����n�A��for�j��Awhile�j��P���j�T�ؤ覡�p��n!���X�C
public class Ex07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();

		System.out.println("for " + n + "!:" + For(n));

		System.out.println("while " + n + "!:" + While(n));
		System.out.println("���j " + n + "!:" + Recursion(n));
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