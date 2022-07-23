package Classes;

public class Cashier extends Product{
    private String name;
    private Roles roles;
    private  int age;
    private double iWallet = 0;


    public Cashier(String productName, int productQuantity, String productCategory,
                   double productPrice, String name, int age, double iWallet, Roles roles) {
        super(productName, productQuantity, productCategory, productPrice);
        this.name = name;
        this.age = age;
        this.iWallet = iWallet;
        this.roles = roles;
    }

    public Cashier(String name, Roles roles, int age) {
        this.name = name;
        this.roles = roles;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getiWallet() {
        return iWallet;
    }

    public void setiWallet(double iWallet) {
        this.iWallet = iWallet;
    }

    public Roles getRoles() {
        return roles;
    }
}
