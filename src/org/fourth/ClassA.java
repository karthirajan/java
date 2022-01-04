package org.fourth;

public class ClassA extends ClassB{
	
	public ClassA(){
		
		this(123); // super class
		
		System.out.println("default constructor");
		
	}
	
    public ClassA(int id){
		
    	this("karthi");
    	
		System.out.println("arg based constructor :"+id);
		
	}
    
    public ClassA(String id){
		
    	super(46644);
		System.out.println("arg based constructor :"+id);
		
	}
	
	
	public static void main(String[] args) {
		
		ClassA a = new ClassA();
		
		
		
	}

}
