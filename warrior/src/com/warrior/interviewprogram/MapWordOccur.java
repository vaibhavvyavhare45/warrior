package com.warrior.interviewprogram;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class MapWordOccur {
	
	public static void main(String[] args) {

		String s = "I'm Indian citizen . . I live in India . India has 27 states";
		String words[] = s.split(" ");
	//	 System.out.println(Arrays.toString(words));
		HashMap<String, Integer> hs = new HashMap<>();
		for (String word : words) {
			if (hs.containsKey(word))
				hs.put(word, hs.get(word) + 1);
			else
				hs.put(word, 1);
		}
		System.out.println(hs);
		Set<Entry<String, Integer>> entries = hs.entrySet();
		for (Entry<String, Integer> entry : entries) {
			System.out.println(entry.getKey() + "\t\t==> " + entry.getValue());

		}
		TreeMap<String, Integer> tm=new TreeMap<>(hs);
		Set<Entry<String,Integer>> so=tm.entrySet();
		System.out.println("<<<<Sorted by key>>>>");
		for (Entry<String, Integer> entry : so) {
			System.out.println(entry.getKey()+"\t\t<== "+entry.getValue());
			
		}
		
		//let's sort the Hashmap  value but there  is no direct way to sort hashmap by value
		//but you can do this writing your comparator which take Map.Entry object
		//arrange them in it increasing order or decreasing order.
		Comparator <Entry<String ,Integer>> com=new Comparator<Entry<String,Integer>>() 
		{

			@Override
			public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {
				Integer v1=o1.getValue();
				Integer v2=o2.getValue();
				return v1.compareTo(v2);
			}
			
		};
		List<Entry<String,Integer>> li=new ArrayList<Entry<String,Integer>>(entries);
		Collections.sort(li,com);
		LinkedHashMap<String, Integer> lhm=new LinkedHashMap<String,Integer>(li.size());
		for (Entry<String, Integer> entry : li) {
			lhm.put(entry.getKey(),entry.getValue());
		}
		System.out.println("<<<<sorted by value>>>>");
		Set<Entry<String,Integer>> entrySortedByValue=lhm.entrySet();
		for (Entry<String, Integer> entry : entrySortedByValue) {
			System.out.println(entry.getKey()+"\t\t==> "+entry.getValue());
			
		}
		

	}
}
