package exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception_Handle {

    void subject()
    {
    	Scanner sc=new Scanner(System.in);
    	System.out.println("Enter option ");
    try{
    	
    	int opt=sc.nextInt();
    	if(opt==1)
    	{
    		System.out.println("You select java");
    	}
    
    	else if(opt==2)
    	{
    		System.out.println("You select python");
    	}
    }
        catch (InputMismatchException e)
       {
             System.out.println("please enter int value");
        }
    
        finally
        {
    	thankyou();
        }
    }
    void thankyou()
    {
    	System.out.println("Thankyou welcome again");
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Exception_Handle eh=new Exception_Handle();
		            //     eh.welcome();
		                 eh.subject();
	}

}
