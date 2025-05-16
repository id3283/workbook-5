package contracts;

public abstract class ParentContract {
    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerAddress() {
        return customerAddress;
    }

    public void setCustomerAddress(String customerAddress) {
        this.customerAddress = customerAddress;
    }

    String customerName;
    String customerAddress;

    void printCustomerDetails() {
        System.out.println("Customer Name: " + customerName);
        System.out.println("Customer Address: " + customerAddress);
    }
}
