package Payment;
import ThirdParty.*;
import User_handling.*;
import java.util.Scanner;
public abstract class TransferTemplate
{
    User user;
    ProviderAPI ReceiverProvider;
    String ReceiverData;
    InstaPayUsersManager Manager;
    float amount;
    final public void transfer()
    { verifyReceiver();
        checkBalance();
        update();
        informProviders();
    }
    public Boolean verifyReceiver()  //bank transfer user.account.getnuber
    {
        if(ReceiverProvider.userExists(ReceiverData)) //me7tageen neghyar el parameter beta3 userexists le string
            return true;
        else
            return false;
    }
    public Boolean checkBalance()  //sheely el parameter w 7oty cin
    {
       if(user.getAccount().balance>amount)
           return true;
       else
           return false;
    }
    abstract public void update();//hena hay7sal el transfer f3lan
    public void informProviders()
    {
       ReceiverProvider.updateCustomer(amount); //me7tageen n add this function fe providerAPI
    }
    //////////////////////////////////////////////////////////////////////////////////////////
    public User getUser() {
        return user;
    }
    public void setUser(User user) {
        this.user = user;
    }
    public ProviderAPI getReceiverProvider() {
        return ReceiverProvider;
    }
    public void setReceiverProvider(ProviderAPI receiverProvider) {
        ReceiverProvider = receiverProvider;
    }
    public String getReceiverData() {
        return ReceiverData;
    }
    public void setReceiverData(String receiverData) {
        ReceiverData = receiverData;
    }
    public InstaPayUsersManager getManager() {
        return Manager;
    }
    public void setManager(InstaPayUsersManager manager) {
        Manager = manager;
    }
    public float getAmount() {
        return amount;
    }
    public void setAmount(float amount) {
        this.amount = amount;
    }
}
