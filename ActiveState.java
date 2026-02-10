public class ActiveState implements AccountState {

    @Override
    public void deposit(Account account, Double amount) {
        System.out.println("Deposit performed on an active account!");
        System.out.println(account);
    }

    @Override
    public void withdraw(Account account, Double amount) {
        System.out.println("Withdrawal performed on an active account!");
        System.out.println(account);
    }

    @Override
    public void activate(Account account) {
        System.out.println("Account is already active!");
    }

    @Override
    public void suspend(Account account) {
        account.setAccountState(new SuspendedState());
        System.out.println("Account is suspended!");
    }

    @Override
    public void close(Account account) {
        account.setAccountState(new ClosedState());
        System.out.println("Account is closed!");
    }
}