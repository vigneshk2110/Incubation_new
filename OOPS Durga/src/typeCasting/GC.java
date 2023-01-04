package typeCasting;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class GC {

	public static void main(String[] args) throws SQLException {
		Runtime r = Runtime.getRuntime();
		System.out.println(	r.totalMemory());
		System.out.println(	r.freeMemory());
	    ArrayList<String> a=new ArrayList<>();
	    List<String> b=Arrays.asList("asdasda");
	    
		for (int i = 0; i < 10000; i++) {
			String s = new String("Hellow");
			s=null;
			
			Date d1 = new Date();
			d1=null;
		}
		System.out.println(	r.freeMemory());
		r.gc();
		Runtime.getRuntime().gc();
		System.out.println(	r.freeMemory());
		
//		Connection ce = DriverManager.getConnection(null, null, null);
		
		
//		String[] array = {"raja", "jaggu", "Annan"};
		int[] array = {10,12,10,9,8};
		Arrays.sort(array);
		System.out.println(Arrays.toString(array));
		
	}
}
