
import java.util.*;
//輸入正整數n，輸出一個 n×n 的矩陣A，陣列內容由從左上角開始，以左下右上的對角線方式，依序填入1,2,3,4 …。讀入n = 5，將輸出如下矩陣
public class Ex09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int[][] data = new int[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i == 0 && j == 0) {
					data[i][j] = 1;
				} else if (j == 0) {
					data[i][j] = data[i - 1][j] + i;
				} else if (i + j < n) {
					data[i][j] = data[i][j - 1] + j + 1 + i;
				} 
			}
		}
		for (int i = n - 1; i >= 0; i--) {
			for (int j = n - 1; j >= 0; j--) {
				if (i == n - 1 && j == n - 1) {
					data[i][j] = n * n;
				} else if (j == n - 1) {
					data[i][j] = data[i + 1][j] - (n - i - 1);
				} else if (i + j >= n) {
					data[i][j] = data[i][j + 1] - 2 * n + i + j + 1;
				}
			}
		}

		for (int i = 0; i < data.length; i++) {
			for (int j = 0; j < data[i].length; j++) {
				System.out.print(data[i][j] + "\t");
			}
			System.out.println();

		}
	}
}
