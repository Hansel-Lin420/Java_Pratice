
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;
//�J��r��P001.txt�A�N�ɮפ��C�@�Ӧr�Ĥ@�Ӧr���令�j�g�A��L�r���p�g�A�ÿ�X�ɮ�P001-1.txt�C
public class Ex05 {
	public static void main(String[] args) throws  Throwable {
		File f = new File("src\\Ex05.txt");
		 Scanner scn = new Scanner(new File("src\\Ex05.txt"), "UTF8");  
	       String str = scn.useDelimiter("\\Z").next();  
	       scn.close();  
		FileWriter fw = new FileWriter("src\\P001-1.txt");
		String[] strArray = str.split(" |\n");
		char ch0 = 0;
		String other = null;
		for (int i = 0; i < strArray.length; i++) {
			ch0 = strArray[i].charAt(0);
			other = strArray[i].substring(1);
			other = other.toLowerCase();
			if (ch0 >= 97 && ch0 <= 122) {
				ch0 = (char) (ch0 - 32);
			}
			System.out.print(" ");
			System.out.print(ch0 + other);	
			
			fw.write(ch0 + other);


		}

		fw.close();
	}
}