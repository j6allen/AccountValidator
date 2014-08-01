/******************
 @Author Jesse Allen
 @Created 10-3-2013   
******************/

import java.util.Scanner;

public class AccountTester
{
   public static void main(String[] args)
   {
      int accountNumber = -1;//declares and initializes accountNumber
      
      do
      {  
         
         AccountValidator check = new AccountValidator();//Creates new instance of AccountValidator class called "check" 
         Scanner keyboard = new Scanner(System.in);//Creates new instance of Scanner class called "keyboard"
         
         System.out.println("Enter an account number or enter -1 to quit");//request user input
         accountNumber = keyboard.nextInt();//gets next integer entered by user
         
         if(accountNumber != -1)//Enters block if user enters integer other than -1
         {
            //Uses getValidation method to check if account number entered is valid
             if(check.getValidation(accountNumber)==true)
                System.out.println(accountNumber + " is valid");
             else
                System.out.println(accountNumber + " is NOT valid");
         }  
      }   
       while(accountNumber != -1);//Loops while user imput not equal to -1   
       
       System.out.print("Goodbye!");
      
    }
}