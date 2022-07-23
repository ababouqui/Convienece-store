package Classes;

public class Product {

    private String productName;
    private int productQuantity;
    private String productCategory;
    private double productPrice;

    public Product() {
    }

    public Product(String productName, int productQuantity, String productCategory, double productPrice) {
        this.productCategory = productCategory;
        this.productName = productName;
        this.productQuantity = productQuantity;
        this.productPrice = productPrice;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getProductQuantity() {

        return productQuantity;
    }

    public void setProductQuantity(int productQuantity) {

        this.productQuantity = productQuantity;
    }

    public String getProductCategory() {

        return productCategory;
    }

    public void setProductCategory(String productCategory) {

        this.productCategory = productCategory;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(double productPrice) {

        this.productPrice = productPrice;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productName='" + productName + '\'' +
                ", productQuantity=" + productQuantity +
                ", productCategory='" + productCategory + '\'' +
                ", productPrice=" + productPrice +
                '}';
    }
}
