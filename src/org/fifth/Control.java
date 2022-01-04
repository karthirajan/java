package org.fifth;

public class Control {
	
	//String
	
	//Collection of characters enclosed with double quotes.
	//String is a pre-defined class which is presented in java.lang.
	//String is basically an object & non-primitive data type.
	//String is an index based one. It starts from 0 and ends with n-1.
	
	//methods
	//----------
	//length()
	//contains()
	//equals()
	//equalIgnoreCase()
	//split()
	//toUpperCase()
	//toLowerCase()
	//indexOf()
	//lastIndexOf()
	//trim()
	//subString()
	
	public static void main(String[] args) {
	
		String s = "welcome to java session";
		
		int i = s.length();
		System.out.println(i);
		
	    boolean b = s.contains("java");
	    System.out.println(b);
	    
	    boolean c = s.equals("welcome to JAVA session");
	    System.out.println(c);
	    
	    boolean d = s.equalsIgnoreCase("welcome to JAVA session");
	    System.out.println(d);
	    
	    String[] w = s.split(" ");
	    for (int j = 0; j < w.length; j++) {
	    	
	    	if(w[j].equals("welcome") || w[j].contains("moc")){
	    	System.out.println(w[j]);
	    	}
	    	
		}
	    
	    String s1 = s.toUpperCase();
	    System.out.println(s1);
	    
	    String s2 = s1.toLowerCase();
	    System.out.println(s2);
	    
	    int k = s.indexOf('o');
	    System.out.println(k);
	    
	    int l = s.lastIndexOf('o');
	    System.out.println(l);
	    
	    String s3 = "    welcome";
	    System.out.println(s3.trim());
		
		String s4 = s.substring(3, 7);
		System.out.println(s4);
		
		String s5 = s.replace('e', 'l');
		System.out.println(s5);
		
		String s6 = s.replace("java", "html");
		System.out.println(s6);
		
		boolean e = s.startsWith("wel");
		System.out.println(e);
		
		boolean f = s.endsWith("n");
		System.out.println(f);
	
	}
}
