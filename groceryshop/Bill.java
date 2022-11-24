package groceryshop;

import java.util.List;

public class Bill {
    private List<Item> items;

    public Bill(List<Item> items) {
        this.items = items;
    }

    public void displayBill() {
        double total = 0;
        for (Item item : items) {
            total = total + item.getPrice();
            item.displayItem();
        }
        System.out.println("Total:" +total);
    }
}
