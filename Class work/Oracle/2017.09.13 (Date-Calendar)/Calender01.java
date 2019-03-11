import java.util.Calendar;
import java.util.Date;
public class Calender01{
	public static void main(String[] args){
		Calendar c = Calendar.getInstance();
		Date d = c.getTime();
		System.out.println(d);
	}
}