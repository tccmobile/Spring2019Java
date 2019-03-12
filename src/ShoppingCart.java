import java.util.ArrayList;
import java.util.LinkedList;

public class ShoppingCart {
    private String customerName;
    private String currentDate;
    private LinkedList<ItemToPurchase> cartItems;

    public ShoppingCart(String customerName, String currentDate) {
        this.customerName = customerName;
        this.currentDate = currentDate;
        this.cartItems = new LinkedList<ItemToPurchase>();
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getDate() {
        return currentDate;
    }

    public void addItem(ItemToPurchase item){

    }

    public void removeItem(String itemName){

    }

    public void modifyItem(ItemToPurchase item){

    }

    public int getNumItemsInCart(){
        int total = 0;


        return total;
    }

    public int getCostOfCart(){
        int total = 0;

        return total;
    }

    public void printTotal(){

    }

    public void printDescriptions(){

    }


}
