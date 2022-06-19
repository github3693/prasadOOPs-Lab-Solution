package secondAssignment;
import java.util.Scanner;
public class Employee {
	
	
	String Name ; 
	String emailId ;
	int departmentNumber ;
	String password;
	String emp;
	int number ;
	
	
	Employee(String  firstName , String lastName){
	
		
	
		Scanner Scanner = new Scanner (System.in);
		
		System.out.println("plse enter the department from the following");
		 
		
		System.out.println("1 technical");
		
		System.out.println("2 Admin");
		
		System.out.println("3 human resource");
	
		System.out.println("4 legal");
	  
		departmentNumber = 	Scanner.nextInt();
		
	    System.out.println("Dear harshit your generated credentials are as follows");
	 }
     public void nextInt() {
		// TODO Auto-generated method stub
		
	}
	public static void main(String[] args) {
    	 
    	  String firstName = null;
		  String lastName = null;
		  Employee obj = new Employee(  firstName ,lastName);
    	  
    	 obj.emailId = ("harshitchoudary@tech.abc.com") ;
    	 obj.password = " 181E@wFT";
    	 
    	 
    	 System.out.println(obj.emailId);
    	 System.out.println(obj.password);
     }

	}
	


