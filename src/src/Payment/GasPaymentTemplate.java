package Payment;

public class GasPaymentTemplate extends BillPaymentTemplate
{
    public void printInvoice(){
        System.out.println("Bill code number : "+BillCompany.getbill().getCode());
        System.out.println("Owner Name: "+ BillCompany.getbill().getOwnerName());
        System.out.println("Address: "+ BillCompany.getbill().getAddress());
        System.out.println("Bill Date: "+ BillCompany.getbill().getDate());
        System.out.println("Bill Amount: "+ BillCompany.getbill().getAmount());
        System.out.println("Gas Bill");
        super.printBill();
        System.out.println("Electricity meter number  : "+BillCompany.getbill().getElectricityMeterNumber());
    }
}
