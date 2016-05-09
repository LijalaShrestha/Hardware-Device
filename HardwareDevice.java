
/**
 * Parent class for the child classes.
 * Various attributes were declared, initiated and executed to run the program.
 * Various methods were also created to execute the whole program.
 * @author (Lijala Shrestha) 
 * @version (20th March, 2016)
 */

//Question number 1)
public class HardwareDevice
{
   //Attributes initialised with their datatypes.
   private String description;
   private String manufacturer;
   private String nameOfCustomer;
   
    /**
     * Constructor is created to initialise the attributes.
     * Few parameters are passed
     */
    public HardwareDevice(String description, String manufacturer)
    {
        //Assigning the values to the corresponding attributes
        this.description = description;
        this.manufacturer = manufacturer;
        nameOfCustomer = "";
    }
    
    /**
     * These are the return type methods that returns the value of description, manufacturer and nameOfCustomer.
     */
    public String getDescription() //This is the accessor method for description.
    {
        return description;
    }
    
    public String getManufacturer() //This is the accessor method for manufacturer.
    {
        return manufacturer;
    }
    
    public String getNameOfCustomer() //This is the accessor method for the name of customer.
    {
        return nameOfCustomer;
    }
    
    /**
     * This is a non-return type method that sets a new value.
     */
    public void setNameOfCustomer(String nameOfCustomer)
    {
        this.nameOfCustomer = nameOfCustomer;
    }
    
    public void displayDescription() //This method prints the detailed description of the hardware and manufacturer.
    {        
        System.out.println("The " + description + "is manufactured by " + manufacturer);
        
        if(nameOfCustomer != "") //Displays the name of the customer if it is given.
        {
            System.out.println("Name of the Customer:- " + nameOfCustomer);
        }
    }
    
    
    
    

   
    
}
