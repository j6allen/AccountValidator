/******************
 @Author Jesse Allen
 @Date 10-3-2013  
******************/


public class AccountValidator
{
   //Class varibles
   private boolean found = false;//sets boolean flag to false
   private int i = 0;//sets element to 0
   
   
   
   public boolean getValidation(int a)//Method to validate account numbers
   {
         //Creates an array that holds valid account numbers
        int[] validAccounts ={5658845, 4520125, 7895122, 8777541, 8451277, 1302850,
                            8080152, 4562555, 5552012, 5050522, 7825877, 1250255,
                            1005231, 6545231, 3852085, 7576651, 7881200, 4581002};
                            
                            
        int accountNumber = a; 
        
        //Sequential search loop
        //Loops until value is found or search meets array length
        while (!found && i < validAccounts.length)
        {
            if(validAccounts[i] == accountNumber)
            {
               found = true;//sets flag to true
              
            }
            i++;//increments element
         }
         return found; //returns boolean 
        
        
   }
}