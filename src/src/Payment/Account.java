package Payment;

public class Account
{
    int balance;

    ProviderAPI provider;


    public ProviderAPI getProvider() {
        return provider;
    }

    public void setProvider(ProviderAPI provider) {
        this.provider = provider;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getBalance() {
        return balance;
    }
}
