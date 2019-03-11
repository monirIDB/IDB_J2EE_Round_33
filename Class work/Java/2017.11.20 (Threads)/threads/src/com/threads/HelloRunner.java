
package com.threads;


public class HelloRunner implements Runnable {
    public void run(){
    for(int i=0; i<50; i++){
        System.out.println("Hello run" );
    }
    }
   
    
}
