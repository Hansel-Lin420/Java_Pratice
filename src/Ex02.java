
import java.util.*;
//�üƲ��ͤT��1~100��������ƶüơA�P�_�ÿ�X�T�Ƥ����̤j�Ȥγ̤p�ȡC
public class Ex02 {
	public static void main(String[] args) {
		Random rnd = new Random();
		int[] array = new int[3];

		System.out.print("�üƺG�ͪ���");
		for (int i = 0; i < array.length; i++) {
			array[i] = rnd.nextInt(100) + 1;
		}
		int max = array[0];
		int min = array[0];
		for (int i = 0; i < array.length; i++) {

			if (min > array[i]) {
				min = array[i];
			}
			if (max < array[i]) {
				max = array[i];
			}
		}
		

		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
		System.out.println("�̤j��:" + max + "\t�̤p��:" + min);
	}
}
