import java.util.*;
import java.text.SimpleDateFormat;

public class ReceiptStrategy{
	int OrderNumber;
	Burger burgerOrder;
	Fries friesOrder;
	//double total;
	int numPatties;
	String meat;

	public ReceiptStrategy(int OrderNumber){
		this.OrderNumber = OrderNumber;
		//this.total = 0;
		//printHeader();
	}

	/*public void OrderLBBurger(int count, String meat){
		burgerOrder = new LBB(this.numPatties, meat);
		//this.total+=burgerOrder.getPrice();
		this.meat = meat;
		printBurger("LBB", count,burgerOrder.getPrice());
	}*/

	public void addToppings(String topping, String location){
		burgerOrder.addTopping(topping, location);
		printTopping(topping, location);

	}

	public void OderFries(String style, String size, int count){
		friesOrder = new Fries(style,size, count);
		printFries(style, size, count, friesOrder.price*count);
		//this.total += friesOrder.price*count;

	}

	public void printHeader(){
		System.out.println("--------------------------------------------------");
		System.out.println("FIVE GUYS");
		System.out.println("BURGER AND FRIES");
		System.out.println("STORE # CA-1294");
		System.out.println("5353 ALMADEN EXPY N60");
		System.out.println("SAN JOSE, CA 95118");
		System.out.println("(P) 408-264-9300");
		System.out.println();
		Date date = new Date();
		//System.out.println(date.toString());
		String timeStamp = new SimpleDateFormat("MM/dd/yyyy  HH:mm:ss").format(Calendar.getInstance().getTime());
		System.out.println(timeStamp);
		System.out.println("Order Number: "+ this.OrderNumber);
	}

	public void printFooter(double cash, double total){
		System.out.printf("Total:				"+"%.2f\n",total);
		System.out.println("Cash $"+cash);
		System.out.printf("Change:				"+"%.2f\n",(cash-total));
		System.out.println("Register:1		Tran Seq No: 57875");
		System.out.println("Chashier:Sakda* S.");
		System.out.println("--------------------------------------------------");
	}


	public void printTopping(String topping, String location){
		if(location.equals("on meat")){
			System.out.println("	-> |"+topping);
		}else System.out.println("	"+topping);
	}

	public void printBurger(String burgerName, int count, double price, String meat){
		System.out.println(count+" "+ burgerName+"				"+ price);
		System.out.println("	{{{{ "+meat+" }}}}");
	}

	public void printFries(String style, String size, int count,double price){
		System.out.println(count+" "+size+" "+style+ "			"+ price);
	}
}