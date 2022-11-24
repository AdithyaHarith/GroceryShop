package groceryshop;

public class GroceryShop {
    private String name;
    private int phno;
    private String location;

    public GroceryShop(String name, int phno, String location) {
        this.name = name;
        this.phno = phno;
        this.location = location;

    }
    public void displayShop() {
        System.out.println("name   "+name);
        System.out.println("phno     "+phno);
        System.out.println("location   "+location);

    }

}
