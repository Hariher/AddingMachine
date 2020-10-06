package cse360assignment02; 

public class AddingMachine  // initialization of the method AddingMachine 
{
  private int total; // initialising a private integer variable total.
  private String output; // initialised a private string variable output.
  
  public AddingMachine ()  // public method Adding Machine()
  {
    total = 0;  // not needed - included for clarity
    output="0";
  }
  
  public int getTotal ()  // This public method  gets the current total value 
  {
    return total; // return total value.
  }
  
  public void add (int value)  // this public method takes in the parameter value and adds it to the total. 
  {
       total=total+value; // the total value is updated value times in this line.
       output=output+ "+" + value; // the output string variable is then updated with + sign and value.
   
  }

  public void subtract (int value) // this public method takes in value paramater and subracts the value from total.
  {
     total=total-value; // The new total integer is updated and stored into the total variable.
     output=output+ "-" + value; //the output string is updated - sign and value
  }

  public String toString () // This public method
  {
    return output;  // this return statement returns the output string value which has the step by step process.
  }

  public void clear() // this clear method clears the values from the memory
  {
      total=0; // the total is put to 0 
      output="0"; // the string value is put to 0.
  }
  
} // end of the Adding Machine class.