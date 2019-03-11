import java.io.File;
import java.io.IOException;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.PrintWriter;
import java.io.FileReader;
public class FileReder01{
	public static void main(String[] args){
		
			
			
		try{
			String a="D:\\Monir R33\\Class Work\\2017.09.27\\test.txt";
			File f=new File(a);
			FileReader fr=new FileReader(f);
			BufferedReader br=new BufferedReader(fr);
			String add="D:\\Monir R33\\Class Work\\2017.09.27\\test5.txt";
			File myFile=new File(add);
			boolean b1=myFile.createNewFile();
			if(b1){
				System.out.println("File is created succesfully");
			}else{
				System.out.println("File is not created");
			}
			FileWriter fw=new FileWriter(myFile);
			BufferedWriter bw=new BufferedWriter(fw);
			PrintWriter pw=new PrintWriter(bw);
			//char[] ca = {'M','o','h','a','m','m','a','d'};
		
			
			String s=br.readLine();
			while(s!=null){
				pw.write(s);
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