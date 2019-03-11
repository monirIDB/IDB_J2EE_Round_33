
package mamun;

import java.util.Arrays;
import java.util.Scanner;


public class E1Q8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] a=new int[10];
        for(int i=0;i<10;i++){
            System.out.println("Enter value");
            a[i]=sc.nextInt();
        }
        for(int i=0; i<10; i++){
        System.out.print(a[i]+" ");
        }
       Arrays.sort(a);
       System.out.println("The minimum value is: "+a[0]);
        System.out.println("The maximum value is: "+a[9]);
    }
}
