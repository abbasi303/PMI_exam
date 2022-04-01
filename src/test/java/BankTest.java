import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BankTest {
    class BankAccount {
        private int balance;
        private String accNum;
        public BankAccount(String a) {
            accNum = a;
            balance = 0;
        } //constructor
        public void deposit(int amount) {
            balance = balance + amount;
        } // deposit
        public int getBalance() {
            return balance;
        } // getBalance
    } // BankAccount

    @Test
    public void testOpenNewAccount() {
        Bank bank = new Bank();

        assertEquals("", bank.getBalances());

        String accountNumber1 = "12345678-56482315-00000000";
        String accountNumber2 = "12345678-35984576-00000000";

        bank.openNewAccount(accountNumber1);

        assertEquals(accountNumber1 + " 0", bank.getBalances());

        bank.openNewAccount(accountNumber2);

        assertEquals(accountNumber1 + " 0\r\n" + accountNumber2 + " 0", bank.getBalances());
    }

    @Test
    public void testCloseAccount() {
        Bank bank = new Bank();
        String accountNumber1 = "12345678-56482315-00000000";
        String accountNumber2 = "12345678-35984576-00000000";

        bank.openNewAccount(accountNumber1);
        bank.openNewAccount(accountNumber2);
        bank.closeAccount(accountNumber1);

        assertEquals(accountNumber2 + " 0", bank.getBalances());
    }

    @Test
    public void testTransfer() {
        MoneyTransfer moneyTransfer = new MoneyTransfer();
        String accountNumber1 = "12345678-56482315-00000000";
        String accountNumber2 = "12345678-35984576-00000000";
        int amount1 = 30000;
        int amount2 = 500000;

        moneyTransfer.openNewAccount(accountNumber1);
        moneyTransfer.openNewAccount(accountNumber2);
        moneyTransfer.transfer(accountNumber1, amount1);
        moneyTransfer.transfer(accountNumber2, amount2);

        assertEquals(accountNumber1 + " " + amount1 + "\r\n" + accountNumber2 + " " + amount2,
                moneyTransfer.getBalances());
    }
*/
}

