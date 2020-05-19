
import java.util.*;
//睹计玻ネ1~100丁タ俱计睹计耞块计いぇ程の程
public class Ex02 {
	public static void main(String[] args) {
		Random rnd = new Random();
		int[] array = new int[3];

		System.out.print("睹计篏ネ计");
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
		System.out.println("程:" + max + "\t程:" + min);
	}
}
