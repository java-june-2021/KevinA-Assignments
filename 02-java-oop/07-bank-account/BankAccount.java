import java.util.Random;

public class BankAccount {
    private String name;
    private String accountNumber;
    private double checkingBalance;
    private double savingsBalance;
    private double accountTotal;
    private static int accountsCreated;
    private static double allMoneyAllAccounts;

    // private method for account number Generation
    private String accountGen() {
        String numbers = "0123456789";
        Random random = new Random();
        StringBuilder sb = new StringBuilder();
        int length = 10;
        for (int i = 0; i < length; i++) {
            int index = random.nextInt(numbers.length());
            char randomChar = numbers.charAt(index);
            sb.append(randomChar);
        }
        String newAccount = sb.toString();
        return newAccount;
    }

    // constructors First one for initial deposite
    public BankAccount(String name, double checkingBalance, double savingsBalance) {
        this.name = name;
        this.accountNumber = accountGen();
        this.checkingBalance = checkingBalance;
        this.savingsBalance = savingsBalance;
        accountsCreated++;
        allMoneyAllAccounts += checkingBalance;
        allMoneyAllAccounts += savingsBalance;
        System.out.println("Account Created for " + this.name + " With account number: " + this.accountNumber);
        System.out.println("There are now " + accountsCreated + " total Accounts Created");
        System.out.println("The Beginning balance for " + this.name + "'s Checking account is: " + checkingBalance);
        System.out.println("The Beginning balance for " + this.name + "'s Savings account is: " + savingsBalance);
    }

    public BankAccount(String name) {
        this.name = name;
        this.accountNumber = accountGen();
        this.checkingBalance = 0.00;
        this.savingsBalance = 0.00;
        accountsCreated++;
        System.out.println("Account Created for " + this.name + " With account number: " + this.accountNumber);
        System.out.println("There are now " + accountsCreated + " total Accounts Created");
        System.out.println("The Beginning balance for " + this.name + "'s Checking account is: " + checkingBalance);
        System.out.println("The Beginning balance for " + this.name + "'s Savings account is: " + savingsBalance);
    }

    public BankAccount() {
        this.name = "You need to add a Name for this account.";
        this.accountNumber = accountGen();
        this.checkingBalance = 0.00;
        this.savingsBalance = 0.00;
        accountsCreated++;
        System.out.println("Account Created with account number " + this.accountNumber + ". Please add Name to this account.");
        System.out.println("There are now " + accountsCreated + " total Accounts Created");
        System.out.println("The Beginning balance for " + this.name + "'s Checking account is: " + checkingBalance);
        System.out.println("The Beginning balance for " + this.name + "'s Savings account is: " + savingsBalance);
    }

    // methods
    public void depositChecking(double depositChecking) {
        this.checkingBalance += depositChecking;
        System.out.println("Deposit of " + depositChecking + " was processed. New Balance is " + this.checkingBalance);
        allMoneyAllAccounts += depositChecking;
    }

    public void depositSavings(double depositSavings) {
        this.savingsBalance += depositSavings;
        System.out.println("Deposit of " + depositSavings + " was processed. New Balance is " + this.savingsBalance);
        allMoneyAllAccounts += depositSavings;
    }

    public void withdrawChecking(double withdrawChecking) {
        if (this.checkingBalance - withdrawChecking < 0) {
            System.out.println("Only " + this.checkingBalance + " available for withdrawal.  Transaction not processed.");
        } else {
            this.checkingBalance -= withdrawChecking;
            System.out.println("Withdrawal of " + withdrawChecking + " was processed. New Balance is " + this.checkingBalance);
            allMoneyAllAccounts -= withdrawChecking;
        }
    }

    public void withdrawSavings(double withdrawSavings) {
        if (this.savingsBalance - withdrawSavings < 0) {
            System.out.println("Only " + this.savingsBalance + " available for withdrawal.  Transaction not processed.");
        } else {
            this.savingsBalance -= withdrawSavings;
            System.out.println("Withdrawal of " + withdrawSavings + "was processed. New Balance is " + this.savingsBalance);
            allMoneyAllAccounts -= withdrawSavings;
        }
    }

    public void accountTotal() {
        this.accountTotal = savingsBalance += checkingBalance;
        System.out.println("The total amount of money in both checking and savings for " + this.name + "'s account is: " + this.accountTotal);
    }

    public static void totalInBank() {
        System.out.println("The total money in the Bank is: " + allMoneyAllAccounts);
    }

    // getters and setters
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
        System.out.println("The new name on nameless account is: " + this.name);
    }

    public String getAccountNumber() {
        return this.accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getCheckingBalance() {
        return this.checkingBalance;
    }

    public void setCheckingBalance(double checkingBalance) {
        this.checkingBalance = checkingBalance;
    }

    public double getSavingsBalance() {
        return this.savingsBalance;
    }

    public void setSavingsBalance(double savingsBalance) {
        this.savingsBalance = savingsBalance;
    }
}