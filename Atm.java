/**
 * Atm
 */


import java.util.Scanner;
public class Atm {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int  Balance =5000,Withdraw,Deposit;

        while (true) {
            System.out.println("-------------------------------------------");
            System.out.println( "plz chose the option you want to perfrom");
            System.out.println("-------------------------------------------");

            System.out.println("WITHDRAW                        DEPOSIT    ");  
            System.out.println("   1                              2"); 
            System.out.println(); 
            System.out.println(                   "ATM"                              );          
            System.out.println(); 
            System.out.println("BLANCE                           EXIT");  
            System.out.println(" 3                                4 ");  

            System.out.println("----------------------------------------------------");
            System.out.println( "");
            System.out.println("----------------------------------------------------");


            int chose = sc.nextInt();
            switch (chose) {
                case 1:
                System.out.println("==============================================");

                    System.out.println("Enter Money to withdraw");
                    Withdraw=sc.nextInt();
                    if (Balance>=Withdraw) {
                        Balance = Balance-Withdraw;
                        System.out.println("plz collect your case");
                    } else {
                        System.out.println("Insufficient Balance");
                    }
                    System.out.println("==============================================");

                    break;
            
                case 2:
                    System.out.println("==============================================");
                       System.out.println("Enter Money to Deposit");
                       Deposit =sc.nextInt();
                       Balance = Balance+Deposit;
                       System.out.println("Your Money has been successfully depsited");  
                       System.out.println("==============================================");


                    break;
                case 3:
                      System.out.println("==============================================");

                      System.out.println("Your account balance is : " +Balance);
                      System.out.println("==============================================");

                    break;    
                case 4:
                    System.exit(0);
                    break;
            }
        }

            
    }
}