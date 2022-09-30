public class FirstYearShoppingList {
    private int quantity;
    private int price;

    public FirstYearShoppingList(int quantity, int price)
    {
        this.quantity = quantity;
        this.price = price;
    }
    public int getQuantity()
    {
        return quantity;
    }
    public int getPrice()
    {
        return price;
    }
    public void setQuantity(int newQuantity)
    {
        quantity = newQuantity;
    }
    public void setPrice(int newPrice)
    {
        price = newPrice;
    }
    }


