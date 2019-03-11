package com.threads;

public class ThreadTester {

    public static void main(String[] args) {

//        Thread t1 = new Thread(new HelloRunner());
//        Thread t2 = new Thread(new HelloRunner01());
//        Thread t3= new Thread(new Win1Thread());
//        Thread t4= new Thread(new Win2Thread());
//        t3.start();
//        t4.start();
// 
//        t1.start();
//        t2.start();
Win1Thread w1=new Win1Thread();
Win2Thread w2=new Win2Thread();
w1.run();
w2.run();
       
        
    }
}
