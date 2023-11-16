
package Payment;
import ThirdParties.*;
import Bill.*;
import ThirdParties.*;
import User_handling.*;

public class Account {
    int balance;
    ProviderAPI provider;
    String UserInfo;

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getBalance() {
        return balance;
    }

    public void setProvider(ProviderAPI provider) {
        this.provider = provider;
    }

    public ProviderAPI getProvider() {
        return provider;
    }

    public void setUserInfo(String info) {
        UserInfo = info;
    }

    public String getUserInfo() {
        return UserInfo;
    }

}

