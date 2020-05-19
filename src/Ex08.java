
import java.util.Scanner;
//輸入一個正整數n，判斷n是否為質數並輸出n所有的因數。
public class Ex08
{
   public static void main(String[] args){
     Scanner scn = new Scanner(System.in);              
     int n;
     boolean isPRime=false;  

         isPRime=true;
         n=scn.nextInt();   
         System.out.print("1,");
         for(int i=2;i<n;i++){
           if(n%i==0){
              isPRime=false;
              
              System.out.print(i + ",");

            }        
         }
         System.out.println(n);

         if(isPRime){    
            System.out.println(n+"是質數");
         }else {
        	  System.out.println(n+"不是質數");
         }
      
   }
}