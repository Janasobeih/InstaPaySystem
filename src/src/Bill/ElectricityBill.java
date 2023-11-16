package Bill;

import Bill.Bill;

import java.time.LocalDate;

public class ElectricityBill extends Bill
{

    int electricityMeterNumber;

    public ElectricityBill(String name, String address1, double billAmount, LocalDate date, String codeNum, int electricityMeterNumberr) {
        super(name, address1, billAmount, date, codeNum);
        electricityMeterNumber =electricityMeterNumberr;
    }
    public void setElectricityMeterNumber(int electricityMeterNumber) {
        this.electricityMeterNumber = electricityMeterNumber;
    }

    public int getElectricityMeterNumber() {
        return electricityMeterNumber;
    }



}