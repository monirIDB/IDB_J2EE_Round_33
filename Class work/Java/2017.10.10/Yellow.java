import java.io.*;

public class Yellow
{
    public static void main(String args[]) throws IOException
    {
        Runtime runtime = Runtime.getRuntime();
		InputStreamReader isr=new InputStreamReader();
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
        System.out.print("Enter No. of Seconds after which You want your Computer to Shutdown :");
        long a=Long.parseLong(br.readLine());
		
        Process proc = runtime.exec("shutdown -s -t " +a);
		
        System.exit(0);
    }
}