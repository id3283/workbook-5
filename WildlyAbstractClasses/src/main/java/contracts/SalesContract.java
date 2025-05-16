package contracts;

public class SalesContract extends ParentContract {

    public double getSalesTax() {
        return salesTax;
    }

    public void setSalesTax(double salesTax) {
        this.salesTax = salesTax;
    }

    double salesTax;
}
