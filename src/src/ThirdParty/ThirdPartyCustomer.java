package ThirdParty;

public class ThirdPartyCustomer {
    private String name;
    private String phoneNumber;
    private int balance;
    private String accountNumber;

    public ThirdPartyCustomer(String name, String phoneNumber, int balance,String AccNo)
    {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.balance = balance;
        accountNumber=AccNo;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public void setAccountNumber(String no)
    {
        accountNumber = no;
    }
    public String getNo(){
        return accountNumber;
    }
    public void setPhoneNumber(String phoneNumber)
    {
        this.phoneNumber = phoneNumber;
    }

    public void setBalance(int balance)
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

    public int getBalance()
    {
        return balance;
    }
}
