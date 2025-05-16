package contracts;

public class LeaseContract extends ParentContract{

    public double getLeasingRate() {
        return leasingRate;
    }

    public void setLeasingRate(double leasingRate) {
        this.leasingRate = leasingRate;
    }

    double leasingRate;
}
