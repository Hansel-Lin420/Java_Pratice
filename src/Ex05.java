
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;
//入文字檔P001.txt，將檔案中每一個字第一個字母改成大寫，其他字母小寫，並輸出檔案P001-1.txt。
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