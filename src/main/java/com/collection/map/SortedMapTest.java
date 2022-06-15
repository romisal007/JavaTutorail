package com.collection.map;

import java.util.Map.Entry;
import java.util.SortedMap;
import java.util.TreeMap;

public class SortedMapTest {

	public static void main(String[] args) {

		SortedMap<Integer, String> mapHttpStatus = new TreeMap<Integer, String>();
		mapHttpStatus.put(100, "Continue");
		mapHttpStatus.put(200, "Ok");
		mapHttpStatus.put(300, "Multiple choices");
		mapHttpStatus.put(400, "Bad request");
		mapHttpStatus.put(401, "Unauthorized");
		mapHttpStatus.put(402, "Payment Required");
		mapHttpStatus.put(403, "Forbidden");
		mapHttpStatus.put(404, "Not Found");
		mapHttpStatus.put(500, "Internal server Error");
		mapHttpStatus.put(501, "Not Implemented");
		mapHttpStatus.put(502, "Bad Gateway");

		// System.out.println(mapHttpStatus);
		System.out.println("All key value pairs are");
		for (Integer code : mapHttpStatus.keySet()) {
			System.out.println(code + "-> " + mapHttpStatus.get(code));

		}

		Integer firstKey = mapHttpStatus.firstKey();
		String firstValue = mapHttpStatus.get(firstKey);
		System.out.println("first key value :" + firstKey + " ->" + firstValue);

		Integer lastkey = mapHttpStatus.lastKey();
		String lastValue = mapHttpStatus.get(lastkey);
		System.out.println("Last key value : " + lastkey + " -> " + lastValue);

		SortedMap<Integer, String> mapxxStatus=mapHttpStatus.subMap(300, 404);
		System.out.println("Status between 3xx to 4xx is");
		for (Integer code : mapxxStatus.keySet()) {
			System.out.println(code+ " -> "+mapxxStatus.get(code) );
			
		}
		
		SortedMap<Integer, String> mapUnder300=mapHttpStatus.headMap(300);
		SortedMap<Integer, String> mapAbove500=mapHttpStatus.tailMap(500);
		
		System.out.println("Status under 300 ");
		for (Entry<Integer, String> entry : mapUnder300.entrySet()) {
			Integer key = entry.getKey();
			String val = entry.getValue();
			
			System.out.println(key +" "+val);
		}
		System.out.println("Status above 500");
		for (Entry<Integer, String> entry : mapAbove500.entrySet()) {
			Integer key = entry.getKey();
			String val = entry.getValue();
			System.out.println(key+ " "+ val);
		}
		
		
		
	}

}
