import java.util.Scanner;


public class TestControls {


  public static void main(String[] args){

    Scanner input =  new Scanner(System.in);


    double balance = 15000;

    System.out.println("Welcome to International Back of Africa."); 
    System.out.println("Your current balance is Ksh: " +  balance); 
    System.out.print("Enter the amount to withdraw in Ksh: "); 
    
    double amount = input.nextDouble();

    //Amount to withdraw should be slightly lower to allow for charges 
    if(amount  >=  balance){ 
      System.out.print("You have insufficient balance, your current balance is Ksh: " + balance); 
    } else if (amount  <=  balance){ 
      System.out.println("Withdrawal of " + amount + " was successful! Take your cash on Tray."); 
      System.out.println("Thank you for banking with us, your current balance is Ksh:  " + (balance  - amount)); 
    } else { 
      System.out.println("Sorry, the transaction could not be completed.");
      System.out.println("You have insufficient funds in your account "); 
    } 

    input.close();






  }
}