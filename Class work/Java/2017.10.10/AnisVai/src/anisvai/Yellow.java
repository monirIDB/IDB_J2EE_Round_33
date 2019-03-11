package anisvai;
import java.io.*;
//import java.util.Scanner;

public class Yellow
{
    public static void main(String args[]) throws IOException
    {
        Runtime runtime = Runtime.getRuntime();
        //Scanner sc=new Scanner(System.in);
        //int b=sc.nextInt();
        //File f=new File(b);
        //InputStreamReader isr= new InputStreamReader(f);
	//BufferedReader br=new BufferedReader(isr);
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
        System.out.print("Enter No. of Seconds after which You want your Computer to Shutdown :");
        long a=Long.parseLong(br.readLine());
		
        Process proc = runtime.exec("shutdown -s -t " +a);
		
        System.exit(0);
    }
}