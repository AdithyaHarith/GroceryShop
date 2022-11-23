package groceryshop;

public class GroceryShop {
    private String name;
    private String phno;
    private String location;
    private String type;

    public GroceryShop(String name, String phno, String location, String type) {
        this.name = name;
        this.phno = phno;
        this.location = location;
        this.type = type;
    }
    public void displayShopMenu() {
        System.out.println("Grocery "+name);
        displayShopMenu();
    }
public void displayBasket(){
        //System.out.println(name +"   "+price);

}

}
