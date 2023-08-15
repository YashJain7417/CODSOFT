import java.util.Scanner;

public class ATM_Interface {
    public static void main(String[] args) {
        int balance = 10000, withdraw, deposit; // declare and initialize balance, withdraw, and deposit
        Scanner sc = new Scanner(System.in); // scanner class
        System.out.println("");
        System.out.println("   .....CODSOFT ATM......   ");
        System.out.println("");
        System.out.println("Please insert your Debit card");
        System.out.print("Enter 4-digit PIN : ");
        int pin = sc.nextInt();
        if (pin > 999 && pin < 10000) {

            while (true) {
                System.out.println("           Mr. YASH JAIN       ");
                System.out.println("    Acc. No.  XXXX XXXX XXXX 4129");
                System.out.println("");
                System.out.println("Press 1 for Withdraw.");
                System.out.println("Press 2 for Deposit.");
                System.out.println("Press 3 for Check Balance.");
                System.out.println("Press 4 for EXIT.");

                int choice = sc.nextInt();
                switch (choice) {
                    case 1:
                        System.out.println("Enter money to be Withdrawn.");
                        withdraw = sc.nextInt();

                        if (balance >= withdraw) {
                            balance = balance - withdraw;
                            System.out.println("The withdrawing amount is : " + withdraw);
                            System.out.println("Please collect your money.And remove your Card.");
                        } else {
                            System.out.println("Insufficient Balance!!");
                        }
                        System.out.println("");
                        break;

                    case 2:
                        System.out.println("Enter money to be Deposit.");
                        deposit = sc.nextInt();
                        balance = balance + deposit;
                        System.out.println("Your money has been successfully deposited.");
                        System.out.println("");
                        break;

                    case 3:
                        System.out.println("Balance : " + balance);
                        System.out.println("");
                        break;
                    case 4:
                        System.exit(0);
                }
                System.out.println("Available Balance is : " + balance);
                System.out.println("THANK YOU :)");
                System.out.println("Visit Us again.");
                break;
            }

        } else {
            System.out.println("ERROR!! Please enter correct 4 Digit-PIN.");
        }
        sc.close();
    }
}