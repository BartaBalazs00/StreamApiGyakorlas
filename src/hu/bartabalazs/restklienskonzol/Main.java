package hu.bartabalazs.restklienskonzol;

import jdk.swing.interop.SwingInterOpUtils;

public class Main {

    public static void main(String[] args) {
        RealEstates RE = new RealEstates("realestatetransactions.csv");
        //System.out.println(RE);

        System.out.println(RE.getSalesNumber());
        System.out.println(RE.getBiggestRealEstate());
        System.out.println(RE.getBiggestRealEstateFt());
        System.out.println(RE.getSalesSummery());
        System.out.println(RE.getCountOfRealEstateWithoutSize());
        System.out.println(RE.getCountOfSalesInCity("SACRAMENTO"));
        System.out.println(RE.getSalesInCity("SACRAMENTO"));
        for (String city: RE.getSortedCities()) {
            System.out.println(city);
        }
        for (String city: RE.getSortedEstates()) {
            System.out.println(city);
        }
        for (RealEstate city: RE.getMostExpensiveRealEstate(5)) {
            System.out.println(city);
        }
        System.out.println();
        for (RealEstate city: RE.getMostCheapRealEstate(10)) {
            System.out.println(city);
        }
    }
}
