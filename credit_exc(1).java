/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

import java.util.Scanner;

/**
 *
 * @author Kirthana Balasubramanian
 */
public class credit_exc {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws CreditException {
        // TODO code application logic here
        
      
	    
	    credit_exc call=new credit_exc();
	    try //try block 
	    {
	        call.checkcredit();
	        
	    }
	    catch(CreditException e) //catch block
	    {
	        System .out.println("Exception:"+e);
	    }
	}
	
	void checkcredit()throws CreditException
	{
	    double amount ;
	    Scanner obj=new Scanner (System .in);
	    System .out .println("Daily limit to credit is mininumRs.100 max amt is Rs.50000");
	    System .out.println("Enter the amount to be credited in the account:");
	    amount=obj.nextDouble();//getting amt from user
	    if(amount<100||amount>50000)
	        throw new CreditException("Amount is out of limit to creditinaccount");
	    System .out.println("Credited amount:"+amount);
	}
}
class CreditException extends Exception 
{
    String message ;
    CreditException (String m)
    {
        message =m;
    }
   
    @Override
    public String toString ()
    {
        return message ;
    }
}

