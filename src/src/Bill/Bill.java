package Bill;

import java.time.LocalDate;

public class Bill
{

    String address;//address for which the bill is issued
    String ownerName;
    LocalDate billDate ;//= LocalDate.of(2023, 11, 13);
    double amount;//bill amount
    String code;//code to know which bill

    Bill()
    {
        ownerName=" ";
        address=" ";
        amount=0;
        code=" ";


    }
    Bill(String name,String address1,double billAmount,LocalDate date,String codeNum)
    {
        ownerName=name;
        address=address1;
        amount=billAmount;
        billDate=date;
        code=codeNum;

    }

    public void setAddress(String address1)
    {
        address=address1;
    }
    public void setOwnerName(String name)
    {
        ownerName=name;
    }
    public void setBillAmount(double billAmount)
    {
        amount=billAmount;
    }

    public void setDate(LocalDate date)
    {
        billDate=date;
    }
    public void setCode(String codeNum)
    {
        code=codeNum;
    }


    public String getAddress()
    {
        return address;
    }

    public String getOwnerName()
    {
        return ownerName;
    }

    public double getAmount()
    {
        return amount;
    }


    public LocalDate getDate()
    {
        return billDate;
    }


    public String getCode()
    {
        return code;
    }

}