public class ActiveState implements AccountState {

    @Override
    public void deposit(Account account, Double amount) {
        System.out.println("Depositing on an active account...");
        account.setBalance(account.getBalance() + amount);
        System.out.println(account + "\n");
    }

    @Override
    public void withdraw(Account account, Double amount) {
        System.out.println("Withdrawing on an active account...");
        account.setBalance(account.getBalance() - amount);
        System.out.println(account + "\n");
    }

    @Override
    public void activate(Account account) {
        System.out.println("Account is already active!\n");
    }

    @Override
    public void suspend(Account account) {
        account.setAccountState(new SuspendedState());
        System.out.println("Account is suspended!\n");
    }

    @Override
    public void close(Account account) {
        account.setAccountState(new ClosedState());
        System.out.println("Account is closed!\n");
    }
}