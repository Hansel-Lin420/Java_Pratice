
import java.util.*;
//�Ф��O�ϥ��|�N�]�j��^�P���j�覡���gŪ�J�@�Ӧr��, �ç⥦�ϦV��X���{���C
public class Ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		String str = scn.nextLine();
		char[] ch = str.toCharArray();
		char[] tmp = new char[4];
		System.out.print("�|�N��X:");
	
		for (int i = 0; i < ch.length ; i++) {
			tmp[i]= ch[ch.length-1-i];

			System.out.print(tmp[i]);
		}
		
		System.out.println();
		System.out.print("���j��X:");
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
