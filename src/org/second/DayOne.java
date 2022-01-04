package org.second;

public class DayOne {
	
	public void apple() {
		System.out.println("Imported apple");

	}
	
	public void StudentData() {
		
		int a = 25;
		
		int b = 30;
		
		// int,long,double,float into string conversion
		String c = String.valueOf(b);
		
		System.out.println(a+b);
		System.out.println(a+c);
	}
	
	
	
	
	public static void main(String[] args) {
		
		DayOne d = new DayOne();
		d.StudentData();
		
	}

}
