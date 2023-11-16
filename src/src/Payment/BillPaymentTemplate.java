package Payment;
import ThirdParties.*;
import User_handling.*;
import Bill.*;
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
            if(company.billExists(BillCode))
                return true;
            else {
                System.err.println("This Bill Doesn't Exist");
                return false;
            }
        }
        public Boolean checkBalance()
        {
            if(user.getAccount().getBalance()>BillCompany.getBill(BillCode).getAmount() && verifyBill())
                return true;
            else {
                System.err.println("You Dont Have Enough Balance In Your Account To Complete This Transaction");
                return false;
            }
        }
        public Boolean update()
        {
            if(checkBalance()) {
                int b= user.getAccount().getBalance();
                b-= BillCompany.getBill(getBillCode()).getAmount(); //user balance is updated
                user.getAccount().setBalance(b);
                Manager.updateBalance(user);
                System.out.println("Transaction is Completed");
                return true;
            }
            else
            {
                System.out.println("Couldn't Complete The Transaction");
                return false;
            }

        }
        abstract public void printInvoice();
        public void informCompany()
        {
            BillCompany.billPayed(BillCode);
        }

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
