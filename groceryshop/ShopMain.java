package groceryshop;

import java.util.ArrayList;
import java.util.List;

public class ShopMain {
    public static void main(String[] args) {
        List<Item> items = new ArrayList<>();

        Item item = new Item("Wheet", 2);
        Item item1 = new Item("Rice", 3);
        Item item2 = new Item("Biscuit", 1);
        items.add(item);
        items.add(item1);
        items.add(item2);

        GroceryShop groceryShop = new GroceryShop("DR SUPER MARKET", 122345, "Chennai");
        groceryShop.displayShop();


        Bill bill = new Bill(items);
        bill.displayBill();

    }
}

