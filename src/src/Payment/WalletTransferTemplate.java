package Payment;

public class WalletTransferTemplate extends TransferTemplate
{
    public boolean update()
    {
        if(verifyReceiver()||checkBalance())
        {
            user.getAccount().balance += amount;
            Manager.updateBalance(user);
            return true;
        }
        else
            return false;

    }
}
