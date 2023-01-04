package jSON;

import java.util.HashMap;  
import java.util.Map;

import javax.print.attribute.HashPrintJobAttributeSet;

import org.json.simple.JSONValue;  

public class JsonExample2{    
	public static void main1(String args[]){    
		Map obj=new HashMap();    
		obj.put("name","sonoo");    
		obj.put("age",new Integer(27));    
		obj.put("salary",new Double(600000));   
		obj.put("weight", 123);
		String jsonText = JSONValue.toJSONString(obj);  
		System.out.print(jsonText);  
	}
	
	
	public static void main(String[] args) {
		HashMap obj = new HashMap<>();
		
		obj.put("size", "2Litre");
		obj.put("brand", "Kamali");
		obj.put("weight", "3kg");
		obj.put("class", new JsonExample2());
		obj.put("class1", new JsonExample1());
		obj.put("class", new JsonExample2());
		
		System.out.println(obj);
		
		String jsonString = JSONValue.toJSONString(obj);
		System.out.println(jsonString);
	}
}    