package com.collection.map;

import java.util.Map;
import java.util.NavigableMap;
import java.util.Set;
import java.util.TreeMap;

public class NavigableMapTest {

	public static void main(String[] args) {

		
		NavigableMap<Integer, String> mapHttpStatus = new TreeMap<>();
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
	
		Set<Integer> ascendingKeys=mapHttpStatus.keySet();
		System.out.println("Ascending keys :"+ ascendingKeys);
		
		Set<Integer> desckeys=mapHttpStatus.descendingKeySet();
		System.out.println("Descending keys : "+ desckeys);
		
		NavigableMap<Integer,String> descMap=mapHttpStatus.descendingMap();
		System.out.println("Descing=ding view of map is");
		for (Integer code : desckeys) {
			System.out.println(code+ "->"+ descMap.get(code));
		}
		System.out.println();
		//lowerKey(K key): returns the greatest key strictly less than the given key.

		Integer lowerKey = mapHttpStatus.lowerKey(401);
		System.out.println("Lower key: " + lowerKey);

		//floorKey(K key): returns the greatest key less than or equal to the given key.

		Integer floorKey = mapHttpStatus.floorKey(401);
		System.out.println("Floor key: " + floorKey);

	//	higherKey(K key): returns the least key strictly greater than the given key.

		Integer higherKey = mapHttpStatus.higherKey(500);
		System.out.println("Higher key: " + higherKey);
		
		//ceilingKey(K key): returns the least key greater than or equal to the given key.
		 
		Integer ceilingKey = mapHttpStatus.ceilingKey(500);
		System.out.println("Ceiling key: " + ceilingKey);
	
		System.out.println();
		
		
		Map.Entry<Integer, String> firstEntry = mapHttpStatus.firstEntry();
		 
		System.out.println("First entry: " + firstEntry.getKey() + " => " + firstEntry.getValue());
		 
		Map.Entry<Integer, String> lastEntry = mapHttpStatus.lastEntry();
		 
		System.out.println("Last entry: " + lastEntry.getKey() + " => " + lastEntry.getValue());
		 
		Map.Entry<Integer, String> lowerEntry = mapHttpStatus.lowerEntry(401);
		System.out.println("Lower entry: " + lowerEntry.getKey() + " => " + lowerEntry.getValue());
		 
		Map.Entry<Integer, String> floorEntry = mapHttpStatus.floorEntry(401);
		System.out.println("Floor entry: " + floorEntry.getKey() + " => " + floorEntry.getValue());
		 
		Map.Entry<Integer, String> higherEntry = mapHttpStatus.higherEntry(500);
		System.out.println("Higher entry: " + higherEntry.getKey() + " => " + higherEntry.getValue());
		 
		Map.Entry<Integer, String> ceilingEntry = mapHttpStatus.ceilingEntry(500);
		System.out.println("Ceiling entry: " + ceilingEntry.getKey() + " => " + ceilingEntry.getValue());
		 
		mapHttpStatus.pollFirstEntry();
		mapHttpStatus.pollLastEntry();
		 
		 
		System.out.println("\nMap after first and last entries were polled:");
		 
		for (Integer key : mapHttpStatus.keySet()) {
		    System.out.println(key + " => " + mapHttpStatus.get(key));
		}
	}

}
