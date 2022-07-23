package Classes;

import java.util.Comparator;

public class CustomerQuantityComparator implements Comparator<Customer> {
    @Override
    public int compare(Customer o1, Customer o2) {
        if (o1.getCustomerProductQuantity() == o2.getCustomerProductQuantity()) {
            return 0;
        } else if (o1.getCustomerProductQuantity() < o2.getCustomerProductQuantity()) {
            return 1;
        } else {
            return -1;
        }
    }
}
