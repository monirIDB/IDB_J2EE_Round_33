package test1;

import java.io.*;
//import java.io.

public class KeyboardInput {

    public static void main(String[] args) {
        String s;
        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(ir);
        System.out.println("Unix: Type ctr1-d to exit." + "\nWindows: Type ctrl-z to exit");
    

try{
    s= in.readLine();
while (s!=null){
    System.out.println("Read: "+s);
    s=in.readLine();
}
while((s=in.readLine())!=null){
    System.out.println("Read: " +s);
}
in.close();
}catch(Exception e){
    e.printStackTrace();
}
}
}
