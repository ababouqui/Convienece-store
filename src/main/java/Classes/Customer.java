package Classes;

public class Customer {

    private String name;
    private double wallet;
    private String customerProductName;
    private int customerProductQuantity;

    public Customer(String name, double wallet, String customerProductName, int customerProductQuantity) {
        this.name = name;
        this.wallet = wallet;
        this.customerProductName = customerProductName;
        this.customerProductQuantity = customerProductQuantity;
    }

    public Customer() {

    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWallet() {
        return wallet;
    }

    public void setWallet(double wallet) {
        this.wallet = wallet;
    }

    public String getCustomerProductName() {
        return customerProductName;
    }

    public void setCustomerProductName(String customerProductName) {
        this.customerProductName = customerProductName;
    }

    public int getCustomerProductQuantity() {
        return customerProductQuantity;
    }

    public void setCustomerProductQuantity(int customerProductQuantity) {
        this.customerProductQuantity = customerProductQuantity;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", wallet=" + wallet +
                ", customerProductName='" + customerProductName + '\'' +
                ", customerProductQuantity=" + customerProductQuantity +
                '}';
    }
}
