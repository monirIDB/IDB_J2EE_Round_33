import java.io.File;
import java.io.IOException;
public class Q39File{
	public static void main(String[] args){
		try{
			String add="D:\\Monir R33\\Class Work\\2017.09.25\\test.txt";
			File myFile=new File(add);
			boolean b1=myFile.createNewFile();
			if(b1){
				System.out.println("File is created succesfully");
			}else{
				System.out.println("File not is created");
			}
		}catch(IOException ioe){
			System.out.println("Check input output");
		}
	}
}