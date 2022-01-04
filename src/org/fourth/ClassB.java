package org.fourth;

public class ClassB {
	
	public ClassB() {
		this(677);
		System.out.println("super class default constructor");
		
	}
	
    public ClassB(int id) {
		
		System.out.println("super class arg based constructor :"+id);
		
	}

}
