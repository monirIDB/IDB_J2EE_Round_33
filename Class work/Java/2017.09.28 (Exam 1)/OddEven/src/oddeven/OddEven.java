
package oddeven;

import java.util.Scanner;

public class OddEven {

   
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      System.out.println("Eneter number");
      int a=sc.nextInt();
      if(a%2==0){
          System.out.println("The number is even");
      }else{
          System.out.println("The number is odd");
      }
    }
    
}
