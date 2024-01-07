import java.util.List;
// proxy class
public class OrderFulfillment implements IOrder {
        private List<Warehouse> warehouses;
        public OrderFulfillment(List<Warehouse>warehouses){
            this.warehouses=warehouses;
        }
        public void fulfillOrder(Order order){
            for(Item item:order.itemList){
                for(Warehouse warehouse:warehouses){
                    if(warehouse.currentInventory(item)>0){
                        Order subOrder=new Order(List.of(item));
                        warehouse.fulfillOrder(subOrder);
                        break;
                    }
                }
            }
        }
       
        
}