package application;

import entities.Account;

import java.util.Locale;
import java.util.Scanner;

public class Objetos3 {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Account account;


        System.out.print("Enter account number: ");
        int accountNumber = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter account holder: ");
        String accountHolder = sc.nextLine();

        System.out.print("Is there an initial deposit (y/n)? ");
//        String anyInitialDeposit = sc.nextLine();
        char anyInitialDeposit = sc.next().charAt(0);

        /*if(anyInitialDeposit.equals("y")){

            System.out.print("Enter initial deposit value: ");
            ac.depositMoney(sc.nextDouble());
            System.out.printf("%nAccount data: %n" + ac);

        } else if (anyInitialDeposit.equals("n")){
            System.out.printf("%nAccount data: %n" + ac);
        } else {
            System.out.println("%nOpção digitada está incorreta, tente novamente.");
        }*/

        if(anyInitialDeposit == 'y') {
            System.out.print("Enter initial deposit value: ");
            double initialDeposit = sc.nextDouble();
            account = new Account(accountNumber, accountHolder, initialDeposit);
        } else {
            account = new Account(accountNumber, accountHolder);
        }

        System.out.print("Enter a deposit value: ");
        account.depositMoney(sc.nextDouble());
        System.out.printf("%nUpdated account data: %n" + account);

        System.out.print("Enter a withdraw value: ");
        account.withdrawMoney(sc.nextDouble());
        System.out.printf("%nUpdated account data: %n" + account);
        sc.close();
    }
}
