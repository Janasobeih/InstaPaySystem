package Payment;
import User_handling.*;
import ThirdParties.*;
public class InstaPayTransferTemplate extends TransferTemplate
{
    public Boolean update()
    {
        if(verifyReceiver()&&checkBalance())
        {
            user.getAccount().balance -= amount; //updating the sender balance
            Manager.updateBalance(user);

            User receiver= Manager.getUser(ReceiverData); //updating the receivers balance
            receiver.getAccount().balance+=amount;
            Manager.updateBalance(receiver);
            informProviders(receiver);

            return true;

        }
        else
            return false;

    }
    public void informProviders(User r)
    {
        User receiver= Manager.getUser(ReceiverData);
        ReceiverProvider.UpdateBalance(ReceiverProvider.retreiveBalance(ReceiverData),receiver.getPhoneNumber());  //updating the receiver account
        user.getAccount().provider.UpdateBalance(user.getAccount().balance,user.getPhoneNumber()); //updating the sender account
    }
}