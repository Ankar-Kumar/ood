import java.util.List;

public class Main {
    public static void main(String[] args) {
        Warehouse warehouse1=new Warehouse("house_a");
        Warehouse warehouse2=new Warehouse("house_b");

        warehouse1.stock.put("ankar",5);
        warehouse2.stock.put("losser",10);
        List<Warehouse>warehouses=List.of(warehouse1,warehouse2);

        OrderFulfillment orderFulfillment=new OrderFulfillment(warehouses);

        Item item1 = new Item("ankar");
        Item item2 = new Item("losser");
        Order order = new Order(List.of(item1, item2));
        
        orderFulfillment.fulfillOrder(order);

    }
}
