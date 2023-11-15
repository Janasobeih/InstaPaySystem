package Payment;

import User_handling.InstaPayUsersManager;
import User_handling.User;

public abstract class BillPaymentTemplate
{
    User user;
    BillCompany company;
    String BillCode;
    InstaPayUsersManager Manager;

    public void payBill()
    {
        verifyBill();
        checkBalance();
        update();
        informCompany();
        printInvoice();

    }
    boolean verifyBill()  //tmam
    {
        if(company.BillExists(BillCode))
            return true;
        else {
            System.err.println("This Bill Doesn't Exist");
            return false;
        }
    }
    public Boolean checkBalance()  //implement getbill in BillCompany
    {
        if(user.getAccount().balance>BillCompany.SendBill(BillCode).balance||verifyBill())
            return true;
        else {
            System.err.println("You Dont Have Enough Balance In Your Account To Complete This Transaction");
            return false;
        }
    }
    public Boolean update()
    {
        if(checkBalance()) {
            user.getAccount().balance -= BillCompany.getBill().amount; //user balance is updated
            Manager.updateBalance(user);
        }
        else
        {
            System.out.println("Couldn't Complete The Transaction");
            return false;
        }

    }
    public void informCompany()
    {
        BillCompany.removeBill(BillCode);
    }
    abstract public void printInvoice();


    ////////////
    public BillCompany getCompany() {
        return company;
    }

    public void setCompany(BillCompany company) {
        this.company = company;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getBillCode() {
        return BillCode;
    }

    public void setBillCode(String billCode) {
        BillCode = billCode;
    }

    public InstaPayUsersManager getManager() {
        return Manager;
    }

    public void setManager(InstaPayUsersManager manager) {
        Manager = manager;
    }
}
