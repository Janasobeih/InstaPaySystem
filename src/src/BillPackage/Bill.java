package BillPackage;

import java.time.LocalDate;

public class Bill
{
    BillCompany billCompanyCode;
    String address;//address for which the bill is issued
    String ownerName;
    LocalDate billDate ;//= LocalDate.of(2023, 11, 13);
    double amount;//bill amount
    int code;//code to know which company

    Bill(String name,String address1,double billAmount,LocalDate date,int codeNum)
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
    public void setAddress(double billAmount)
    {
        amount=billAmount;
    }

    public void setDate(LocalDate date)
    {
        billDate=date;
    }
    public void setCode(int codeNum)
    {
        code=codeNum;
    }

    public LocalDate getDate()
    {
        return billDate;
    }
    public String getAddress()
    {
        return address;
    }

    public double getAmount()
    {
        return amount;
    }
    public int getCode()
    {
        return code;
    }

    public String getOwnerName()
    {
        return ownerName;
    }

    public void printBill()
    {
        if(billCompanyCode.getbillCompanyCode()==5632)
            System.out.println("Electricity bill");
        else if(billCompanyCode.getbillCompanyCode()==9473)
            System.out.println("Gas bill");
        else if(billCompanyCode.getbillCompanyCode()==9473)
            System.out.println("Water bill");
        //System.out.println("Electricity bill");
        System.out.println("Code number : "+getCode());
        System.out.println("Owner Name: "+ getOwnerName());
        System.out.println("Address: "+ getAddress());
        System.out.println("Bill Date: "+ getDate());
        System.out.println("Bill Amount: "+ getAmount());

    }


}
