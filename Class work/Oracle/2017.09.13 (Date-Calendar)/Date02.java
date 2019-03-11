import java.util.Date;
import java.text.SimpleDateFormat;
public class Date02{
	public static void main(String[] args){
		Date d=new Date();
		SimpleDateFormat df=new SimpleDateFormat("dd-MM-yyyy");
		String formatDate=df.format(d);
		System.out.println("Today's date is; "+formatDate);
	}
}
//When we format date then it will become string