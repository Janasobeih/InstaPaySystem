package Payment;
import ThirdParties.*;
import User_handling.*;
import Bill.*;
public class BankTransferTemplate extends TransferTemplate {
    public Boolean update() {
        if (verifyReceiver() && checkBalance()) {
            int b= user.getAccount().getBalance();
            b-= amount; //user balance is updated
            user.getAccount().setBalance(b);
            Manager.updateBalance(user);
            ReceiverBalance = ReceiverProvider.retreiveBalance(ReceiverData);
            ReceiverBalance += amount;
            return true;
        } else
            return false;

    }

    public void informProviders(User r) {
        ReceiverProvider.UpdateBalance(ReceiverBalance, ReceiverData);  //updating the receiver account
        user.getAccount().getProvider().UpdateBalance(user.getAccount().getBalance(), user.getPhoneNumber()); //updating the sender account
    }
}