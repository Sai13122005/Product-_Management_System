public class Product<T>
{
    private String productId;
    private String name;
    private double price;
    private T category;
    public Product(String proId, String name, double price, T cat)
    {   
        productId = proId;
        this.name = name;
        this.price = price;
        category = cat;
    }
    public void setProductId (String id)
    {
        productId = id;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public void setPrice(double price)
    {
        this.price = price;
    }
    public void setCategory(T cat)
    {
        category = cat;
    }
    public String getProductId()
    {
        return productId;
    }
    public String getName()
    {
        return name;
    }
    public double getPrice()
    {
        return price;
    }
    public T getCategory()
    {
        return category;
    }
    public String getProductDetails()
    {
        return "ID: "+productId+"\nName: "+name+"\nPrice: "+price+"\nCategory: "+category.toString()+"\n";
    }
}
