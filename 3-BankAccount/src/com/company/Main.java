package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    SavingAccount acc = new SavingAccount(0,0.12);

        boolean again = true;

        menu : while(true) {
            System.out.println("Menu : \n1. Deposit\n2. Withdraw\n3. Monthly Process\n4. Close");
            int menu = sc.nextInt();
            switch (menu) {
                case 1:
                    System.out.print("Deposit amount : ");
                    double depAmount = sc.nextDouble();
                    acc.deposit(depAmount);
                    print(acc);
                    break;
                case 2:
                    System.out.print("Withdraw amount : ");
                    double witAmount = sc.nextDouble();
                    acc.withdraw(witAmount);
                    print(acc);
                    break;
                case 3:
                    acc.monthlyProcess();
                    print(acc);
                    break;
                case 4:
                    System.out.println("Thank you!");
                    break menu;
            }
        }
    }

    public static void print(SavingAccount acc){
        System.out.println("----------------------------------------------------");
        System.out.println("Balance : $" + acc.balance);
        System.out.println("Number of Deposit : " + acc.numberOfDeposit);
        System.out.println("Number of Withdrawal : " + acc.numberOfWithdrawal);
        System.out.println("----------------------------------------------------");
    }
}
