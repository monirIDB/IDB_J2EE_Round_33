
package com.exam3;

import java.util.Scanner;


public class E1Q3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int i;
        for(i=2; i<a; i++){
            if(a%i==0){
            System.out.println(a+" is a not prime Number");
            break;
            }
        }
        if(i==a){
            System.out.println(a+" is a Prime Number");
        }
    }
}
