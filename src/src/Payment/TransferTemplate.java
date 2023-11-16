package Payment;
import ThirdParties.*;
import ThirdParties.ProviderAPI;
import User_handling.*;
import Bill.*;
public abstract class TransferTemplate
{
    User user;
    ProviderAPI ReceiverProvider;
    String ReceiverData;
    int ReceiverBalance;
    InstaPayUsersManager Manager;
    float amount;
    final public void transfer()
    {   verifyReceiver();
        checkBalance();
        update();
        //informProviders();
    }
    public Boolean verifyReceiver()  //bank transfer user.account.getnuber
    {
        if(ReceiverProvider.UserExists(ReceiverData)) //me7tageen neghyar el parameter beta3 userexists le string
            return true;
        else
            return false;
    }
    public Boolean checkBalance()
    {
        if(user.getAccount().getBalance()>amount)
            return true;
        else
            return false;
    }
    abstract public Boolean update();//hena hay7sal el transfer f3lan
    public void informProviders(User r)
    {
        ReceiverProvider.UpdateBalance(ReceiverProvider.retreiveBalance(ReceiverData),ReceiverData);  //updating the receiver account
        user.getAccount().getProvider().UpdateBalance(user.getAccount().getBalance(),user.getPhoneNumber()); //updating the sender account
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