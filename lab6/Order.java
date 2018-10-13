import java.util.*;
public class Order{
	LBB burger;
	Fries fries;
	int OrderNumber;
	ReceiptStrategy receipt;
	PackingSlipStrategy slip;
	int numOfPatties;
	double total = 0;
	String meat;

	public Order(int OrderNumber){
		
		this.OrderNumber = OrderNumber;
		this.receipt = new ReceiptStrategy(OrderNumber);
		this.slip = new PackingSlipStrategy(OrderNumber);
	}
	public void addLBBurger(int numOfPatties, String meat){
		this.burger = new LBB(numOfPatties, meat);
		this.numOfPatties = numOfPatties;
		this.total += burger.getPrice();
		this.meat = meat;
	}
	public void addTopping(String topping, String location){
		this.burger.addTopping(topping, location);
	}
	public void addFries(String style, String size, int count){
		this.fries = new Fries(style,size,count);
		this.total += this.fries.price;

	}
	public void printReceipt(double cash){
		receipt.printHeader();
		receipt.printBurger("LBB",1, this.burger.getPrice(), this.meat);
		List<String> toppings = this.burger.toppings;
		
		for(int i = 0; i < toppings.size(); i++){
			
			if(this.burger.toppingOnTop.contains(toppings.get(i))){
				receipt.printTopping(toppings.get(i), "on top");
			}else if(this.burger.toppingOnMeat.contains(toppings.get(i))){
				receipt.printTopping(toppings.get(i), "on meat");
			}else{
				receipt.printTopping(toppings.get(i), "on bottom");
			}
			
		}
		receipt.printFries(this.fries.style, this.fries.size, this.fries.count, this.fries.price);
		receipt.printFooter(cash, this.total);

	}

	public void printPackingSlip(){
		slip.printHeader(this.numOfPatties);
		slip.printBurger("LBB");
		slip.printToppings(this.burger);
		slip.printFries(this.fries);
		slip.printFooter();

	}
}