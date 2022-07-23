package Classes;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Store {
    Manager manager;
    Customer customer;
    Cashier cashier;

    public Store(Manager manager, Customer customer, Cashier cashier) {
        this.manager = manager;
        this.customer = customer;
        this.cashier = cashier;
    }

    public Manager getManager() {
        return manager;
    }

    public Customer getCustomer() {
        return customer;
    }

    public Cashier getCashier() {
        return cashier;
    }

    public static List<Product> list = new ArrayList<>();


    public Store() {
    }


    public static List<Product> getList() {
        return list;
    }

    public List inventoryFile() {
        String path = "src/main/resources/FoodSales.csv";
        try {
            BufferedReader inventory = new BufferedReader(new FileReader(path));
            inventory.readLine();
            String storeProduct = "";
            while ((storeProduct = inventory.readLine()) != null) {
                String[] productArray = storeProduct.split(",");
                String name = productArray[4];
                double price = Double.parseDouble(productArray[6]);
                int quantity = Integer.parseInt(productArray[5]);
                String category = productArray[3];
                if (list.isEmpty()) {
                    Product product = new Product(name, quantity, category, price);
                    list.add(product);
                }
                if (addMethod(name) >= 0) {
                    Product existingProduct = list.get(addMethod(name));
                    existingProduct.setProductQuantity(quantity + existingProduct.getProductQuantity());
                } else {
                    Product product = new Product(name, quantity, category, price);
                    list.add(product);
                }
            }
            inventory.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return getList();
    }

    public int addMethod(String dProduct) {
        int index = -1;
        for (Product itr : list) {
            if (itr.getProductName().equalsIgnoreCase(dProduct)) {
                index = list.indexOf(itr);
            }
        }
        return index;
    }


    public List<Product> searchCategory(String category) {

        return list.stream().filter(product -> product.getProductCategory().equalsIgnoreCase(category)).
                collect(Collectors.toList());
    }
}
