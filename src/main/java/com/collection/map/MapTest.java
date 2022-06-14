package com.collection.map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapTest {

	public static void main(String[] args) {

		Map<Integer, String> mapHttpError = new HashMap<Integer, String>();
		mapHttpError.put(200, "ok");
		mapHttpError.put(404, "Not Found");
		mapHttpError.put(500, "Internal Server error");

		System.out.println(mapHttpError);

		Map<String, String> mapContacts = new LinkedHashMap<String, String>();
		mapContacts.put("8888714533", "Rohit");
		mapContacts.put("9999661234", "Balu");
		mapContacts.put("9890556644", "Aarti");

		System.out.println(mapContacts);

		Map<String, String> mapLang = new TreeMap<String, String>();
		mapLang.put(".c", "c");
		mapLang.put(".java", "java");
		mapLang.put(".cpp", "C++");
		mapLang.put(".cs", "C#");

		System.out.println(mapLang);

		System.out.println("500 : " + mapHttpError.get(500));
		// If map does not have key then it return null
		System.out.println("301 : " + mapHttpError.get(301));

		//checking specific key
		if (mapHttpError.containsKey(200)) {
			System.out.println("Http Status 200");
		}
		
		if(mapHttpError.containsValue("ok")) {
			System.out.println("Status is ok");
		}
		
		String removablvalue=mapHttpError.remove(500);
		if( removablvalue!=null) {
			System.out.println("500 internal server error is removed");
		}
		
		mapHttpError.put(304, "Not Modified");
		//replacing value associated wit key 
		System.out.println("Map before value replcae "+ mapHttpError);
		mapHttpError.replace(304, "No changes");
		System.out.println("map after value replace : "+mapHttpError);
		
		int size= mapHttpError.size();
		System.out.println(size);
		
	}

}
