package Classes;

import java.util.List;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
       // System.out.println("Hello world!");


        Manager manager = new Manager("Philips", true);
        Applicant applicant = new Applicant("Martins", 25);
        System.out.println(".............Manager can Hire............");
        System.out.println(manager.canHireCashier(applicant));

        System.out.println("...........Products in Store........");
        Store store = new Store();
        store.inventoryFile();
        printProductList(store.getList());


        Cashier cashier = new Cashier("Carrot", 4220, "Bars", 1.77,
                "Tola", 20, 5000, Roles.CASHIER);
        Cashier cashier2 = new Cashier("Bukky", Roles.CASHIER, 24);
        CashierImplementation cashier1 = new CashierImplementation(cashier);

        Customer sharon = new Customer("Sharon", 1000, "Carrot", 70);
        Customer hilda = new Customer("Hilda", 500, "Carrot", 20);
        Customer sam = new Customer("Samy", 1000, "Carrot", 40);
        Customer jack = new Customer("Jack", 900, "Carrot", 100);
        Customer jill = new Customer("Jill", 800, "Carrot", 50);

        System.out.println("******PRINTING OF RECEIPT BASED ON A QUEUE*******");
        CustomerPriorityQueue cpq = new CustomerPriorityQueue();
        Queue<Customer> fifoQueue = cpq.getFifoQueue();
        CashierImplementation implementation = new CashierImplementation();
        fifoQueue.add(sharon);
        fifoQueue.add(sam);
        fifoQueue.add(jill);
        fifoQueue.add(jack);
        fifoQueue.add(hilda);
        System.out.println(fifoQueue.size());
        implementation.fifoSell(fifoQueue);


        System.out.println("******PRINTING OF RECEIPT BASED ON A PRIORITY QUEUE*******");
        Queue<Customer> priority = cpq.getCustomerQueue();
        priority.add(sharon);
        priority.add(sam);
        priority.add(jill);
        priority.add(jack);
        priority.add(hilda);
        implementation.sellBaseOnQuantity(priority);

        printProductList(store.getList());
        System.out.println();

        System.out.println(".................Customer's wallet..........");
        System.out.println("Sharon's balance is " +sharon.getWallet());
        System.out.println("Hilda's balance is " +hilda.getWallet());
        System.out.println("Sam's balance is " +sam.getWallet());
        System.out.println("Jack's balance is " +jack.getWallet());
        System.out.println("Jill's balance is " +jill.getWallet());

//        System.out.println(".................Cashier's Wallet...........");
//        System.out.println(cashier.getiWallet());
    }
    public static void printProductList(List<Product> product) {
        product.forEach(System.out::println);
    }
    }
