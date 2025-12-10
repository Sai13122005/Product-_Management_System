import java.util.*;

public class ProductManager<T>
{
    private Map<String, Product<T>> productMap;
    public ProductManager()
    {
        productMap = new HashMap<>();
    }
    public void addProduct(Product<T> product)
    {
        productMap.put(product.getProductId(), product);
    }
    public Product<T> getProduct(String productId)
    {
        return productMap.get(productId);
    }
    public List<Product<T>> getProductsByCategory(T category)
    {
        List<Product<T>> list = new ArrayList<>();
        for(Map.Entry<String, Product<T>> e: productMap.entrySet())
        {
            if(e.getValue().getCategory().equals(category))
            {
                list.add(e.getValue());
            }
        }
        return list;
    }
    public List<Product<T>> findProductsInPriceRange(double min, double max)
    {
        List<Product<T>> list = new ArrayList<>();
        for(Map.Entry<String, Product<T>> e: productMap.entrySet())
        {
            if(e.getValue().getPrice() >= min  && e.getValue().getPrice() <= max)
            {
                list.add(e.getValue());
            }
        }
        return list;
    }
    public Map<String, Product<T>> getProducts()
    {
        return productMap;
    }
}
