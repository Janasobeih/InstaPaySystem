package Payment;

public class Account
{
    int balance;
    ITransferBehaviour transfer;
    IPayBillBehaviour payBill;
    //ProviderAPI provider;


    public void setTransferBehaviour(ITransferBehaviour transfer) {
        this.transfer = transfer;
    }
    public void setPayBill(IPayBillBehaviour payBill)
    {
        this.payBill = payBill;
    }
    public void PerformTransfer()
    {
        transfer.tranfer();
    }
    public void PerformPayBill()
    {
        payBill.paybill();
    }
    public void setBalance(int balance) {
        this.balance = balance;
    }


}
