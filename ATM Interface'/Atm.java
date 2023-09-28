import java.io.*;
import java.util.Scanner;

public class Atm{
	private int balance;

	public Atm(int balance){
		this.balance = balance;
	}

	public void checkBalance(){
		System.out.println("Balance = Rs" + balance);
	}

	public void deposit(int amt){
		balance+=amt;
		System.out.println("Rs"+amt + " deposited successfully.\nCurrent balance = Rs"+balance);
	}

	public void withdraw(int amt){
		if(balance >= amt){
			balance-=amt;
			System.out.println("Rs"+amt + " transaction success.\nCurrent balance = Rs"+balance);
		}
		else{
			System.out.println("Insufficient Balance");
		}
	}

	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter initial balance: Rs");
        int initialBalance = sc.nextInt();

        Atm atm = new Atm(initialBalance);

        while (true) {
            System.out.println("\nATM Menu:");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.print("Select an option: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    atm.checkBalance();
                    break;
                case 2:
                    System.out.print("Enter amount to deposit: Rs");
                    int depamt = sc.nextInt();
                    atm.deposit(depamt);
                    break;
                case 3:
                    System.out.print("Enter amount to withdraw: Rs");
                    int withamt = sc.nextInt();
                    atm.withdraw(withamt);
                    break;
                case 4:
                    System.out.println("Thank you for using the ATM. Goodbye!");
                    sc.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please select a valid option.");
            }
        }
	}
}