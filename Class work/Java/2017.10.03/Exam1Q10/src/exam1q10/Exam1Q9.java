
package exam1q10;

import java.util.ArrayList;
import java.util.Scanner;


public class Exam1Q9 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer> a=new ArrayList<>();
        System.out.println("Enter value");
        int x=sc.nextInt();
        int sum=0;
        while(x!=-1){
            a.add(x);
            if(x>0){
            sum=sum+x;
            }
            System.out.println("Enter value");
            x=sc.nextInt();
        }
        for(int i=0; i<a.size(); i++){
            System.out.print(a.get(i)+" ");
        } 
        System.out.println();
        System.out.println(sum);
    }
}
