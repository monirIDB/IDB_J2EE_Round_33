import java.util.Calendar;
import java.util.Date;
import java.text.SimpleDateFormat;
public class Calendar03{
	public static void main(String[] args) throws Exception{
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		String sd = "21-10-2014";
		Date d1 = sdf.parse(sd);
		String s2 = sdf.format(d1);
		System.out.println(s2);
		
		Calendar c = Calendar.getInstance();
		Date d2 = c.getTime();
		System.out.println(d2);
		
		Calendar c3 = Calendar.getInstance();
		//SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		String sd3 = "21-10-2012";
		Date d3 = sdf.parse(sd3);
		c3.setTime(d3);
		Date d31 = c.getTime();
		System.out.println(d31);
	}
}