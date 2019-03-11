import java.io.File;
import java.io.IOException;
import java.io.FileWriter;
public class FileWriter01{
	public static void main(String[] args){
		try{
			String add="D:\\Monir R33\\Class Work\\2017.09.26\\test.txt";
			File myFile=new File(add);
			boolean b1=myFile.createNewFile();
			if(b1){
				System.out.println("File is created succesfully");
			}else{
				System.out.println("File not is created");
			}
			FileWriter fw=new FileWriter(myFile);
			char[] ca = {'a','b'};
			fw.write(ca);
			fw.close(ca);
		}catch(IOException ioe){
			System.out.println("Check input output");
		}
	}
}