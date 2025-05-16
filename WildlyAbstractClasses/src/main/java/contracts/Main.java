package contracts;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        LeaseContract leaseContract = new LeaseContract();
        leaseContract.setCustomerName("Spati");
        leaseContract.setLeasingRate(0.05);

        SalesContract salesContract = new SalesContract();
        salesContract.setCustomerName("Mike");


        ArrayList<ParentContract> contracts = new ArrayList<>();

        contracts.add(leaseContract);
        contracts.add(salesContract);

        for (ParentContract contract : contracts) {
            contract.printCustomerDetails();

            if(contract instanceof LeaseContract) {
                LeaseContract leaseContract2 = (LeaseContract) contract;
                System.out.println("Leasing rate: " + leaseContract2.getLeasingRate());
            }
            if(contract instanceof SalesContract) {
                SalesContract salesContract2 = (SalesContract) contract;
                System.out.println("Sales tax: " + salesContract2.getSalesTax());
            }
        }
    }
}
