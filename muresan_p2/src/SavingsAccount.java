public class SavingsAccount {

    private static double annualInterestRate;
    private double savingsBalance;

    double monthlyInterest;
    double newInterestRate;


    public SavingsAccount() {
        annualInterestRate = 0;
        savingsBalance = 0;
    }

    public SavingsAccount(double balance) {
        savingsBalance = balance;
    }

    public void calculateMonthlyInterest() {
        System.out.println("Your current savings balance is: " + savingsBalance);
        monthlyInterest = (savingsBalance * annualInterestRate)/12;
        savingsBalance += monthlyInterest;
        System.out.println("Your new savings balance is: " + savingsBalance);
        System.out.print("\n");

    }

    public static void modifyInterestRate(double newInterestRate) {
        annualInterestRate = newInterestRate;
    }

    public double getSavingsBalance() {
        return savingsBalance;
    }
}

class Application {

        public static void main(String [] args) {

            SavingsAccount saver1 = new SavingsAccount(2000);
            SavingsAccount saver2 = new SavingsAccount(3000);

            saver1.modifyInterestRate(.04);
            saver1.calculateMonthlyInterest();

            saver2.modifyInterestRate(.04);
            saver2.calculateMonthlyInterest();

            System.out.println("\n");
            System.out.println("Your balance for this month with 0.4 interest rate for Savings Account 1 is: " + saver1.getSavingsBalance());
            System.out.println("Your balance for this month with 0.4 interest rate for Savings Account 2 is: " + saver2.getSavingsBalance());
            System.out.println("\n");

            saver1.modifyInterestRate(.05);
            saver1.calculateMonthlyInterest();

            saver2.modifyInterestRate(.05);
            saver2.calculateMonthlyInterest();

            System.out.println("\n");
            System.out.println("Your balance for this month with 0.5 interest rate for Savings Account 1 is: " + saver1.getSavingsBalance());
            System.out.println("Your balance for this month with 0.5 interest rate for Savings Account 2 is: " + saver2.getSavingsBalance());
        }
    }


