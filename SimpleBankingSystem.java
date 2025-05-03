import java.math.BigInteger;
import java.util.Scanner;
import java.util.UUID;

public class SimpleBankingSystem {
    public static class BankAccount{
        String ownerName;
        BigInteger accountNumber;
        double balance;

        public BankAccount(String name){
            this.ownerName = name;
            this.accountNumber = generateID();
            this.balance = 0.00;
        }

        private static BigInteger generateID(){
            BigInteger bigInteger = new BigInteger(UUID.randomUUID().toString().replace("-", ""), 16);
            return bigInteger;
        }

        //Deposit method
        public void deposit(double x){
            if(x <= 0.00){
                System.out.println("Enter a valid amount please.");
            } else{
                this.balance += x;
            }
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
            System.out.printf("Balance: $%.2f%n", this.balance);
        }

        //Display account info
        public void displayAccInfo(){
            System.out.println("Name: " + this.ownerName);
            System.out.println("Account Number: " + this.accountNumber);
            System.out.printf("Balance: $%.2f%n", this.balance);
        }
    }

    public static void main(String[] args){

        boolean finished = false;
        Scanner input = new Scanner(System.in);
        BankAccount account = null;

        do{
            System.out.println("1) Create Account \n" +
                                "2) Deposit \n" +
                                "3) Withdrawal \n" + 
                                "4) Check Balance \n" +
                                "5) Display Account Information \n" + 
                                "6) Exit");

            int choice = input.nextInt();
            input.nextLine();

            switch(choice){
                case 1:
                    System.out.print("Enter a name for the account: ");
                    String name = input.nextLine();
                    account = new BankAccount(name);
                break;

                case 2:
                    if (account == null) {
                        System.out.println("Please create an account first.");
                    break;
                    }
                
                    System.out.print("Enter deposit amount: ");
                    Double deposit = input.nextDouble();
                    account.deposit(deposit);
                    System.out.printf("New Balance: $%.2f%n", account.balance);
                break;

                case 3:
                    if (account == null) {
                        System.out.println("Please create an account first.");
                    break;
                    }
                
                    System.out.print("Enter withdrawal amount: ");
                    Double withdrawal = input.nextDouble();
                    account.withdraw(withdrawal);
                    System.out.printf("New Balance: $%.2f%n", account.balance);
                break;

                case 4:
                    if (account == null) {
                        System.out.println("Please create an account first.");
                    break;
                    }
                
                    account.checkBalance();
                break;

                case 5:
                    if (account == null) {
                        System.out.println("Please create an account first.");
                    break;
                    }
                
                    account.displayAccInfo();
                break;

                case 6:
                    System.out.println("Exiting program...");
                    finished = true;
                break;

                default:
                    System.out.println("Please enter a valid choice (1-6)");
                break;
            }
            
        }while(!finished);

        input.close();
    }
}
