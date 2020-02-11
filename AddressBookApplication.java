import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class AddressBookApplication {
	
	/*
	void initAddressbookExcercise(AddressBook ab) {
	}
	AddressBookApplication(){
		initAddressbookExcercise(ab)
	}*/
    String filename = null;
	void init(String filename) {
		this.filename = filename;
	}
	
	public static void main(String args[]) {
		
		

		
       //simply invokes static methods of the Menu class    	
    	AddressBook ab = new AddressBook();
		ab.listAdd();
		ab.list();
        //***YOU NOW FINISH CODE TO CALL ALL the rest of the static methods of the Menu class 

    }
}
//=========================================================================
//Following should be in a file called Menu.java

/* Menu class currently only has static methods to prompt to standard output information about a Contact like name,etc
 */


class AddressEntry {
    
    private String firstName, lastName, street, city, state, phone, email ;
    private int zip;
    
    public AddressEntry(String firstName,String lastName,String street,String city, String state, String phone, int zip) {
        setFirstName(firstName);
        setLastName(lastName);
        setCity(city);
        setState(state);
        setStreet(street);
        setPhone(phone);
        setZip(zip);
    }
    
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public String getState() {
        return state;
    }
    public void setState(String state) {
        this.state = state;
    }
    public String getStreet() {
        return street;
    }
    public void setStreet(String street) {
        this.street = street;
    }
    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
    public int getZip() {
        return zip;
    }
    public void setZip(int zip) {
        this.zip = zip;
    }
}



class AddressBook  {

HashMap<String,AddressEntry>map = new HashMap<String,AddressEntry>();
AddressEntry a = new AddressEntry(null, null, null, null, null, null, 0);
    public void listAdd() {
    	
		try {
			Scanner scanner = new Scanner(System.in);
			String filename = scanner.next();
			File file = new File(filename);
			FileReader fileReader = new FileReader(file);
			String cur = null;
			
			while() {
				
				(cur = fileReader.getEncoding()) 
				a.setFirstName((String)cur);
				
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
    	map.put(key, value)
    }
    public void list() {
    	String result = null;
        for (int i = 0; i < this.size(); i++) {
        	System.out.println("#"+ (i+1));
            AddressEntry a = get(i); 
            Menu.prompt_FirstName();
            System.out.println( a.getFirstName());
            Menu.prompt_LastName();
            System.out.println(   a.getLastName() );
            Menu.prompt_City();
            System.out.println(  a.getCity() );
            Menu.prompt_Street();
            System.out.println(  a.getStreet() );   
            Menu.prompt_State();
            System.out.println(  a.getState() );
            Menu.prompt_Phone();
            System.out.println(  a.getPhone() );
            Menu.prompt_Zip();
            System.out.println(  a.getZip() );
        }
    }
	public AddressBook() {
	
	}
	
}

class Menu {
   /*
    * prompt_FirstName  generates a standard output prompt for the First Name to be entered 
   */
    public static void prompt_FirstName() {
        System.out.print("First Name:");
    }
    public static void prompt_LastName() {
    	System.out.print("Last Name:");
    }
    public static void prompt_Street() {
    	System.out.print("Street:");
    }
    public static void prompt_City() {
    	System.out.print("City:");
    }
    public static void prompt_State() {
    	System.out.print("State:");
    }
    public static void prompt_Zip() {
    	System.out.print("Zip:");
    }
    public static void prompt_Phone() {
    	System.out.print("Phone:");
    }
    public static void prompt_Email() {
    	System.out.print("Email: ");
    }
}