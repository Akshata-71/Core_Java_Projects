package application1;
import java.util.Scanner;

public class MainApp1 {
    static Scanner sc = new Scanner(System.in);
    static Service1 service = new Service1();
    public static void main(String[] args) {
        boolean status = true ;
        while (status)
        {
            System.out.println("---------------------->");
            System.out.println("1. ADD SHOP ");
            System.out.println("2. DISPLAY SHOP ");
            System.out.println("3. SEARCH SHOP BY NAME");
            System.out.println("4. DISPLAY ALL PRODUCT");
            System.out.println("5. SEARCH PRODUCT");
            System.out.println("6. EXIT ");
            System.out.println("ENTER OPTION");
            int ch = sc.nextInt() ;

            switch (ch)
            {
                case 1 :
                    addShop();
                    break;

                case 2:
                    service.displayShop();
                    break;

                case 3: searchShop();
                    break;

                case 4: service.displayProducts();
                    break;

                case 5:
                    searchProduct();

                case 6:
                    status = false ;
                    break;
                default:
                    System.out.println("INVALID CHOICE !!");
            }
        }
    }

    public static void addShop()
    {
        System.out.println("ENTER SHOP NAME ");
        String shopName = sc.next();
        System.out.println("ENTER SHOP TYPE ");
        String shopType = sc.next();

        Shop s1 = new Shop(shopName , shopType);
        int productCount =0 ;
        while (productCount < s1.productListSize())
        {
            System.out.println("1. ADD PRODUCT ");
            System.out.println("2. SAVE ");
            int ch = sc.nextInt();
            if (ch==1)
            {
                Product product = addProduct();
                s1.setProductList(product);
                productCount++;
            } else{
                break;
            }
        }

        service.addShop(s1);
    }



    public static Product addProduct()
    {
        System.out.println("ENTER PRODUCT NAME ");
        String productName = sc.next();
        System.out.println("ENTER PRODUCT PRICE ");
        double productPrice = sc.nextDouble() ;

        Product p = new Product(productName , productPrice);
        return p;
    }

    public static void searchShop(){
        System.out.println("ENTER SHOP NAME ");
        String shopName = sc.next();

        service.searchShop(shopName);
    }

    public static void searchProduct(){
        System.out.println("ENTER PRODUCT");
        String productName = sc.next();

        service.searchProduct(productName);
    }

}