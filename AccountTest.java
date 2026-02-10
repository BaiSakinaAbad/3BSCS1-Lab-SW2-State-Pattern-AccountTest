public class AccountTest {
    public static void main(String[] args) {
        Account myAccount = new Account("1234", 10000.0); // set acct to active state
        myAccount.activate(); // displays "Account is already activated!"

        // Suspend the account
        myAccount.suspend(); // displays "Account is suspended!"

        // Activate the account
        myAccount.activate(); // displays "Account is activated!"

        // Deposit to the account
        myAccount.deposit(1000.0); // update balance and display account

        // Withdraw from the account
        myAccount.withdraw(100.0); // update balance and display account

        // Close the account
        myAccount.close(); // displays "Account is closed!"

        // Attempt transitions on closed account
        myAccount.activate(); // Displays "You cannot activate a closed account!"
        myAccount.suspend();  // Displays "You cannot suspend a closed account!"

        // Withdraw/Deposit on closed account
        myAccount.withdraw(500.0); // Show message "You cannot withdraw on a closed account!" and account info
        myAccount.deposit(1000.0); // Show message "You cannot deposit on a closed account!" and account info
    }
}