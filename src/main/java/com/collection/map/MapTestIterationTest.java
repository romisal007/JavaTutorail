package com.collection.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapTestIterationTest {

	public static void main(String[] args) {

		Map<String, String> mapCountryCode = new HashMap<String, String>();
		mapCountryCode.put("1", "USA");
		mapCountryCode.put("91", "India");
		mapCountryCode.put("44", "UK");
		mapCountryCode.put("33", "France");
		mapCountryCode.put("81", "Japan");

		System.out.println(mapCountryCode);

		Set<String> setCode = mapCountryCode.keySet();
		Iterator<String> iteratror = setCode.iterator();
		while (iteratror.hasNext()) {

			String code = iteratror.next();
			String country = mapCountryCode.get(code);
			System.out.println(code + ": " + country);
		}
		System.out.println();
		// to get values only

		Collection<String> country = mapCountryCode.values();

		for (String c : country) {

			System.out.println(c);
		}

		System.out.println();
		// entrySet(): returns a Set view of the mappings contained in this map

		Set<Map.Entry<String, String>> entries = mapCountryCode.entrySet();

		for (Map.Entry<String, String> entry : entries) {

			String code = entry.getKey();
			String countries = entry.getValue();
			System.out.println(code + ":" + countries);
		}

	}

}
