package SuperThis;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class FileIO {

	public static void main(String[] args) {
		int [] nums = {1,2,3,4,5};
		try {
			BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"));
			writer.write("This is written with BufferedWritter");
			writer.write("\nThis is Line no 2");
			
			for (int i : nums) {
				writer.write("\n" + i);
			}
			writer.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		
		try {
			BufferedReader reader = new BufferedReader(new FileReader("output.txt"));
			String sentence;
			while ((sentence = reader.readLine()) != null) {
				System.out.println(sentence);
			}
			reader.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
