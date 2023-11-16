package Payment;
import ThirdParties.*;
public class Account
{
    int balance;

    ProviderAPI provider;
    String UserInfo;


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

    public String getUserInfo() {
        return UserInfo;
    }

    public void setUserInfo(String userInfo) {
        UserInfo = userInfo;
    }
}
