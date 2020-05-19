
import java.util.*;
//請設計一樂透亂數選號程式，由1~42中選出6個不重覆的數字組合做為樂透開獎號碼，並由使用者輸入6組數字，不得重複輸入。將樂透開獎號碼與使用者輸入號碼由小到大依序輸出，並列出使用者得到的樂透獎項。
public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int Prize[] = new int[6];
		int tmp;
		int guess[] = new int[6];
		int count = 0;
		int getPrize[] = new int[6];
		;
		Scanner scn = new Scanner(System.in);
		Random rnd = new Random();
		System.out.println("請輸入六個號碼:(不能重複)");
		for (int i = 0; i < Prize.length; i++) {
			Prize[i] = rnd.nextInt(42) + 1;
			for (int j = 0; j < i; j++) {
			if (Prize[i] == Prize[j]) {
					
					i--;
					break;
				}
			}
		}
		for (int i = 0; i < guess.length; i++) {
			guess[i] = scn.nextInt();
			for (int j = 0; j < i; j++) {
				if (guess[i] == guess[j]) {
					System.out.println("請勿重複輸入");
					System.exit(0);
				}
			}
		}
		for (int i = 0; i < guess.length; i++) {
			for (int j = 0; j < guess.length - 1; j++) {
				if (guess[j] > guess[j + 1]) {
					tmp = guess[j];
					guess[j] = guess[j + 1];
					guess[j + 1] = tmp;
				}
			}
		}

		for (int i = 0; i < Prize.length; i++) {
			for (int j = 0; j < Prize.length - 1; j++) {
				if (Prize[j] > Prize[j + 1]) {
					tmp = Prize[j];
					Prize[j] = Prize[j + 1];
					Prize[j + 1] = tmp;
				}
			}
		}
		System.out.print("開獎號碼:");
		for (int i = 0; i < Prize.length; i++) {
			System.out.print(Prize[i] + ",");
		}
		System.out.println();
		System.out.print("你的號碼:");
		for (int i = 0; i < guess.length; i++) {
			System.out.print(guess[i] + ",");
		}
		System.out.println();
		for (int i = 0; i < guess.length; i++) {
			for (int j = 0; j < Prize.length; j++) {
				if (guess[i] == Prize[j]) {
					count++;
					getPrize[i] = guess[i];
				}
			}
		}
		System.out.print("你中了" + count + "個號碼:");
		for (int i = 0; i < 6; i++) {
			if (getPrize[i] != 0) {
				System.out.print(getPrize[i] + ",");
			}
		}
	}

}