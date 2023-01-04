package jSON;

import org.json.simple.JSONArray;

public class JsonArray {

	public static void main1(String args[]){    
		JSONArray arr = new JSONArray();  
		arr.add("sonoo");    
		arr.add(new Integer(27));    
		arr.add(new Double(600000));  
		arr.add(230);
		arr.add(true);
		arr.add(null);
		System.out.print(arr);  
	}
	
	public static void main(String[] args) {
		JSONArray array = new JSONArray();
		array.add(23);
		array.add("asmil");
		System.out.println(array);
		
	}
}    