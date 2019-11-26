package retest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Q1 {
	public static void main(String[] args) {

		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("Apple", 1);
		map.put("HP", 2);
		map.put("Dell", 3);
		map.put("Asus", 4);
		System.out.println(map);
		Object[] v = map.values().toArray();
		Object[] k = map.keySet().toArray();
		Arrays.sort(v);
		System.out.println("After sorting");
		for (int i = 0; i < v.length; i++) {
			for (int j = 0; j < v.length; j++) {
				if (map.get(k[j]) == v[i]) {
					System.out.print(k[j] + "=" + map.get(k[j]) + " ");
				}
			}
		}

	}
}
