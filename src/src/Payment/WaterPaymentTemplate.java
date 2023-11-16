package Payment;

import Bill.*;
public class WaterPaymentTemplate extends BillPaymentTemplate
{
    public void printInvoice()
    {
        System.out.println("Bill code number : "+ BillCompany.getBill(BillCode).getCode());
        System.out.println("Owner Name: "+ BillCompany.getBill(BillCode).getOwnerName());
        System.out.println("Address: "+ BillCompany.getBill(BillCode).getAddress());
        System.out.println("Bill Date: "+ BillCompany.getBill(BillCode).getDate());
        System.out.println("Bill Amount: "+ BillCompany.getBill(BillCode).getAmount());
        System.out.println("Water Bill");

    }
}
