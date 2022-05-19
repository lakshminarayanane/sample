package org.apisample;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class SampleAPI {
	
	public static void main(String[] args) throws IOException, ParseException {
		
		FileReader reader = new FileReader("C:\\Users\\ASUS\\eclipse-workspace\\APITesting\\src\\test\\resources\\JSON\\data.json");
		
		JSONParser jsonparser = new JSONParser();
		
		Object obj = jsonparser.parse(reader);
		
		JSONObject jobject=(JSONObject)obj;
		
		Object data = jobject.get("data");
		
		JSONObject jdata = (JSONObject)data;
		
		Object id = jdata.get("id");
		System.out.println(id);
		
		Object email = jdata.get("email");
		System.out.println(email);
		
		Object firstName = jdata.get("first_name");
		System.out.println(firstName);
		
		Object lastName = jdata.get("last_name");
		System.out.println(lastName);
		
		
		Object avatar = jdata.get("avatar");
		System.out.println(avatar);
		
		Object support = jobject.get("support");
		JSONObject jsupport = (JSONObject)support;
		
		Object url = jsupport.get("url");
		System.out.println(url);
		
		Object text = jsupport.get("text");
		System.out.println(text);
	}
	
}
