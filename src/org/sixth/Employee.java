package org.sixth;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Employee {
	
	public static void main(String[] args) {
		
		TodayTask t = new TodayTask();
		t.setId(123);
		t.setMail("karthi");
		t.setSal(35435);
		
		TodayTask t1 = new TodayTask();
		t1.setId(132);
		t1.setMail("sabari");
		t1.setSal(35535);
		
		System.out.println("user defined list");
		
		List<TodayTask> l = new ArrayList<TodayTask>();
		l.add(t);
		l.add(t1);
		
		for (int i = 0; i < l.size(); i++) {
			
			System.out.println(l.get(i).getId());
			System.out.println(l.get(i).getMail());
			System.out.println(l.get(i).getSal());
			
		}
		
		System.out.println("user defined set");
		
		Set<TodayTask> s = new HashSet<TodayTask>();
		s.add(t);
		s.add(t1);
		
		for (TodayTask x : s) {
			
			System.out.println(x.getId());
			System.out.println(x.getMail());
			System.out.println(x.getSal());
			
		}
		
		System.out.println("user defined map");
		
		Map<Integer,TodayTask> m = new HashMap<Integer,TodayTask>();
		m.put(1, t);
		m.put(2, t1);
		
		Set<Entry<Integer, TodayTask>> entrySet = m.entrySet();
		for (Entry<Integer, TodayTask> x : entrySet) {
			System.out.println(x.getKey());
			System.out.println(x.getValue().getId());
			System.out.println(x.getValue().getMail());
			System.out.println(x.getValue().getSal());
			
		}
		
		
	}

}
