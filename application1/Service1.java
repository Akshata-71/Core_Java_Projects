package application1;

public class Service1 {
    private Shop[] shopList = new Shop[5];

    public void addShop(Shop s)
    {
        for (int i =0 ; i<shopList.length ; i++)
        {
            if (shopList[i]==null)
            {
                shopList[i]= s;
                break;
            }
        }
    }

    public void displayShop()
    {
        for (Shop s: shopList)
        {
            if (s!=null)
            {
                System.out.println("SHOP ID "+ s.getShopId());
                System.out.println("SHOP NAME "+ s.getShopName());
                System.out.println("SHOP TYPE "+s.getShopType());
                s.getProductList();
            }
        }
    }


    public void searchShop(String shopName){

        for (int i=0; i<shopList.length ;i++){
            if (shopList[i] != null && shopList[i].getShopName().equalsIgnoreCase(shopName)){
                System.out.println("******************");
                System.out.println("Name   :" + shopList[i].getShopName());
                System.out.println("ID     :" + shopList[i].getShopId());
                System.out.println("Type   :" + shopList[i].getShopType());


            }
        }
    }


    public void displayProducts(){
        for (Shop s : shopList) {
            if (s != null) {
                for (Product p : s.productsList()) {
                    if (p != null) {
                        System.out.println("xxxxxxxxxxxxxxxxxx");
                        System.out.println("PRODUCT NAME   :" + p.getProductName());
                        System.out.println("PRODUCT ID     :" + p.getProductId());
                        System.out.println("PRODUCT TYPE   :" + p.getProductPrice());

                    }
                }
            }
        }
    }

    public void searchProduct(String productName){
        for (Shop s : shopList){
            if (s != null){
                for (Product p : s.productsList()){
                    if (p != null){
                        System.out.println("------------------");
                        System.out.println("Name    :" + s.getShopName());
                        System.out.println("Type    :" + s.getShopId());
                        System.out.println("ID      :" + s.getShopType());
                        System.out.println("Product price :" + p.getProductPrice());

                    }
                }
            }
        }
    }
}
