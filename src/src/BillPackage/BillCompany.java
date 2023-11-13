package BillPackage;

import java.util.ArrayList;
public abstract class BillCompany {
    ArrayList<Bill> bills = new ArrayList<>();
    Bill bill;

    abstract int getbillCompanyCode();

    void setBill(ArrayList<Bill> bill)
    {
        bills=bill;
    }

    ArrayList<Bill> getBill() {
        return bills;
    }

    boolean billExists(int code)
    {
        for (Bill bill : bills)
        {

            if (bill.getCode() == code)
            {
                return true;
            }

        }
        System.out.println("Incorrect bill code enter another one");
        return false;
    }
}

