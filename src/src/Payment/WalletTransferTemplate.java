package Payment;

import User_handling.User;

public class WalletTransferTemplate extends TransferTemplate
{
    public Boolean update()
    {
        if(verifyReceiver()&&checkBalance())
        {
            user.getAccount().balance -= amount;
            Manager.updateBalance(user);
            ReceiverBalance = ReceiverProvider.retreiveBalance(ReceiverData);
            ReceiverBalance += amount;
            return true;
        }
        else
            return false;

    }
    public void informProviders(User r)
    {
        ReceiverProvider.UpdateBalance(ReceiverBalance,ReceiverData);  //updating the receiver account
        user.getAccount().provider.UpdateBalance(user.getAccount().balance,user.getPhoneNumber()); //updating the sender account
    }
}