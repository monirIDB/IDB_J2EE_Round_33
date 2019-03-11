
package com.threads;


public class HelloRunner01 implements Runnable{
    public void run(){
    for(int i=0; i<50; i++){
        System.out.println("Hello run I am 2nd" );
    }
    
    }
}
