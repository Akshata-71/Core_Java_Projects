package application1;
import java.util.Random;
public class Shop {
    private int shopId ;
    private String shopName ;
    private String shopType ;
    private Product[] productList = new Product[4];

    public Shop( String shopName, String shopType) {
        this.shopId = new Random().nextInt(100000);
        this.shopName = shopName;
        this.shopType = shopType;
    }

    public int getShopId() {
        return shopId;
    }

    public String getShopName() {
        return shopName;
    }

    public String getShopType() {
        return shopType;
    }

    public void getProductList() {
        System.out.println("PRODUCT ID \t PRODUCT NAME \t PRODUCT PRICE ");
        for (Product p : productList)
        {
            if (p!=null) {
                System.out.println("===============================================================");
                System.out.println(p.getProductId() + "\t\t" + p.getProductName() + "\t\t" + p.getProductPrice());

            }
        }
    }

    public void setShopType(String shopType) {
        this.shopType = shopType;
    }

    public void setProductList(Product p) {
        for (int i =0 ; i<productList.length ; i++)
        {
            if (productList[i]==null) {
                productList[i] = p;
                break;
            }
        }
    }

    public int productListSize()
    {
        return productList.length;
    }

    public Product[] productsList(){
        return productList;
    }
}
