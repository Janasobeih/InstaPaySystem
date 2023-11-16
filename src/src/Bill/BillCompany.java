package Bill;
import java.util.ArrayList;
import java.util.Objects;
import Bill.*;
public abstract class BillCompany
{

    static ArrayList<Bill> bills = new ArrayList<>();

    public void setBill(ArrayList<Bill> bill) {
        bills = bill;
    }


    public ArrayList<Bill> getBills()
    {
        //getter for all bills
        return bills;

    }

    public static void billPayed(String code)
    {
        for(Bill bill : bills)
        {
            if (bill.getCode().equals(code))
            {
                bills.remove(bill);
                break;
            }

        }
    }


    public boolean billExists(String code)     //checks if the bill exists in the array or not
    {
        for (Bill bill : bills)
        {

            if (bill.getCode().equals(code))
            {
                return true;
            }

        }
        System.out.println("Incorrect bill code enter another one");
        return false;
    }


    public static Bill getBill(String code)     //takes the bill code and checks if that code is there it gets its amount
    {
        for (Bill bill : bills)
        {

            if (bill.getCode().equals(code))
            {
                return bill;
            }

        }
        System.out.println("Incorrect bill code enter another one");
        return null;
    }
}