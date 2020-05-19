

import java.util.*;
//���p���@�Ӱ}�Cx[], ���� n �Ӥ���, �C�@�Ӥ������j��0. x[0]+x[1]+...+x[i] �O�䤤���@�ӫe�q�M, x[j]+x[j+1]+x[j+2]+...+x[n-1] �O�䤤���@�ӫ�q�M. �мg�@�{���D�X x �����h�ֲլۦP���e�q�M�P��q�M.

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
