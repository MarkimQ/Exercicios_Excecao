package Application;

import java.util.Scanner;

import Model.entities.Account;
import Model.exceptions.DomainException;


public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		try {
		System.out.print("Enter account data: ");
		System.out.println();
		System.out.print("Data: ");
		Integer number = sc.nextInt();
		System.out.print("Holder: ");
		sc.nextLine();
		String holder = sc.nextLine();
		System.out.print("Balance: ");
		Double balance = sc.nextDouble();
		System.out.print("Withdraw limit: ");
		Double withdrawLimit = sc.nextDouble();
		
		Account account = new Account(number, holder, balance, withdrawLimit);
		
		System.out.print("Enter amount for withdraw: ");
		double amount = sc.nextDouble();
		account.withdraw(amount);
		
		
		System.out.println("New Balance: " + account.getBalance());

		}
		catch (DomainException e) {
			System.out.println("Error in reservation: " + e.getMessage());	
		}
		

		
	sc.close();
	}

}
