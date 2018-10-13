import java.util.*;
import java.text.SimpleDateFormat;

public class PackingSlipStrategy{
	public int OrderNumber;
	public int numPatties;

	public PackingSlipStrategy(int OrderNumber){
		this.OrderNumber = OrderNumber;
		
	}
	public void printHeader(int numPatties){
		System.out.println("--------------------------------------------------");
		this.numPatties = numPatties;
		System.out.println("Patties - "+ this.numPatties);
		System.out.println("OrderNumber: "+ this.OrderNumber);

		Date date = new Date();
		//System.out.println(date.toString());
		String timeStamp = new SimpleDateFormat("MM/dd/yyyy  HH:mm:ss").format(Calendar.getInstance().getTime());
		System.out.println(timeStamp);
		System.out.println("FIVE GUYS");
		System.out.println();
		System.out.println("Sandwich# 1");
	}

	public void printBurger(String burgerName){
		System.out.println("1	"+burgerName);
		
	}

	public void printToppings(LBB burger){

		for(int i = 0; i < burger.toppingOnTop.size(); i++){ 
			System.out.println("	"+burger.toppingOnTop.get(i));
		}
		for(int i = 0; i < burger.toppingOnMeat.size(); i++){
			System.out.println("	->|"+burger.toppingOnMeat.get(i));
		}
		for(int i = 0; i < burger.toppingOnBottom.size(); i++){
			System.out.println("	"+burger.toppingOnBottom.get(i));
		}
		System.out.println("	{{{{ "+burger.meat+" }}}}");

	}

	public void printFries(Fries fries){
		System.out.println("1 "+fries.size+" "+fries.style);
	}


	public void printFooter(){
		System.out.println("Register:1		Tran Seq No: 57875");
		System.out.println("Sakda* S.");
		System.out.println("--------------------------------------------------");
	}
	
}