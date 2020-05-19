
import java.util.*;
//請分別使用疊代（迴圈）與遞迴方式撰寫讀入一個字串, 並把它反向輸出的程式。
public class Ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		String str = scn.nextLine();
		char[] ch = str.toCharArray();
		char[] tmp = new char[4];
		System.out.print("疊代輸出:");
	
		for (int i = 0; i < ch.length ; i++) {
			tmp[i]= ch[ch.length-1-i];

			System.out.print(tmp[i]);
		}
		
		System.out.println();
		System.out.print("遞迴輸出:");
		System.out.print(reverse(str));
	
	}
	   static String reverse(String str){
		     if(str.equals("")){
		      return "";
		     }
		     else{
		      return reverse(str.substring(1))+str.charAt(0);
		     }
		    }
}
