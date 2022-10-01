public class FirstYearShoppingList
{
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

//Aici am declarat o Clasa pentru lista de iteme de care o sa ai nevoie la Hogwarts
//Am facut un constructor si am folosit metota get si set pentru a putea sa lucrez cu pretul si cantitatea
