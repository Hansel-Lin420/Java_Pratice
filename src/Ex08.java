
import java.util.Scanner;
//��J�@�ӥ����n�A�P�_n�O�_����ƨÿ�Xn�Ҧ����]�ơC
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
            System.out.println(n+"�O���");
         }else {
        	  System.out.println(n+"���O���");
         }
      
   }
}