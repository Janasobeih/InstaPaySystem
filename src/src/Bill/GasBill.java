package Bill;

import Bill.Bill;

import java.time.LocalDate;

public class GasBill extends Bill
{
    int apartmentNumber;
    int buildingNumber;
    int buildingArea;

    public GasBill(String name, String address1, double billAmount, LocalDate date, String codeNum, int apartmentNumber, int buildingNumber, int buildingArea) {
        super(name, address1, billAmount, date, codeNum);
        this.apartmentNumber = apartmentNumber;
        this.buildingNumber = buildingNumber;
        this.buildingArea = buildingArea;

    }
    public void setApartmentNumber(int apartmentNumber) {
        this.apartmentNumber = apartmentNumber;
    }

    public void setBuildingNumber(int buildingNumber) {
        this.buildingNumber = buildingNumber;
    }

    public void setBuildingArea(int buildingArea) {
        this.buildingArea = buildingArea;
    }

    public int getApartmentNumber() {
        return apartmentNumber;
    }

    public int getBuildingNumber() {
        return buildingNumber;
    }

    public int getBuildingArea() {
        return buildingArea;
    }

}