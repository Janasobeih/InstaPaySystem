package BillPackage;

import java.time.LocalDate;

public class WaterCompany extends BillCompany  {

    public WaterCompany(String name, String address1, double billAmount, LocalDate date, int codeNum,int companyCodee)
    {

    }
    int companyCode= 3284;
    @Override
    int getbillCompanyCode() {
        return companyCode;
    }



}
