package FolderAndFiles;

import java.awt.Frame;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CreateFolder {

	public static void main(String[] args) throws IOException {

		File file = new File("C:\\Users\\Administrator\\Desktop\\sample.txt");
		file.createNewFile();
//		//		boolean present = file.exists();
//		//		
//		//		System.out.println("Before Creation - " + file.exists());
//		//		
//		//		if (present == false) {
//		//			file.mkdirs();
//		//			System.out.println("Create agiruchu da venna");
//		//		}
//		//		else {
//		//			System.out.println("Already Exist");
//		//		}
//		//		System.out.println(file.exists());
//		//boolean test = 	file.createNewFile();
//
//		//System.out.println(test);
//
//		//		file.delete();
//
//		//		System.out.println(file.delete());
//
//		//File file1 = new File("C:\\Users\\Administrator\\Desktop\\NewName.txt");
//
//		//		file.renameTo(file1);
//		//System.out.println(file.renameTo(file1) + " checking");
//
//		//		System.out.println(file1.getName());
//
//		//	System.out.println(file1);
//
//		//		String A[]=file.list();
//		//		for(String a:A) {
//		//			System.out.println(a);
//		//		}
//
//		File[] f = file.listFiles();
////		for (File files : f) {
////			if (files.isFile()) {
////				System.out.println(files.getName());
////			}
////		}
////		System.out.println();
////		System.out.println("Folders --- List");
////
////		for (File files : f) {
////			if (files.isDirectory()) {
////				System.out.println(files.getName());
////			}
////		}
//
//		for (File files : f) {
//			if (files.isFile()) {
//				String fName= files.getName();
//				//int index = fName.lastIndexOf(".txt");
//				//String next = fName.substring(index+1);
//
//				//if (next.equals("txt")) {
//					//System.out.println(files.getName());
//				//}
//				if(fName.endsWith(".txt"))
//					System.out.println(fName);
//			}
//		}
		
		
//		FileWriter fw=new FileWriter(file, true);
//		fw.write("new text");
//		fw.flush();
//		fw.close();
//		
//		//read
//		FileReader fr=new FileReader(file);
//		int value=fr.read(); //-1
//		while(value!=-1) {
//			System.out.println((char)value);
//			value=fr.read();
//		}
		FileWriter fw=new FileWriter(file, true);
		BufferedWriter bw = new BufferedWriter(fw);
		
		fw.append("  Whole New text ");
		
		fw.flush();
		
		fw.append("hgfdg");
		fw.close();
		
		FileReader fReader=new FileReader(file);
		BufferedReader br=new BufferedReader(fReader);
		String con=br.readLine();
		while(con!=null) {
			System.out.println(con);
			con=br.readLine();
		}
		
		
		
	}
}
