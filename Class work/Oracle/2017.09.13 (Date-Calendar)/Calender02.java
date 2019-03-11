import java.util.Calendar;
import java.util.Date;
import java.text.SimpleDateFormat;
public class Calender02{
	public static void main(String[] args){
		Calendar c = Calendar.getInstance();
		Date d = c.getTime();
		SimpleDateFormat df=new SimpleDateFormat("MMMM dd, yyyy ww-u hh:mm:ss");
		String formatDate=df.format(d);
		System.out.println(formatDate);
	}
}