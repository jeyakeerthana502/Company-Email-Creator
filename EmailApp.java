import java.util.Scanner;

public class EmailApp {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter First Name: ");
		String firstName = in.nextLine();
		System.out.println("Enter Last Name: ");
		String lastName = in.nextLine();
		Email em1 =new Email(firstName, lastName); //Invokes the default constructor everytime a object of Email is created
		System.out.println(em1.showInfo());	
	}
	
	
}
