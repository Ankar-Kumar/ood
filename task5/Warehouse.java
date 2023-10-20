import java.util.Hashtable;

public class Warehouse implements IOrder {
    public String address;
    Hashtable<String, Integer> stock;
    
    public Warehouse(String address){
        this.address=address;
        this.stock=new Hashtable<>();
    }
    
    public void fulfillOrder(Order order) {
        for (Item item : order.itemList){
            String itemName=item.item_name;
            if(stock.containsKey(itemName) &&stock.get(itemName)>0){
                stock.put(itemName,stock.get(itemName)-1);
                System.out.println("Fulfilled " + item.item_name + " from " + this.address);
            }
        }
    }

    public int currentInventory(Item item) {
        String itemName=item.item_name;
        if(stock.containsKey(itemName)){
            return stock.get(itemName);
        }
        return 0;
    }
    
    

}
