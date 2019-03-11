import java.io.File;
//import java.io.Exception;
public class FileDelete1{
	public static void main(String[] args){
		
			String add="D:\\Monir R33\\Class Work\\2017.09.25\\test.txt";
			File myFile=new File(add);
			boolean b1=myFile.delete();
			if(b1){
				System.out.println("File is deleted succesfully");
			}else{
				System.out.println("File not is delete");
			}
		
	}
}