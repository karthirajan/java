package org.sixth;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.Map.Entry;

public class TodayTask {
	

	private int id;
	
	private String mail;
	
	private float sal;
	
	public int getId() {
		return id;
	}

	public void setId(int i) {
		this.id = i;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public float getSal() {
		return sal;
//=======
//	public static void main(String[] args) {
//		Map<Integer , String > mp = new TreeMap<>();
//		mp.put(10, "java");
//		mp.put(20, "spl");
//        mp.put(30, "oracle");
//        mp.put(40, "Db");
//        mp.put(50, "selenium");
//        mp.put(60, "pspl");
//        mp.put(70, "had");
//        mp.put(80, "loop");
//        mp.put(90, "for");
//        Set<Integer> KeySet = mp.keySet();
//        System.out.println(KeySet);
//        Collection <String> values = mp.values();
//        System.out.println(values);
//        
//        Set <Entry <Integer,String>> entrySet = mp.entrySet();
//		for(Entry<Integer,String> entry : entrySet) {
//			System.out.println(entry);
//			System.out.println(entry.getKey());
//			System.out.println(entry.getValue());
//		
//>>>>>>> 1f7ddcb0fe3807df7a8a05d7e58f018ecc81e8d0
	}

	public void setSal(float sal) {
		this.sal = sal;
	}
	
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
        
        Set <Entry <Integer,String>> entrySet = mp.entrySet();
		for(Entry<Integer,String> entry : entrySet) {
			System.out.println(entry);
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
	
	
	}
}
}
