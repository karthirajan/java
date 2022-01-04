package org.fourth;

public class Employee {
	
	
	//arguments - by using arguments we can give input to our method
	
	public void employeeDetails(int id) {
		
		System.out.println("employee id is :"+id);

	}
	
    public void employeeDetails(String name) {
		
		
		System.out.println("employee name is :"+name);

	}
    
    public void employeeDetails(String mail, int pin) {
		
		
		System.out.println("employee mail is :"+mail);
		System.out.println("employee pin is :"+pin);

	}
    
    public void employeeDetails(int doorNo, String address) {
		
		
		System.out.println("employee address is :"+address);
		System.out.println("employee doorNo is :"+doorNo);

	}
    
    public static void main(String[] args) {
		
    	Employee e = new Employee();
    	e.employeeDetails(200);
    	e.employeeDetails("karthi");
    	e.employeeDetails("karthi@gmail.com", 7675);
    	e.employeeDetails(22, "chennai");
    	
	}

}
