package Classes;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class CustomerPriorityQueue {
    public static Queue<Customer> fifoQueue = new LinkedList<>();
    private static PriorityQueue<Customer> customerQueue = new PriorityQueue<>(new CustomerQuantityComparator());

    public PriorityQueue<Customer> getCustomerQueue() {
        return customerQueue;
    }

    public Queue<Customer> getFifoQueue() {
        return fifoQueue;
    }

    public void addToQueue(Customer customer){
        this.getFifoQueue().add(customer);
    }
}
