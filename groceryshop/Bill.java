package groceryshop;

import java.util.List;

public class Bill {
    private List<Basket> baskets;

    public Bill(List<Basket> basket) {
        this.baskets = basket;
    }

    public void displayBill(){
        System.out.println("Bill Details");
        double total=0;
        for(Basket basket : baskets){

           // shopItem.displaybasket();
            total= total+basket.getPrice();
        }
        System.out.println("Total bill: "+ total);

    }
}
