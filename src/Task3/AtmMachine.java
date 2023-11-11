package Task3;

import java.util.Scanner;

class BankAccount
{
	private double balance;
	public BankAccount(double initialBalance) {
		balance = initialBalance;
	}
	
	public double getBalance(){
		return balance;
	}
	
	public void deposit(double amount) {
		if(amount >0) {
			balance +=amount;
			System.out.println("Deposit Successfull. NEW balance: " + balance);
		}else {
			System.out.println("Invalid Deposit amount");
		}
	}
	
	public boolean withdraw(double amount) {
		if(amount > 0 && amount <= balance) {
			balance -= amount;
			System.out.println("Withdraw Successfull. New balance: " + balance);
			return true;
		}else {
			System.out.println("Invalid withdrawal amount or insufficient balance");
			return false;
		}
			
	}
	
}
 
 class ATM
 {
	 private BankAccount account;
	 
	 public ATM(BankAccount account) {
		 this.account = account;
	 }
	 
	 public void displayOptions() {
		 System.out.println("ATM Menu: ");
		 System.out.println("1. Check Balance");
		 System.out.println("2. Deposit");
		 System.out.println("3. Withdraw");
		 System.out.println("4. Exit");
	 }
	 
	 public void run() {
		 Scanner sc = new Scanner(System.in);
		 boolean isRunning = true;
		 
		 while(isRunning) {
			 displayOptions();
			 System.out.println("Select an Option (1/2/3/4): ");
			 int choice  = sc.nextInt();
			 
			 switch (choice) {
			 case 1: 
				 System.out.println("Current Balance: " + account.getBalance());
				 break;
			 case 2:
				 System.out.println("Enter deposit amount: ");
				 double depositAmount = sc.nextDouble();
				 account.deposit(depositAmount);
				 break;
			 case 3:
				 System.out.println("Enter Withdraw amount: ");
				 double withdrawalAmount = sc.nextDouble();
				 account.withdraw(withdrawalAmount);
			 case 4:
				 System.out.println("Thank you for using ATM! ");
				 isRunning = false;
				 break;
			 default:
				 System.out.println("Invalid option. Please select a valid option.");
			     break;
			 }
		 }
		 sc.close();
	 }
	 
 }

public class AtmMachine {
    public static void main(String[] args) {
    	//it is for Initialize the bank account with an initial balance
		BankAccount userAccount = new BankAccount(5000);
		
		
		//it is for Create an ATM instance linked to the users bank account
		ATM atm = new ATM(userAccount);
		
		
		//it is for start the ATm Interface
		atm.run();
	}
}
