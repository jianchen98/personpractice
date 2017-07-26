import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class TestDate {
  public static void main(String[] args) throws ParseException {
	  SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");  
	    String str3 = "1927-12-31 23:54:07";  
	    String str4 = "1927-12-31 23:54:08";  
	    Date sDt3 = sf.parse(str3);  
	    Date sDt4 = sf.parse(str4);  
	    System.out.println(sDt3);
	    System.out.println(sDt4);
	    long ld3 = sDt3.getTime() /1000;  
	    long ld4 = sDt4.getTime() /1000;
	    System.out.println(ld3);
	    System.out.println(ld4);
	    System.out.println(ld4-ld3);
	    List list = new ArrayList();
}
	 
}
