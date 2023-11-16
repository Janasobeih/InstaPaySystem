package ThirdParties;
import java.util.ArrayList;
public class ProviderAPI {
    private ArrayList<ThirdPartyCustomer> customers;

    //customers array of type third party Customer
    public ProviderAPI() {
    }

    public ProviderAPI(ArrayList<ThirdPartyCustomer> customers) {
        this.customers = customers;
    }

    public void setCustomers(ArrayList<ThirdPartyCustomer> customers) {
        this.customers = customers;
    }

    public ArrayList<ThirdPartyCustomer> getCustomers() {
        return customers;
    }


    public Boolean UserExists(String checker) {
        int size = customers.size();

        for (int i = 0; i < size; i++) {
            if (customers.get(i).getPhoneNumber().equals(checker)) {
                return true;
            }
        }
        return false;      //if not found
    }

    public Boolean UpdateBalance(int NewBalance, String UserNo) {
        for (int i = 0; i < customers.size(); i++) {
            if (customers.get(i).getPhoneNumber().equals(UserNo))
            {
                customers.get(i).setBalance(NewBalance);
                return true;
            }
        }
        return false;
    }
    public int retreiveBalance(String UserNo)
    {
        int balance=0;
        for (int i = 0; i < customers.size(); i++) {
            if (customers.get(i).getNo().equals(UserNo))
            {
            balance=customers.get(i).getBalance();
            }
        }
        return balance;
    }
    public Boolean authenticateUser(String phoneNo,String AccNo){


        for (int i = 0; i < customers.size(); i++) {

            if(customers.get(i).getPhoneNumber().equals(phoneNo)&&customers.get(i).getNo().equals(AccNo)){
                return true;
            }

        }
        return false;
    }
}
