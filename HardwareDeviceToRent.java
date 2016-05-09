
/**
 * Child class of the parent class HardwareDevice, which is created to rent the Hardware Device.
 * Various attributes were declared, initiated and executed to run the program.
 * Various methods were also created to execute the whole program.
 * @author (Lijala Shrestha) 
 * @version (20th March, 2016)
 */
//Question number 2)
public class HardwareDeviceToRent extends HardwareDevice
{
    //Attributes initialised according to their datatypes.
    private String hardwareHire_date;
    private String return_date;
    private int numberOfDays;
    private double daily_rate;
    private double advance_payment;
    private double totalRentalCost;
    private boolean loanStatus;

    //Question number 3) 
    /**
     * Constructor is created to initialise the attributes.
     * Few parameters are passed
     */
    public HardwareDeviceToRent(double daily_rate, String description, String manufacturer) //Initialising parameters.
    {
        super(description, manufacturer); //super class constructer called.
        
        //Assigning the values to the corresponding attributes.
        hardwareHire_date = "";
        return_date = "";
        numberOfDays = 0;
        this.daily_rate = daily_rate;
        advance_payment = 0.0;
        totalRentalCost = 0.0;
        loanStatus = false;
    }

    /**
     * These are the return type method that returns the values of the attributes that are initialised above.
     */
    public String getHardwareHire_date() //This is the accessor method for hardwareHire_date.
    {
        return hardwareHire_date;
    }
    
    public String getReturn_date() //This is the accessor method for return_date.
    {
        return return_date;
    }
    
    public int getNumberOfDays() //This is the accessor method for numberOfDays.
    {
        return numberOfDays;
    }
    
    public double getDaily_rate() //The is the accessor method for daily_rate.
    {
        return daily_rate;
    }
    
    public double getAdvance_payment() //This is the accessor method for advance_payment.
    {
        return advance_payment;
    }
    
    public double getTotalRentalCost() //This is the accessor method for totalRentalCost.
    {
        return totalRentalCost;
    }
    
    /**
     * This is a non-return type method that assigns a new value for daily_rate.
     */
    public void setDaily_rate(double daily_rate)
    {
        this.daily_rate = daily_rate;
    }
    
    /**
     * This is a method which helps in renting hardware device.
     * Few parameters related to renting hardware device are passed.
     */
    public void rentHardware(String nameOfCustomer, String hardwareHire_date,  String return_date, int numberOfDays, double advance_payment)
    {
        if(loanStatus == true)
        {
            System.out.println("Sorry the rental service is not available at the moment. It will be available on " + getReturn_date());
        }
        else
        {
            setNameOfCustomer(nameOfCustomer);
            this.return_date = return_date;
            this.numberOfDays = numberOfDays;
            this.advance_payment = advance_payment;
            loanStatus = true;
            totalRentalCost = daily_rate * numberOfDays;
            System.out.println("Hardware device has been booked.");
        }
    }
    
    /**
     * This method clears the data of the rented hardware device inorder to free it.
     */
    public void clearingMethod()
    {
        if(loanStatus == true)
        {
            setNameOfCustomer("");
            hardwareHire_date = "";
            return_date = "";
            numberOfDays = 0;
            advance_payment = 0.0;
            totalRentalCost = 0.0;
            loanStatus = false;
            System.out.println("Hardware Returned.");
        }
        else
        {
            System.out.println("Hardware Device is available for renting. Please rent soon.");
        }
    }
    
    /**
     * This method prints the description of the hardware device and the total rent collected to-date. 
     */
    public void printdescription()
    {
        System.out.println("Description of the Hardware Device: " + getDescription());
        System.out.println("Total rent collected to-date: " + getAdvance_payment());
    }
    
    /**
     * This method overrides the method of the parent class.
     */
    public void displayDescription()
    {
        super.displayDescription();
        System.out.println("Daily Rate of the Hardware Device = " + getDaily_rate());
        if(loanStatus == true)
        {
            System.out.println("Sorry the hardware device is not available at the moment. It is rented from " + getHardwareHire_date() + " to " + getReturn_date() + " , for " + getNumberOfDays() + " days.");
        }
    }
}
