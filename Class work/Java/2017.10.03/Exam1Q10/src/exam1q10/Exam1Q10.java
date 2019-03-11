
package exam1q10;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;


public class Exam1Q10 {
    public static void main(String[] args) throws IOException {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your ID");
        String id=sc.nextLine();
        System.out.println("Enter your Name");
        String name=sc.nextLine();
        System.out.println("Enter your Email");
        String email=sc.nextLine();
        System.out.println("Enter your Contact number");
        String num=sc.nextLine();
        System.out.println("Enter your Gender");
        String gender=sc.nextLine();
        System.out.println("Enter your Last Education");
        String edu=sc.nextLine();
        System.out.println("Enter your Skill");
        String skill=sc.nextLine();
        System.out.println("Enter your hobby");
        String hobby=sc.nextLine();
        String a="D:\\Monir R33\\Class Work\\2017.10.03\\Exam1Q10\\src\\exam1q10\\test.txt";
        File myFile=new File(a);
        FileWriter fw=new FileWriter(myFile);
        BufferedWriter bw=new BufferedWriter(fw);
        PrintWriter pw=new PrintWriter(bw);
        pw.write("My ID is: "+id);
        pw.println();
        pw.write("My Name is: "+name);
        pw.println();
        pw.write("My E-mail is: "+email);
        pw.println();
        pw.write("My Contact Number is: "+num);
        pw.println();
        pw.write("My Gender is: "+gender);
        pw.println();
        pw.write("My Last Education is: "+edu);
        pw.println();
        pw.write("My Skill is: "+skill);
        pw.println();
        pw.write("My Hobby is: "+hobby);
        pw.println();
        pw.close();
        pw.flush();
    }
    
}
