package com.collection.map;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.Set;

public class LogicTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = { 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 3, 3, 2, 2, 2, 2, 2, 2 };
		int count = 1;
		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				if (j > i) {
					// System.out.println((a[i] + " :" + a[j]));
					if (a[i] == a[j]) {
						count++;
						hm = setMapVales(a[i], count, hm);
					} else {
						count = 1;
					}
					break;
				}
			}
		}
		System.out.println(hm);
		Optional<Entry<Integer, Integer>> maxEntry = hm.entrySet().stream()
				.max(Comparator.comparing(Map.Entry::getValue));
		System.out.println("Maximum no of consequative value  " + maxEntry.get().getKey() + " appeared "
				+ maxEntry.get().getValue() + " times");
	}
	public static HashMap<Integer, Integer> setMapVales(int k, int count, HashMap<Integer, Integer> hm) {

		boolean key = hm.containsKey(k);
		if (key) {
			Set<Entry<Integer, Integer>> entries = hm.entrySet();
			for (Entry<Integer, Integer> entry : entries) {
				// System.out.println("Key "+ entry.getKey() +" Value" + entry.getValue());
				if (entry.getKey() == k && entry.getValue() < count) {
					// System.out.println(k + "replace " + " " + count);
					hm.replace(k, count);
				}
			}
		} else {
			hm.put(k, count);
		}
		return hm;
	}
}
