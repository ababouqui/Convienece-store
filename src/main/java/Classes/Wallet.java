package Classes;

public class Wallet {
    private float amount;


    public Wallet(float amount) {

        this.amount = amount;
    }

    public float getAmount() {

        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Wallet{" +
                "amount=" + amount +
                '}';
    }
}
