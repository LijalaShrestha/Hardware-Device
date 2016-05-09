
/**
 * Child class of the parent class HardwareDevice, which is created to sell the Hardware Device.
 * Various attributes were declared, initiated and executed to run the program.
 * Various methods were also created to execute the whole program.
 * @author (Lijala Shrestha) 
 * @version (20th March, 2016)
 */
//Question number 4)
public class HardwareDeviceToSell extends HardwareDevice
{
    //Attributes initialised according to their datatypes.
    private double price;
    private double tax_amount;
    private double total_amount;
    private String selling_date;
    private boolean sellingStatus;

    /**
     * Constructor is created to initialise the attributes.
     * Few parameters are passed.
     */
    public HardwareDeviceToSell(String description, String manufacturer, double price, double tax_amount)
    {
        super(description, manufacturer); //super class called.
        
        //Assigning vakues to the corresponding attributes.
        this.price = price;
        this.tax_amount = tax_amount;
        total_amount = total_amount;
        selling_date = "";
        sellingStatus = false;
    }
    
    /**
     * These are the return type methods that returns the values of the attributes initialised above.
     */
    public double getPrice() //Accessor method for price.
    {
        return price;
    }
    
    public double getTax_amount() //Accessor method for tax_amount.
    {
        return tax_amount;
    }
    
    public double getTotal_amount() //Accessor method for total_amount.
    {
        return total_amount;
    }
    
    public String getSelling_date() //Accessor method for selling_date.
    {
        return selling_date;
    }
    
    public boolean getSellingStatus() //Accessor method for sellingStatus.
    {
        return sellingStatus;
    }
    
    /**
     * These are non-return type method that assigns a new value for price and tax_amount. 
     */
    public void setPrice(double price)
    {
        if(sellingStatus == false)
        {
            this.price = price;
        }
        else
        {
            System.out.println("Sorry, the Hardware Device is already sold. Thus, its price cannot be changed.");
        }
    }
    
    public void setTax_amount(double tax_amount)
    {
        if(sellingStatus == false)
        {
            this.tax_amount = tax_amount;
        }
        else
        {
            System.out.println("Sorry, the Hardware Device is already sold. Thus, its tax rate cannot be changed.");
        }
    }
    
   /**
    * This is the method to sell the Hardware Device.
    */
    public void sellingMethod(String nameOfCustomer, String selling_date)
    {
        if(sellingStatus == true)
        {
           System.out.println("Sorry, the Hardware Device is already sold.");
        }
        else
        {
            setNameOfCustomer(nameOfCustomer);
            this.selling_date = selling_date;
            total_amount = ((tax_amount/100) * price) + price;
            System.out.println("Total amount to be paid: " + getTotal_amount());
            sellingStatus = true;
        }
    }
   
   /**
    * This method overrides the method of the parent class.
    */
   public void displayDescription()
   {
       super.displayDescription();
       if(sellingStatus == false)
       {
           System.out.println("The untaxed price is: " + getPrice());
        }
    }  
}
