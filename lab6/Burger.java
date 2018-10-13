import java.util.*;

public interface Burger{

	double price = 0;
	List<String> toppingOnTop = new ArrayList<String>();
	List<String> toppingOnBottom = new ArrayList<String>();
	List<String> toppingOnMeat = new ArrayList<String>();
	List<String> toppings = new ArrayList<String>();

	double getPrice();
	void addTopping(String topping, String location);
	void addToppingOnTop(String topping);
	void addToppingOnBottom(String topping);
	void addToppingOnMeat(String topping);

}