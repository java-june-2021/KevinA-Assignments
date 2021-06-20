public class BankAccountTest {
    public static void main(String[] args) {
        BankAccount kevinsAccount = new BankAccount("Kevin", 100.00, 300.00);
        kevinsAccount.depositChecking(500.00);
        kevinsAccount.withdrawChecking(50.00);
        
        BankAccount kelseesAccount = new BankAccount("Kelsee");
        kelseesAccount.depositChecking(20000.00);
        kelseesAccount.withdrawSavings(100000.00);
        kelseesAccount.withdrawChecking(13254.50);

        BankAccount liamsAccount = new BankAccount();
        liamsAccount.setName("Liam");
        liamsAccount.depositChecking(200.00);
        liamsAccount.depositSavings(200.00);
        liamsAccount.withdrawChecking(250.00);

        BankAccount oliversAccount = new BankAccount("Oliver", 1000.00, 5000.00);
        oliversAccount.accountTotal();

        BankAccount.totalInBank();

    }
}