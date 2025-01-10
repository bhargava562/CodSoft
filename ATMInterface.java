//Bhargava A CodSoft Task 3
import java.util.*;

//base class for containing account details and balance
 class bankAccount {
    protected int accountNumber;
    protected String accountHolderName;
    protected int balance;

    //method to initialize the values
    public void getdata(int num,String name,int bal)
    {
        accountNumber = num;
        accountHolderName = name;
        balance = bal;
    }
}

//conntecting bankAccount to ATM
class ATM extends bankAccount {
    //method for deposit
    public void deposit(int amount)
    {
        balance+=amount;
        System.out.println("Your Amount Sucessfully Deposited\n");
    }
    //method to withdraw
    public void Withdraw(int amount)
    {
        //checking if amount exceeds balance
        if(balance>amount)
        {
        balance-=amount;
        System.out.println("Your Amount Sucessfully Withdrawed\n");
        }
        else {
            System.out.println("Your Withdraw Limit Exceeded... Check Your Balance");
        }
    }
    
    //displaying balance
    public void checkBalance()
    {
        System.out.println("\nKDBI Bank");
        System.out.println("Account Number: "+accountNumber);
        System.out.println("Name: "+accountHolderName);
        System.out.println("Your Current Balance is "+balance+"\n");
    }
}

//main class
public class ATMInterface{
    
    // static method to get amount
    public static int getamount() {
        Scanner ob = new Scanner(System.in);
        System.out.print("Enter the Amount: ");
        int a = ob.nextInt();
        return a;
    }

    //main method
    public static void main(String[] args) {
    int number,balance;
    String name;

    Scanner ob = new Scanner(System.in);
    System.out.println("\nWelcome to KDBI Bank\n");
    System.out.print("Enter Account Number: ");
    number = ob.nextInt();
    ob.nextLine();
    System.out.print("Enter Account Holder Name: ");
    name = ob.nextLine();
    System.out.print("Enter the Balance: ");
    balance = ob.nextInt();

    //creating object for ATM
    ATM atm = new ATM();
    atm.getdata(number, name, balance);

    int choice=0,amount;
    
    //repeating untill user exits bank
    do {
        System.out.print("1.Deposit\n2.Withdraw\n3.Check Balance\n4.Exit\nEnter your Choice: ");
        choice = ob.nextInt();

        //calling methods based on user choice
        switch(choice) {
            case 1:
                amount = getamount();
                atm.deposit(amount);
                break;
            case 2:
                amount = getamount();
                atm.Withdraw(amount);
                break;
            case 3:
                atm.checkBalance();
                break;
            case 4:
                break;
            default:
                System.out.println("Invalid Choice");
        }
    }
    while(choice!=4);


    System.out.println("Thank you for Having Transactions with KDBI bank");
    ob.close();
}    
}
