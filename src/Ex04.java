
import java.util.*;
//��Jn�Ӽ� a_1,a_2,a_3,�K,a_n�P�t�@�Ӽ�x,�P�Ox�O�_�b�on�ӼƤ��X�{�C�O�^��YES�A���O�^��NO�C
public class Ex04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("�n��J�X�Ӽ�:");
		int n = scn.nextInt();
		int[] a = new int[n];
		
		int count = 0;
		System.out.println("�п�J"+n+"�Ӽ�:");
		for (int i = 0; i < n; i++) {
			a[i] = scn.nextInt();
		}
		System.out.println("a�}�C���O�_���o�Ӽ�:");
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
