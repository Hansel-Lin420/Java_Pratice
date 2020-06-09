import java.util.*;

public class BubbleSort {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		String str_ary[] = scn.nextLine().split(" ");
		int ary[]= new int[str_ary.length];
		for (int i = 0; i < str_ary.length; i++) {
			ary[i] = Integer.parseInt(str_ary[i]);
		}
		for (int i = 0; i < ary.length; i++) {
			for (int j = i+1; j < ary.length; j++) {
				if (ary[i] > ary[j]) {
					 int tmp = ary[i];
	                    ary[i] = ary[j];
	                    ary[j] = tmp;
				}
			}
		}
		for (int i = 0; i < ary.length; i++) {
			System.out.println(ary[i]);
		}
	}
}
