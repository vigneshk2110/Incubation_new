package Problems;

/* illustrate the size or range of various data types. */

public class SizeOfDataTypes {

	public static void main(String[] args) {

		System.out.println("Byte: " + (Byte.SIZE/8)+ " byte.\n"  +
				"Byte range: " + (Byte.MIN_VALUE) + " to " + Byte.MAX_VALUE+	
				"\nInteger: " + (Integer.SIZE/8) + " bytes.\n"+ 
				"Integer range: " + (Integer.MIN_VALUE) + " to " + Integer.MAX_VALUE+				
				"\nLong: " +(Long.SIZE/8) + " bytes.\n"+ 
				"Long range: " + (Long.MIN_VALUE) + " to " + Long.MAX_VALUE+	
				"\nCharacter: " + (Character.SIZE/8) + " bytes." +
				"\nFloat: " + (Float.SIZE/8) + " bytes.\n" + 
				"Float range: " + (Float.MIN_VALUE) + " to " + Float.MAX_VALUE+	
				"\nDouble: " + (Double.SIZE/8) + " bytes.\n"+ 
				"Double range: " + (Double.MIN_VALUE) + " to " + Double.MAX_VALUE);
	
	}
}
