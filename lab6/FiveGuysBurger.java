
public class FiveGuysBurger{
	

	public static void main(String [ ] args){
		int OrderNumber = 0;
		Order order = new Order(OrderNumber);
		order.addLBBurger(1, "BACON");
		order.addTopping("LETTUCE", "on top");
		order.addTopping("TOMATO", "on top");
		order.addTopping("G ONION", "on meat");
		order.addTopping("JALA Grilled","on meat");
		order.addFries("CAJ","LTL",1);
		order.printReceipt(20);
		order.printPackingSlip();

	}




}