
package exam1q10;

import java.util.Arrays;
import java.util.Scanner;


public class Exam1Q8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       
        int i=0;
         int[] a=new int[i];
        System.out.println("Enter value");
        a[i]=sc.nextInt();
        while(a.length!=10){
            i++;
           System.out.println("Enter value");
            a[i]=sc.nextInt();
        }
        
        for(int j=0; j<a.length; j++){
            System.out.print(a[j]+" ");
        }
        Arrays.sort(a);
        System.out.println("The lowest number given by the user is: "+a[0]);
        int b=a.length-1;
        System.out.println("The highest number given by the user is: "+b);
    }
}
