package Classes;

import Classes.Interface.IBuy;

public class CustomerImplementation implements IBuy {
    Customer customer;

    public CustomerImplementation(Customer customer) {
        super();
    }

    String message = "";
    @Override
    public String canBuyProducts(String product, int quantity) {
        for (Product eachProduct : Store.getList()) {
            if (eachProduct.getProductName().equalsIgnoreCase(product) &&
                    (eachProduct.getProductQuantity() >= quantity)) {

                //    customer.getCustomerProductName();
                //  if (customer.getCustomerProductName().equals(eachProduct.getProductName())) {
//                addCustomersToQueues();
                return message = eachProduct.getProductName() + " is available.";

            }
            return message = "Product is out of stock";
        }
        return "";
    }
    @Override
    public String toString() {
        return "CustomerImpl{" +
                "customer=" + customer +
                '}';
    }
}
