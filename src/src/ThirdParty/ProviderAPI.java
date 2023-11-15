package ThirdParty;

import java.util.ArrayList;

public class ProviderAPI
{
    private ArrayList<ThirdPartyCustomer> customers;             //customers array of type thirdpatyCustomer

    public ProviderAPI(ArrayList<ThirdPartyCustomer> customers)
    {
        this.customers = customers;
    }
    public void setCustomers(ArrayList<ThirdPartyCustomer> customers)
    {
        this.customers = customers;
    }

    public ArrayList<ThirdPartyCustomer> getCustomers()
    {
        return customers;
    }


    public boolean userExists(User user)
    {
        String checker = user.getPhoneNumber();
        int size = customers.size(); 

        for (int i = 0; i < size; i++)
        {
            if (customers.get(i).getPhoneNumber().equals(checker))
            {
                return true;
            }
        }

        return false;      //if not found
    }

}
