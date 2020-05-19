
import java.util.*;
//块n计 a_1,a_2,a_3,,a_n籔计x,x琌硂n计い瞷琌氮YESぃ琌氮NO
public class Ex04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("璶块碭计:");
		int n = scn.nextInt();
		int[] a = new int[n];
		
		int count = 0;
		System.out.println("叫块"+n+"计:");
		for (int i = 0; i < n; i++) {
			a[i] = scn.nextInt();
		}
		System.out.println("a皚い琌Τ硂计:");
		int check = scn.nextInt();
		for (int i = 0; i < n; i++) {
			if (a[i] == check) {
				count = 1;

			}
		}
		if (count >= 1) {
			System.out.print("yes");
		}else {
			System.out.print("no");
		}
	}

}
