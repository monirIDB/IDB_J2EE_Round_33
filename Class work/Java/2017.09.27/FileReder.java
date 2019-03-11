import java.io.File;
import java.io.IOException;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.PrintWriter;
import java.util.Scanner;
public class FileReader01{
	public static void main(String[] args){
		
			
		String a="D:\\Monir R33\\Class Work\\2017.09.27\\test.txt";
			File f=new File(a);
			BuffurReader br=new BufferedReader(f);
		try{
			String add="D:\\Monir R33\\Class Work\\2017.09.27\\test5.txt";
			File myFile=new File(add);
			boolean b1=myFile.createNewFile();
			if(b1){
				System.out.println("File is created succesfully");
			}else{
				System.out.println("File not is created");
			}
			FileWriter fw=new FileWriter(myFile);
			BufferedWriter bw=new BufferedWriter(fw);
			PrintWriter pw=new PrintWriter(bw);
			//char[] ca = {'M','o','h','a','m','m','a','d'};
		
			
			String s=br.readLine();
			while(!s.equals(null)){
				pw.writer(s);
				s=br.readLine();
			}
			br.close();
			pw.flush();
			pw.close();
		}catch(IOException ioe){
			System.out.println("Check input output");
		}
	}
}

//1 create a file object
//2 FileReader
//3 BufferReader