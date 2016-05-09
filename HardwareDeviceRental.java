import java.awt.Container;
import java.awt.event.*;
import java.util.ArrayList;
import javax.swing.*;

/**
 * The class HardwareDeviceRental is created to design a GUI, which helps users to rent as well as sell Hardware Devices.
 * Various labels and buttons are used along with the text fields.
 * @author (Lijala Shrestha) 
 * @version (2nd May, 2016)
 */

public class HardwareDeviceRental implements ActionListener
{
    private ArrayList<HardwareDevice> hardwares;
       
    private JFrame frame;
    private Container content;
       
    private JLabel lableRent_Description,lableRent_Manufacturer, lableRent_dailyRate, lableRent_Advance, lableRent_Customer, lableRent_hireDate, lableRent_returnDate, lableRent_noOfDays, lableRent_hardwareDeviceNo,lableSell_Description,lableSell_Manufacturer, lableSell_Price, lableSell_taxRate, lableSell_Customer, lableSell_Date, lableSell_hardwareDeviceNo;
    private JTextField fieldRent_Description,fieldRent_Manufacturer, fieldRent_dailyRate,fieldRent_Advance, fieldRent_Customer, fieldRent_hireDate, fieldRent_returnDate, fieldRent_noOfDays, fieldRent_hardwareDeviceNo, fieldRent_hardwareDeviceNoToReturn, fieldSell_Description, fieldSell_Manufacturer, fieldSell_Price, fieldSell_taxRate, fieldSell_Customer, fieldSell_Date, fieldSell_hardwareDeviceNo;                                                                                              
    private JButton buttonAddToRent, buttonRent, buttonClear_Rent, buttonRent_Display,buttonReturn_hardwareDevice, buttonAddToSell, buttonSell, buttonSell_Clear, buttonSell_Display;

    private JPanel sellPane, rentPane;

    /**
     * Constructor of the class HardwareDeviceRental
     * Creating new array list which holds the index numbers of the hardware devices
     * Creating GUI
     */
    private HardwareDeviceRental(){

        this.initializeComponent();
        hardwares= new ArrayList<HardwareDevice>();

    }
    
    /**
     * Main method
     */
    public static void main(String[] args) {

        new HardwareDeviceRental();
            
    }

    /**
     * Method to create a new JFrame and the components which must be included inside the JFrame
     */
    private void initializeComponent(){

        //Creating a new JFrame
        frame = new JFrame("Rental System");
        //The program dismisses when the window is closed
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //Fixes the size of the window (dialogue box)
        frame.setResizable(false);
        
        frame.setLayout(null);
        //Components that are added to the frame
        addComponents(frame.getContentPane());
        
        frame.pack();
        // Sets the size of the window to 1000px width and 460px height
        frame.setSize(1000, 460);
        // Shows the window at the center of the screen
        frame.setLocationRelativeTo(null);
        // Makes the window visible
        frame.setVisible(true);


    }

    /**
     * Method to add components in the JFrame
     */
    private void addComponents(Container content){

        content.add(getRentPane());
        content.add(getSellPane());

    }

    /**
     * Method to create rent pane and add all the labels, text fields and buttons that come under it.
     */
    private JPanel getRentPane(){
        //Creates a new panel
        rentPane=new JPanel();
        rentPane.setLayout(null);
        //Sets the size for the panel
        rentPane.setBounds(10, 10, 485, 395);
        //Creates border for the panel
        rentPane.setBorder(BorderFactory.createTitledBorder("Hardware Device to Rent"));

        // Label for rent description
        lableRent_Description = new JLabel("Description:");
        lableRent_Description.setBounds(20, 30, 90, 30);
        rentPane.add(lableRent_Description);

        //Text field for rent description
        fieldRent_Description = new JTextField();
        fieldRent_Description.setBounds(110, 30, 355, 30);
        rentPane.add(fieldRent_Description);

        // Label for Manufacturer
        lableRent_Manufacturer = new JLabel("Manufacturer:");
        lableRent_Manufacturer.setBounds(20, 65, 90, 30);
        rentPane.add(lableRent_Manufacturer);

        // Text field for Manufacturer
        fieldRent_Manufacturer = new JTextField();
        fieldRent_Manufacturer.setBounds(110, 65, 355, 30);
        rentPane.add(fieldRent_Manufacturer);

        // Label for daily rate for renting the hardware
        lableRent_dailyRate = new JLabel("Daily Rate:");
        lableRent_dailyRate.setBounds(20, 100, 90, 30);
        rentPane.add(lableRent_dailyRate);

        // Text field for daily rate for renting the hardware
        fieldRent_dailyRate = new JTextField();
        fieldRent_dailyRate.setBounds(110, 100, 112, 30);
        rentPane.add(fieldRent_dailyRate);

        // Button that adds a new hardware to rent
        buttonAddToRent = new JButton("Add to Rent");
        buttonAddToRent.setBounds(322, 100, 143, 30);
        buttonAddToRent.addActionListener(this);
        rentPane.add(buttonAddToRent);
        
        // Label for advanced payment for renting the hardware
        lableRent_Advance = new JLabel("Advanced:");
        lableRent_Advance.setBounds(232, 135, 90, 30);
        rentPane.add(lableRent_Advance);

        // Text field for advanced payment for renting the hardware
        fieldRent_Advance = new JTextField();
        fieldRent_Advance.setBounds(322, 135, 143, 30);
        rentPane.add(fieldRent_Advance);
        
        // Label for Customer Name who rented the hardware
         lableRent_Customer = new JLabel("Customer:");
         lableRent_Customer.setBounds(20,190, 90, 30);
         rentPane.add(lableRent_Customer);

        // Text field for Customer Field
        fieldRent_Customer = new JTextField();
        fieldRent_Customer.setBounds(110, 190, 355, 30);
        rentPane.add(fieldRent_Customer);
        
        // Label for hardware hire date 
        lableRent_hireDate = new JLabel("Hire Date:");
        lableRent_hireDate.setBounds(20, 225, 90, 30);
        rentPane.add(lableRent_hireDate);

        // Text field for hardware hire date
        fieldRent_hireDate= new JTextField();
        fieldRent_hireDate.setBounds(110, 225, 112, 30);
        rentPane.add(fieldRent_hireDate);

        // Label for Return Date
        lableRent_returnDate = new JLabel("Return Date:");
        lableRent_returnDate.setBounds(232, 225, 90, 30);
        rentPane.add(lableRent_returnDate);

        // Text field for Return Date
        fieldRent_returnDate = new JTextField();
        fieldRent_returnDate.setBounds(322, 225, 143, 30);
        rentPane.add(fieldRent_returnDate);
        
        // Label for Number of Days
        lableRent_noOfDays = new JLabel("No. of Days:");
        lableRent_noOfDays.setBounds(20, 260, 90, 30);
        rentPane.add(lableRent_noOfDays);

        // Text field for Number of Days
        fieldRent_noOfDays = new JTextField();
        fieldRent_noOfDays.setBounds(110, 260, 112, 30);
        rentPane.add(fieldRent_noOfDays);

        // Label for the Hardware Number
        lableRent_hardwareDeviceNo = new JLabel("Hardware No.:");
        lableRent_hardwareDeviceNo.setBounds(232, 260, 90, 30);
        rentPane.add(lableRent_hardwareDeviceNo);

        // Text field for Hardware Number
        fieldRent_hardwareDeviceNo= new JTextField();
        fieldRent_hardwareDeviceNo.setBounds(322, 260, 143, 30);
        rentPane.add(fieldRent_hardwareDeviceNo);
        
        
        // Button to rent the Hardware device
        buttonRent = new JButton("Rent");
        buttonRent.setBounds(110, 295, 112, 30);
        buttonRent.addActionListener(this);
        rentPane.add(buttonRent);

        // Button to clear all the rental fields
        buttonClear_Rent= new JButton("Clear");
        buttonClear_Rent.setBounds(227, 295, 90, 30);
        buttonClear_Rent.addActionListener(this);
        rentPane.add(buttonClear_Rent);

        // Button to display all the hardware for rent
        buttonRent_Display= new JButton("Display All");
        buttonRent_Display.setBounds(322, 295, 143, 30);
        buttonRent_Display.addActionListener(this);
        rentPane.add(buttonRent_Display);
        
        // Label for the Hardware Index Number
        lableRent_hardwareDeviceNo = new JLabel("Hardware No.:");
        lableRent_hardwareDeviceNo.setBounds(20, 330, 90, 30);
        rentPane.add(lableRent_hardwareDeviceNo);

         // Text field for Hardware Index Number
        fieldRent_hardwareDeviceNoToReturn= new JTextField();
        fieldRent_hardwareDeviceNoToReturn.setBounds(111, 330, 130, 30);
        rentPane.add(fieldRent_hardwareDeviceNoToReturn);

        // Button for the Hardware device return 
        buttonReturn_hardwareDevice = new JButton("Return");
        buttonReturn_hardwareDevice.setBounds(322, 330, 143, 30);
        buttonReturn_hardwareDevice.addActionListener(this);
        rentPane.add(buttonReturn_hardwareDevice);
        
        return rentPane;    
    }  

    /**
     * Method to create sell pane and add all the labels, text fields and buttons that come under it.
     */
    private JPanel getSellPane(){
        // Creates a new Panel
        sellPane = new JPanel();
        sellPane.setLayout(null);
        // Sets the size for the panel
        sellPane.setBounds(500, 10, 485, 310);
        // Creates border for the panel
        sellPane.setBorder(BorderFactory.createTitledBorder("Hardware to Sell"));
    
        // Label for description
        lableSell_Description= new JLabel("Description:");
        lableSell_Description.setBounds(20, 30, 90, 30);
        sellPane.add( lableSell_Description);
    
        // Text field for description
        fieldSell_Description= new JTextField();
        fieldSell_Description.setBounds(110, 30, 355, 30);
        sellPane.add(fieldSell_Description);
            
        // Label for Manufacturer
        lableSell_Manufacturer = new JLabel("Manufacturer");
        lableSell_Manufacturer.setBounds(20, 65, 90, 30);
        sellPane.add(  lableSell_Manufacturer);
    
        // Text field for Manufracturer
        fieldSell_Manufacturer= new JTextField();
        fieldSell_Manufacturer.setBounds(110, 65, 355, 30);
        sellPane.add(fieldSell_Manufacturer);
            
        // Label for Price
        lableSell_Price = new JLabel("Price:");
        lableSell_Price.setBounds(20, 100, 90, 30);
        sellPane.add(lableSell_Price);
    
        // Text field for Price
        fieldSell_Price = new JTextField();
        fieldSell_Price.setBounds(110, 100, 112, 30);
        sellPane.add(fieldSell_Price);
    
        // Label for tax
        lableSell_taxRate = new JLabel("Tax Rate(%):");
         lableSell_taxRate.setBounds(232, 100, 90, 30);
        sellPane.add( lableSell_taxRate);
             
        // Text field for tax
        fieldSell_taxRate = new JTextField();
        fieldSell_taxRate.setBounds(322, 100, 143, 30);
        sellPane.add(fieldSell_taxRate);
            
        // Button to add generator for Sale
        buttonAddToSell = new JButton("Add to Sell");
        buttonAddToSell.setBounds(322, 135, 143, 30);
        buttonAddToSell.addActionListener(this);
        sellPane.add(buttonAddToSell);
            
        // Label for customer's Name
        lableSell_Customer = new JLabel("Customer:");
        lableSell_Customer.setBounds(20, 170, 90, 30);
        sellPane.add(lableSell_Customer);

        // Text field for customer's name
        fieldSell_Customer = new JTextField();
        fieldSell_Customer.setBounds(110, 170, 355, 30);
        sellPane.add(fieldSell_Customer);

        // Label for date of sale
        lableSell_Date= new JLabel("Date:");
        lableSell_Date.setBounds(20, 205, 90, 30);
        sellPane.add(lableSell_Date);

        // Text field for date of sale
        fieldSell_Date = new JTextField();
        fieldSell_Date.setBounds(110, 205, 112, 30);
        sellPane.add(fieldSell_Date);

        // Label for Hardware Device Index Number
        lableSell_hardwareDeviceNo = new JLabel("Hardware No:");
        lableSell_hardwareDeviceNo.setBounds(232, 205, 90, 30);
        sellPane.add(lableSell_hardwareDeviceNo);
    
        // Text field for Hardware Device Index Number
        fieldSell_hardwareDeviceNo= new JTextField();
        fieldSell_hardwareDeviceNo.setBounds(322, 205, 143, 30);
        sellPane.add(fieldSell_hardwareDeviceNo);
            
        // Button to sell the hardware device
        buttonSell = new JButton("Sell");
        buttonSell.setBounds(110, 240, 112, 30);
        buttonSell.addActionListener(this);
        sellPane.add(buttonSell);
    
        // Button to clear all the fields
        buttonSell_Clear = new JButton("Clear");
        buttonSell_Clear.setBounds(227, 240, 90, 30);
        buttonSell_Clear.addActionListener(this);
        sellPane.add(buttonSell_Clear);
    
        // Button to display all the hardware devices for sold
        buttonSell_Display = new JButton("Display All");
        buttonSell_Display.setBounds(322, 240, 143, 30);
        buttonSell_Display.addActionListener(this);
        sellPane.add(buttonSell_Display);
                
        return sellPane;

    }

    /**
     * Method for Action listener.
     * This method is created to make all the buttons function.
     */
    public void actionPerformed(ActionEvent actionEvent){

        if(actionEvent.getSource()==buttonAddToRent){

            addToRent();
        }

        if(actionEvent.getSource()== buttonRent){

            rent();
        }

        if(actionEvent.getSource()==buttonClear_Rent){

            clearRent();
        }

        if(actionEvent.getSource()==buttonRent_Display){

            displayRent();
        }

        if(actionEvent.getSource()==buttonReturn_hardwareDevice){

            hardwareReturn();
        }

        if(actionEvent.getSource()==buttonAddToSell){

            addToSell();
        }

        if(actionEvent.getSource()==buttonSell)
        {
            sell();
        }

        if(actionEvent.getSource()==buttonSell_Clear)
        {
            clearSell();
        }

        if(actionEvent.getSource()==buttonSell_Display)
        {
            displaySell();
        }
    }

    /**
     * This method makes the button "Add to Rent" functional.
     * It adds the value of description, manufacturer and daily rate in the hardwares arraylist. 
     */
    private void addToRent(){

        try{
            String description = fieldRent_Description.getText().trim();
            String man = fieldRent_Manufacturer.getText().trim();
            double rate = Double.parseDouble(fieldRent_dailyRate.getText().trim());

            HardwareDeviceToRent device = new HardwareDeviceToRent(rate, description, man);
            hardwares.add(device);

            JOptionPane.showMessageDialog(frame, "Your hardware has been added.", "Information message", (JOptionPane.INFORMATION_MESSAGE));


        }
        catch(NumberFormatException exc){

            JOptionPane.showMessageDialog(frame, "Invalid Rate", "Error message", (JOptionPane.ERROR_MESSAGE));

        }

    } 
    
    /**
     * This method makes the button "Rent" functional. 
     * It stores the value of the customer's name,hire date, number of days, return date, advanced payment and hardware number to the hardwares arraylist
     */
    private void rent(){

        String customer = fieldRent_Customer.getText().trim();
        String hiredate= fieldRent_hireDate.getText().trim();
        String returndate= fieldRent_returnDate.getText().trim();


        try{

                int numDays= Integer.parseInt(fieldRent_noOfDays.getText().trim());
                double advance = Double.parseDouble(fieldRent_Advance.getText().trim());
                int index = Integer.parseInt(fieldRent_hardwareDeviceNo.getText().trim());

            if(index>=hardwares.size() && (index<0)){

                JOptionPane.showMessageDialog(frame, "Invalid index number.", "Error message", (JOptionPane.ERROR_MESSAGE));
            }

            else{
                HardwareDeviceToRent device= (HardwareDeviceToRent)hardwares.get(index);
                device.rentHardware(customer, hiredate, returndate, numDays, advance );

                JOptionPane.showMessageDialog(frame, "View Output window.", "Information message", (JOptionPane.INFORMATION_MESSAGE));
            }
        }
        catch (NumberFormatException exc){

            JOptionPane.showMessageDialog(frame, "Invalid Number Formats.", "Error message", (JOptionPane.ERROR_MESSAGE));
        }

        catch(ArrayIndexOutOfBoundsException exc){

            JOptionPane.showMessageDialog(frame, "Invalid index number.", "Error message", (JOptionPane.ERROR_MESSAGE));
        }
    }

    /**
     * This method makes the button "Clear" functional.
     * It clears all the values typed in each of the fields.
     */
    private void clearRent(){

        fieldRent_Advance.setText("");
        fieldRent_Customer.setText("");
        fieldRent_hireDate.setText("");
        fieldRent_Manufacturer.setText("");
        fieldRent_dailyRate.setText("");
        fieldRent_returnDate.setText("");
        fieldRent_hardwareDeviceNo.setText("");
        fieldRent_hardwareDeviceNoToReturn.setText("");
        fieldRent_noOfDays.setText("");
        fieldRent_Description.setText("");

    }

    /**
     * This method makes the button "Display all" functional.
     * It displays all the data entered; the hardwares rented.
     */
    private void displayRent(){

        System.out.println("To rent:");
        for(HardwareDevice devices: hardwares){

            devices.displayDescription();
        }
    }

    /**
     * This method makes the button "Return" functional.
     * It frees the hardware which was rented, according to its index number.
     */
    private void hardwareReturn(){


        try{
            int index = Integer.parseInt(fieldRent_hardwareDeviceNoToReturn.getText().trim());

            if((index>=hardwares.size()) && (index<0)){

                 JOptionPane.showMessageDialog(frame, "Invalid index number.", "Error message", (JOptionPane.ERROR_MESSAGE));
            }

            else{

                HardwareDeviceToRent device = (HardwareDeviceToRent)hardwares.get(index);
                device.clearingMethod();
                JOptionPane.showMessageDialog(frame, "hardware returned", "Information message", JOptionPane.INFORMATION_MESSAGE);
            }

        }
        catch(Exception exc){

            JOptionPane.showMessageDialog(frame, "Invalid input Fields", "Error message", (JOptionPane.ERROR_MESSAGE));

        }

    }  

    /**
     * This method makes the button "Add to Sell" functional.
     * It adds the value of description, manufacturer, price and tax rate in the hardwares arraylist. 
     */
    private void addToSell()
    {

        try
        {
            String sellDescription = fieldSell_Description.getText().trim();
            String manu = fieldSell_Manufacturer.getText().trim();
            double price = Double.parseDouble(fieldSell_Price.getText().trim());
            double tax = Double.parseDouble(fieldSell_taxRate.getText().trim());

            HardwareDeviceToSell device = new HardwareDeviceToSell(sellDescription, manu, price, tax);
            hardwares.add(device);

            JOptionPane.showMessageDialog(frame, "Your hardware has been added to the selling list.", "Information message", (JOptionPane.INFORMATION_MESSAGE));
        }

        catch(NumberFormatException exc)
        {
             JOptionPane.showMessageDialog(frame, "Invalid Rate", "Error message", (JOptionPane.ERROR_MESSAGE));
        }
    }

    /**
     * This method makes the button "Sell" functional. 
     * It stores the value of the customer's name,selling date, number of days and hardware number to the hardwares arraylist
     */
    private void sell()
    {
        try
        {
            String customer = fieldSell_Customer.getText().trim();
            String sellDate= fieldSell_Date.getText().trim();
            int index = Integer.parseInt(fieldSell_hardwareDeviceNo.getText().trim());
        

            if(index>=hardwares.size() && (index<0))
            {

                JOptionPane.showMessageDialog(frame, "Invalid index number.", "Error message", (JOptionPane.ERROR_MESSAGE));
            }

            else
            {
                HardwareDeviceToSell device= (HardwareDeviceToSell)hardwares.get(index);
                device.sellingMethod(customer, sellDate);

                JOptionPane.showMessageDialog(frame, "View Output window.", "Information message", (JOptionPane.INFORMATION_MESSAGE));
            }
        }
        
        catch (NumberFormatException exc)
        {

            JOptionPane.showMessageDialog(frame, "Invalid Number Formats.", "Error message", (JOptionPane.ERROR_MESSAGE));
        }

        catch(ArrayIndexOutOfBoundsException exc)
        {

            JOptionPane.showMessageDialog(frame, "Invalid index number.", "Error message", (JOptionPane.ERROR_MESSAGE));
        }

        
    }
    
    /**
     * This method makes the button "Clear" functional.
     * It clears all the values typed in each of the fields.
     */
    private void clearSell()
    {
        fieldSell_Description.setText("");
        fieldSell_Manufacturer.setText("");
        fieldSell_Price.setText("");
        fieldSell_taxRate.setText("");
        fieldSell_Customer.setText("");
        fieldSell_Date.setText("");
        fieldSell_hardwareDeviceNo.setText("");
    }

    /**
     * This method makes the button "Display all" functional.
     * It displays all the data entered; the hardwares sold.
     */
    private void displaySell()
    {

        System.out.println("To sell:");
        for(HardwareDevice devices: hardwares)
        {

            devices.displayDescription();
        }
    }
}  
 

    

    