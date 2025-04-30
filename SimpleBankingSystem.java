import java.util.Scanner;
import java.util.UUID;

public class SimpleBankingSystem {
    class BankAccount{
        String ownerName;
        int accountNumber;
        double balance;

        public BankAccount(String name){
            this.ownerName = name;
            this.accountNumber = generateID();
            this.balance = 0.00;
        }

        private static int generateID(){
            int accountNumber = UUID.randomUUID().hashCode();
            return accountNumber;
        }

        //Deposit method
        public void deposit(double x){
            this.balance += x;
        }

        //Withdraw method
        public void withdraw(double y){
            if(this.balance <= 15.00){
                System.out.println("Unable to withdraw, not enough money in balance.");
            }
            else{
                this.balance -= y;
            }
        }

        //Check balance
        public void checkBalance(){
            System.out.println("Balance: " + this.balance);
        }

        //Display account info
        public void displayAccInfo(){
            System.out.println("Name: " + this.ownerName);
            System.out.println("Account Number: " + this.accountNumber);
            System.out.println("Balance: " + this.balance);
        }
    }

    public static void main(String[] args){

    }
}
