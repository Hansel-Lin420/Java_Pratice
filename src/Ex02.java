
import java.util.*;
//亂數產生三個1~100間的正整數亂數，判斷並輸出三數中之最大值及最小值。
public class Ex02 {
	public static void main(String[] args) {
		Random rnd = new Random();
		int[] array = new int[3];

		System.out.print("亂數產生的數");
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
		System.out.println("最大值:" + max + "\t最小值:" + min);
	}
}
