package collectionmethod;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class AddAll {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer> a= new ArrayList<>();
        System.out.println("Enter value");
        int x=sc.nextInt();
        while(x!=-1){
            a.add(x);
            System.out.println("Enter value");
            x=sc.nextInt();
        }
       for(int i=0; i<a.size(); i++){
        System.out.print(a.get(i)+ " ");
      } 
       System.out.println(" ");
      Collections.reverse(a);
      for(int i=0; i<a.size(); i++){
        System.out.print(a.get(i)+ " ");
      }
    }
}
