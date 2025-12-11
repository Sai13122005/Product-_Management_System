import java.util.*;

public class ProductDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ProductManager<String> manager = new ProductManager<>();
        manager.addProduct(new Product<String>("E1", "laptop", 50000, "Electronics"));
        manager.addProduct(new Product<String>("G2", "flour", 120, "Groceries"));
        manager.addProduct(new Product<String>("E2", "phone", 25000, "Electronics"));
        manager.addProduct(new Product<String>("C1", "pant", 1000, "Clothing"));
        manager.addProduct(new Product<String>("C3", "T-shirt", 500, "Clothing"));
        manager.addProduct(new Product<String>("G1", "Red Gram", 100, "Groceries"));
        manager.addProduct(new Product<String>("C2", "shirt", 2000, "Clothing"));
        manager.addProduct(new Product<String>("G3", "Oil", 150, "Groceries"));
        manager.addProduct(new Product<String>("G4", "tea powder", 40, "Groceries"));
        System.out.println("________________Products_________________");
        Map<String , Product<String>> products = manager.getProducts();
        for(Map.Entry<String, Product<String>> e:products.entrySet())
        {
            System.out.print(e.getValue().getProductDetails());
        }
        System.out.println("________________Retrieve product By ID_____________");
        System.out.print("Enter product ID: ");
        String id = sc.next();
        System.out.println("Product Details of ID: "+id+" :-");
        if(manager.getProduct(id) == null)
        {
            System.out.println("Product Not Found !");
        }
        else{
            System.out.println(manager.getProduct(id).getProductDetails());
        }
        System.out.println("________________Electronic_______________");
        List<Product<String>> proCat = manager.getProductsByCategory("Electronics");
        for(Product<String> p: proCat)
        {
            System.out.print(p.getProductDetails());
        }
        System.out.println("________________Clothing_______________");
        List<Product<String>> proCat1 = manager.getProductsByCategory("Clothing");
        for(Product<String> p: proCat1)
        {
            System.out.print(p.getProductDetails());
        }
        System.out.println("________________Groceries_______________");
        List<Product<String>> proCat2 = manager.getProductsByCategory("Groceries");
        for(Product<String> p: proCat2)
        {
            System.out.print(p.getProductDetails());
        }
        System.out.println("________________________________________________");
        System.out.println("Enter Price Range to Search(min , max): ");
        double min = sc.nextDouble();
        double max = sc.nextDouble();
        List<Product<String>> proPrice = manager.findProductsInPriceRange(min, max);
        System.out.println("____________Products in Price Range("+min+"-"+max+")"+"_________________");
        if(proPrice.size() == 0)
        {
            System.out.println("Poducts Not Found!");
        }
        else{
            for(Product<String> p: proPrice)
            {
                System.out.print(p.getProductDetails());
            }
        }
        System.out.println("___________________Statistics________________________");
        System.out.println("Total Products : "+products.size());
        System.out.println("Electronic Products: "+ proCat.size());
        System.out.println("Clothing Products: "+ proCat1.size());
        System.out.println("Grocery Products: "+ proCat2.size());
        sc.close();
    }
}
