
import java.util.*;

public class Ex12 {
//��J��� n, �C�X�Ҧ����׬�n ��01�r��A�Ҧp n = 3, �h��X 000, 001, 010, 011, 100,101,110,111�C
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

