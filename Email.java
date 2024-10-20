
import java.util.Scanner;

public class Email {
	private String firstName; //set as private to ensure encapsulation
	private String lastName;
	private String password;
	private int defaultPasswordLength=8;
	private String department;
	private String email;
	private int mailBoxCapacity=500;
	private String alternateEmail;
	private String Suffix ="gct.com";
	
	//-------------------------------------------------------------------
	//Constructor to receive the first name and last name
	public Email(String firstName, String lastName) {
		this.firstName=firstName; //this refers to the class variable not the local one
		this.lastName=lastName;
		
		//Call a method asking for the department -returns department
		this.department=setDepartment();
		
		//Call method that returns random password
		this.password= randomPassword(defaultPasswordLength);
		System.out.println("Your Password is : "+this.password);
		
		//Combine element to generate email
		email =firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" +department+"."+ Suffix ;
		
	}
	
	//----------------------------------------------------------------
	//SETTERS
	
	//Ask for the department method
	private String setDepartment() {
		System.out.println(" DEPARTMENT CODES\n1) For Sales\n2) For Development\n3) For Accounting\n0) For none\n Enter department code: ");
		Scanner in = new Scanner(System.in); //in eclipse ctrl+shift+o to import libraries
		int choice;
		choice=in.nextInt();
		if(choice==1) {return "sales";	}
		else if(choice==2) {return "dev";} //ctril+alt+downarrow to duplicate selected line
		else if(choice==3) {return "acc";}
		else {return "";}
		
	}
	
	//Generate the random password method
	private String randomPassword(int length) {
		String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%";
		char[] password =new char[length];
		for(int i=0; i<length;i++) {
			int rand=(int)(Math.random() * passwordSet.length()); //Math.random() returns value between 0 to 1 with floating point
			password[i]=passwordSet.charAt(rand);
		}
		return new String(password);
		
	}
	
	//Set mailbox capacity method
	public void setMailBoxCapacity(int capacity) {
		this.mailBoxCapacity =capacity;
	}
	
	
	
	//Set the alternate email method
	public void setAlternateEmail(String altEmail) {
		this.alternateEmail=altEmail;
	}

	
	//change the password method
	public void changePassword(String password) {
		this.password =password;
	}
	//--------------------------------------------------------
	//GETTERS
	public int getMailBoxCapacity() {
		return mailBoxCapacity;
	}
	
	public String getAlernateEmail() {
		return alternateEmail;
	}
	
	public String getPassword() {
		return password;
	}
	
	public String showInfo() {
		return "DISPLAY NAME : " + firstName + " " +lastName + 
				"\nCOMPANY EMAIL: "+email+
				"\nMAILBOX CAPACITY:"+mailBoxCapacity +"mb";
	}
}
