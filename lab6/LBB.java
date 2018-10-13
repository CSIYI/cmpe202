import java.util.*;

public class LBB implements Burger{

	public double price;
	public int numOfPatties;
	public List<String> toppingOnTop;
	public List<String> toppingOnBottom;
	public List<String> toppingOnMeat;
	public List<String> toppings;
	public String meat;

	public LBB(int numOfPatties, String meat){
		this.toppingOnTop = new ArrayList<String>();
		this.toppingOnBottom = new ArrayList<String>();
		this.toppingOnMeat = new ArrayList<String>();
		this.toppings = new ArrayList<String>();
		this.price = 5.59;
		this.numOfPatties = numOfPatties;
		this.meat = meat;
	}

	public double getPrice(){
		return this.price;
	}

	public void addTopping(String topping, String location){
		//System.out.println("Enter here!!!!!!!!!!!!!!!!!!!");
		this.toppings.add(topping);
		//System.out.println("topping size is"+toppings.size());
		if(location.equals("on top")){
			addToppingOnTop(topping);
		}else if (location.equals("on bottom")){
			addToppingOnBottom(topping);
		}else{
			addToppingOnMeat(topping);
		}
	}
	public void addToppingOnTop(String topping){
		this.toppingOnTop.add(topping);
	}
	public void addToppingOnBottom(String topping){
		this.toppingOnBottom.add(topping);
	}
	public void addToppingOnMeat(String topping){
		this.toppingOnMeat.add(topping);
	}
}