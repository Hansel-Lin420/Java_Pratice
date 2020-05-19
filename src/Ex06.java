
import java.util.Scanner;
//轉寫一個程式，做阿拉伯數字與羅馬數字之間的轉換。程式要能自動判別是哪一種數字，並自動轉換。
public class Ex06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		String str = scn.nextLine();
		int i=0;
		if (str.charAt(0) < 48 || str.charAt(0) > 57) {
			System.out.println(r2a(str));

		} else {
			i = Integer.parseInt(str);
			System.out.println(a2r(i));
		}
	}

	public static int r2a(String m) {
		int graph[] = new int[400];
		graph['I'] = 1;
		graph['V'] = 5;
		graph['X'] = 10;
		graph['L'] = 50;
		graph['C'] = 100;
		graph['D'] = 500;
		graph['M'] = 1000;
		char[] num = m.toCharArray();
		int sum = graph[num[0]];
		for (int i = 0; i < num.length - 1; i++) {
			if (graph[num[i]] >= graph[num[i + 1]]) {
				sum += graph[num[i + 1]];
			} else {
				sum = sum + graph[num[i + 1]] - 2 * graph[num[i]];
			}
		}
		return sum;
	}

	public static String a2r(int number) {
		String rNumber = "";
		int[] aArray = { 1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1 };
		String[] rArray = { "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I" };
			for (int i = 0; i < aArray.length; i++) {
				while (number >= aArray[i]) {
					rNumber += rArray[i];
					number -= aArray[i];
				}
			
		}
		return rNumber;
	}
}