package ThirdParty;

public class ThirdPartyCustomer
{
        private String name;
        private String phoneNumber;
        private float balance;

       public ThirdPartyCustomer(String name, String phoneNumber, float balance)
       {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.balance = balance;
       }
        public void setName(String name)
        {
            this.name = name;
        }

        public void setPhoneNumber(String phoneNumber)
        {
            this.phoneNumber = phoneNumber;
        }

        public void setBalance(float balance)
        {
            this.balance = balance;
        }

        public String getName()
        {
            return name;
        }

        public String getPhoneNumber()
        {
            return phoneNumber;
        }

        public float getBalance()
        {
            return balance;
        }
    }

