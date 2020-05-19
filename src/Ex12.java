
import java.util.*;

public class Ex12 {
//輸入整數 n, 列出所有長度為n 的01字串，例如 n = 3, 則輸出 000, 001, 010, 011, 100,101,110,111。
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();


		for (int i = 0; i < Math.pow(2, n) ; i++) {
			System.out.printf("%0"+n+"d\n",Binary(i));
			}

		}

  public static int Binary(int i) {
	// TODO Auto-generated method stub
	String str="";
	 while(i>0) {
    	 str = Integer.toString(i%2)+str;
    	 i=i/2;
     }
     str = Integer.toString(i)+str;
     
	return Integer.parseInt(str);
}
	}

