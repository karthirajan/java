package org.firstfloor;

import org.second.DayThree;
import org.second.DayTwo;

public class JavaSession extends DayTwo{ //braces - inside we are storing more things
	
	public String sabarishBabu(){
		
		return "Hi This is sabarish";	
		//void - no return type
		
		
	}
	
    public void satyan(){
		
		System.out.println("Hi this is satyan");
		
	}
    
    //store methods inside heap memory 
    
    public static void main(String[] args){
    	
    	JavaSession j = new JavaSession();
    	
    	String m = j.sabarishBabu();
    	System.out.println(m);
    	
    	j.satyan();
    	
    	
    	j.StudentData();
    	j.test();
    	
    	
    	DayThree.tree();
    	
    	
    	
    	
    	
    }

}
