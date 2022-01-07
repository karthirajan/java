package org.sixth;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.Map.Entry;

public class TodayTask {
	
	public static void main(String[] args) {
		Map<Integer , String > mp = new TreeMap<>();
		mp.put(10, "java");
		mp.put(20, "spl");
        mp.put(30, "oracle");
        mp.put(40, "Db");
        mp.put(50, "selenium");
        mp.put(60, "pspl");
        mp.put(70, "had");
        mp.put(80, "loop");
        mp.put(90, "for");
        Set<Integer> KeySet = mp.keySet();
        System.out.println(KeySet);
        Collection <String> values = mp.values();
        System.out.println(values);
        
    
	}

}
