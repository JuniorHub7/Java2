 import java.util.Scanner; 

class Contact
{
    private String FirstName, LastName;
    private String Email, Phone;
    
    //Getter and setter methods
    public void setFirstName(String x) { FirstName = x; }
    public void setLastName(String x) { LastName = x; }
    public void setEmail(String x) { Email = x; }
    public void setPhone(String x) { Phone = x; }
    
    public String getFirstName() { return FirstName; }
    public String getLastName() { return LastName; }
    public String getEmail() { return Email; }
    public String getPhone() { return Phone; }
    
}

public class Main
{
	public static void main(String[] args) 
	{
	    String x, choice;
	    
	    Scanner sc = new Scanner(System.in); 
	    
	    //Loop untill user enters 'y'
	    do
	    {
	        Contact list = new Contact(); //Creating an object of the class
	        
    		System.out.println("\nWelcome to Contact List application");
    		
    		System.out.print("\nEnter first name: ");
    		x = sc.nextLine();
    		list.setFirstName(x);
    		
    		System.out.print("Enter last name:  ");
    		x = sc.nextLine();
    		list.setLastName(x);
    		
    		System.out.print("Enter email:\t  ");
    		x = sc.nextLine();
    		list.setEmail(x);
    		
    		System.out.print("Enter phone:\t  ");
    		x = sc.nextLine();
    		list.setPhone(x);
    		
    		System.out.print("\n--------------------------------------------");
    		System.out.print("\n-----------Currect Contact------------------");
    		System.out.print("\n--------------------------------------------");
    		System.out.print("\nName:\t\t" + list.getFirstName() + list.getLastName());
    		System.out.print("\nEmail Address:\t" + list.getEmail());
    		System.out.print("\nPhone Number:\t" + list.getPhone());
    		System.out.print("\n--------------------------------------------");
    		
		    System.out.print("\n\nContinue? (y/n): ");
		    choice = sc.nextLine();
		    
	    }while(choice.compareTo("y") == 0);
	}
}