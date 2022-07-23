package Classes;

import java.util.List;
import java.util.Objects;
import java.util.Queue;

public class CashierImplementation {
    Cashier cashier;
    //     Roles roles;
    Customer customer;
//   public Map<Customer, Product> customersList = new HashMap<>();


//    public Map<Customer, Product> getCustomersList() {
//        return customersList;
//    }

    public CashierImplementation(Cashier cashier) {
        this.cashier = cashier;
    }

    public CashierImplementation() {
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    String message = "";

    public void fifoSell(Queue<Customer> queue) {
        if (!queue.isEmpty()) {
            for (Customer itr: queue){
                Customer customer = itr;
                sellProduct(customer, cashier);
                System.out.println("****************");
            }
        }else {
            System.out.println("Queue is empty");
        }

    }

    public void sellProduct(Customer customer, Cashier cashier) {//checking if the product is available,the quantity the
        // customer wants is in store and if the amount in the customer's wallet is enough to get the product

        List<Product> stockList = Store.getList();
//        if (cashier.getRoles().equals(Roles.CASHIER)){
            for (Product itr: stockList) {
                if (itr.getProductName().equalsIgnoreCase(customer.getCustomerProductName())){
                    if (itr.getProductQuantity() >= customer.getCustomerProductQuantity()){
                        if (customer.getWallet() >= itr.getProductPrice()) {
                            customer.setWallet(customer.getWallet() - itr.getProductPrice());
                            itr.setProductQuantity(itr.getProductQuantity() - customer.getCustomerProductQuantity());
                            System.out.println( printReceipt( customer));
                            break;
                        }else {
                            System.out.println("Insufficient balance");
                        }
                    }else {
                        System.out.println("Only "+ itr.getProductQuantity() +"is available");
                    }
                }else {
                    System.out.println("Product out of stock");
                }
            }
    }

    public void sellBaseOnQuantity(Queue<Customer> queue) {
        if (!queue.isEmpty()) {
            for (Customer itr : queue) {
                Customer customer = itr;
                sellProduct(customer, cashier);
                System.out.println("******************************");
            }
        } else {
            System.out.println("Queue is empty");
        }
    }

    public boolean productsInStore(String productName) {
        boolean value = false;
        for (Product x : Store.list) {
            if (Objects.equals(x.getProductName(), productName)) {
                value = true;
            }
        }
        return value;
    }

    public boolean quantityAvailable(String productName, int productQuantity) {
        boolean value = false;
        for (Product x : Store.list) {
            if (Objects.equals(x.getProductName(), productName)) {
                value = x.getProductQuantity() >= productQuantity;
            }
        }
        return value;
    }

    public String printReceipt(Customer customer) {
        String output = "";
        for (Product product : Store.getList()) {
            if (product.getProductName().equalsIgnoreCase(customer.getCustomerProductName())) {
                output = "Receipt for " + customer.getName() + "\nProduct: " + customer.getCustomerProductName() + "\nPrice: " + product.getProductPrice() +
                        "\nQuantity purchased: " + customer.getCustomerProductQuantity() + "\nTotal price: " +
                        product.getProductPrice() * customer.getCustomerProductQuantity();
            }
        }
        return output;

    }
}
