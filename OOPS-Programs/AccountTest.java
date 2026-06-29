package oopsprograms;
import java.util.*;

class Account{
  private int balance;
  //setter to set balance
  public void setBalance(int bal){
      this.balance=bal;
  }

  //debit method
  public void debit(int amount){
      if(amount>balance){
          System.out.println("Debit amount exceeded account balance.");
      }
      else{
          balance=balance-amount;
          System.out.println("Current balance: "+balance);
      }
  }
}

public class AccountTest {
  public static void main(String[] args){
	  Scanner sc=new Scanner(System.in);
      Account acc=new Account();
      acc.setBalance(2000);
      System.out.println("Enter the withdrawal amount:");
      //taking amount input from user to be withdrawn. 
      int amount=sc.nextInt();
      acc.debit(amount);
      sc.close();

  }
}
