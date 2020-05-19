

import java.util.*;
//假如有一個陣列x[], 它有 n 個元素, 每一個元素都大於0. x[0]+x[1]+...+x[i] 是其中的一個前段和, x[j]+x[j+1]+x[j+2]+...+x[n-1] 是其中的一個後段和. 請寫一程式求出 x 中有多少組相同的前段和與後段和.

public class Ex14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int ary[] = new int[n];
		for (int i = 0; i < n; i++) {
			ary[i] = scn.nextInt();
		}
		System.out.print(headtail(ary, n));
	}

	public static int headtail(int f[], int n) {
		int pre = 0, suf = n - 1, presum = 0, sufsum = 0, count = 0;
		while (pre < n && suf >= 0)
			if (presum > sufsum) {
				sufsum += f[suf--];
			} else if (sufsum > presum) {
				presum += f[pre++];
			} else {
				count++;		
				presum += f[pre++];
				sufsum += f[suf--];
			}
		return count;
	}

}
