package Payment;

public class WaterPaymentTemplate
{
    public void printInvoice()
    {
        System.out.println("Bill code number : "+BillCompany.getbill().getCode());
        System.out.println("Owner Name: "+ BillCompany.getbill().getOwnerName());
        System.out.println("Address: "+ BillCompany.getbill().getAddress());
        System.out.println("Bill Date: "+ BillCompany.getbill().getDate());
        System.out.println("Bill Amount: "+ BillCompany.getbill().getAmount());
        System.out.println("Water Bill");
        System.out.println("Water meter readings : "+BillCompany.getbill().getWaterMeterReadings()+" gallons");
        System.out.println("Water meter status : "+ BillCompany.getbill().getWaterMeterStatus());
        


    }
}
