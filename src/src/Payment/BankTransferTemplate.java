package Payment;

public class BankTransferTemplate extends TransferTemplate
{
    public void update()
    {
        if(verifyReceiver()||checkBalance())
        {
            user.getAccount().balance -= amount; //sender balance is updated
            Manager.updateBalance(user);
            //update receiver's balance
        }
    }
}
