package oopsprograms;

import java.util.*;
class stock{
//	fields of stock
  String shareName;
  int NumberOfShares;
  int shareprice;
 
  public stock(String shareName,int NumberOfShares,int shareprice){
      this.shareName=shareName;
      this.NumberOfShares=NumberOfShares;
      this.shareprice=shareprice;
  }

  //instance method to calculate total price of each stock
  public int priceofeachshare(int shares,int price){
      return shares*price;
  }
}
public class StockPortfolio {
  public static void main(String[] args){
      System.out.println("Enter the number of stocks");
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      sc.nextLine();
      
      //created arralist of stock class to store the stocks.
      ArrayList<stock> stocks=new ArrayList<>();
      //taking stocks details as input from the user.
      for(int i=1;i<=n;i++){
          System.out.println("Enter sharename of stock"+" "+i);
          String name=sc.nextLine();
          System.out.println("Enter NumberofShares of stock"+" "+i);
          int num=sc.nextInt();
          System.out.println("Enter shareprice of stock"+" "+i);
          int price=sc.nextInt();
          sc.nextLine();
          //Adding into the list
          stocks.add(new stock(name,num,price));
      }
      int sum=0;
      //Printing the Stock report
      System.out.println("Stock Report:");
      System.out.println("Each Share Total Price: ");
      for(stock eachstock:stocks){
        int totalprice = eachstock.priceofeachshare(eachstock.NumberOfShares,eachstock.shareprice);
        System.out.println("Share Name: "+eachstock.shareName+"-->"+"Total Share price: "+totalprice);
        sum=sum+totalprice;
      }
      System.out.println("Total stocks Value: "+sum);
      sc.close();
  }
}
