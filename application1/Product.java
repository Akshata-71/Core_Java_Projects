package application1;
import java.util.Random;
public class Product {
    private int productId ;
    private String productName ;
    private double ProductPrice ;

    public Product( String productName, double productPrice) {
        this.productId = new Random().nextInt(100000) ;
        this.productName = productName;
        ProductPrice = productPrice;
    }

    public int getProductId() {
        return productId;
    }

    public String getProductName() {
        return productName;
    }

    public double getProductPrice() {
        return ProductPrice;
    }

    public void setProductPrice(double productPrice) {
        ProductPrice = productPrice;
    }


}
