

import java.util.*;

public class Ex11 {
//�H���j�]�p���,��J�@�ӥ���ƭ�(���t0),�Ǧ^�ӼƭȬO�X���(# of digits).�Ҧp,��J4395,�h��ƶǦ^4.
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
