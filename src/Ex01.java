
import java.util.*;
//�г]�p�@�ֳz�üƿ︹�{���A��1~42����X6�Ӥ����Ъ��Ʀr�զX�����ֳz�}�����X�A�åѨϥΪ̿�J6�ռƦr�A���o���ƿ�J�C�N�ֳz�}�����X�P�ϥΪ̿�J���X�Ѥp��j�̧ǿ�X�A�æC�X�ϥΪ̱o�쪺�ֳz�����C
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
		System.out.println("�п�J���Ӹ��X:(���୫��)");
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
					System.out.println("�Фŭ��ƿ�J");
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
		System.out.print("�}�����X:");
		for (int i = 0; i < Prize.length; i++) {
			System.out.print(Prize[i] + ",");
		}
		System.out.println();
		System.out.print("�A�����X:");
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
		System.out.print("�A���F" + count + "�Ӹ��X:");
		for (int i = 0; i < 6; i++) {
			if (getPrize[i] != 0) {
				System.out.print(getPrize[i] + ",");
			}
		}
	}

}