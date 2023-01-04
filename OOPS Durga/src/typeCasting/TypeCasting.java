package typeCasting;

public class TypeCasting {

	public static void main(String[] args) {
		
//		Compiles but throws Class Cast Exception - obj Should be of type StringBuffer or its child to be typecasted
//		Object obj = new String ("Vignesh");
//		StringBuffer sB = (StringBuffer) obj; 
		
		Object obj = new String ("Vignesh");
		String sB = (String) obj;
		
		System.out.println(sB);
		System.out.println(sB == obj);
		
		
		StringBuffer sBuff = new StringBuffer("Vignesh Kanna");
		Object obj1 = (Object)sBuff;
		
		
		System.out.println(obj1.toString());
		
//		In the above example obj1 is not a new object but a reference to an object of type StringBuffer created already
//		This can be proved as below
		
		System.out.println(sBuff == obj1);
		
//		BUT  --- Below is false
		Object obj2 = new StringBuffer("Vignesh Kanna");
		System.out.println(sBuff == obj2);
		
		
		Integer in = new Integer(10);
		Number num = (Number)in;
		
		System.out.println("" + (in == num) + " - Last One");
		
		System.gc();
		
		System.out.println("hellow");
		
		Runtime r = Runtime.getRuntime();
		System.out.println(	r.freeMemory());
		System.out.println(	r.totalMemory());
		String r1 = "niku";
		System.out.println(r.hashCode() + " - Hashcode");
		System.out.println(	r.freeMemory());
		System.out.println(	r.totalMemory());
		

	}

}
