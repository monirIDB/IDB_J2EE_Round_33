import java.io.File;
import java.io.IOException;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.PrintWriter;
import java.util.Scanner;
public class CreateFile{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter ID");
		String id=sc.nextLine();
		System.out.println("Enter Name");
		String name=sc.nextLine();
		System.out.println("Enter Email");
		String email=sc.nextLine();
		System.out.println("Enter Address");
		String address=sc.nextLine();
		try{
			String add="D:\\Monir R33\\Class Work\\2017.09.27\\test3.txt";
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
		
			
			bw.write("ID: "+id);
			bw.newLine();
			bw.write("Name: "+name);
			bw.newLine();
			bw.write("Email: "+email);
			bw.newLine();
			bw.write("Address: "+address);
			bw.flush();
			bw.close();
		}catch(IOException ioe){
			System.out.println("Check input output");
		}
	}
}