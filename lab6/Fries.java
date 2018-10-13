
public class Fries{
	public double price;
	public String style;
	public String size;
	public int count;

	public Fries(String style, String size, int count){
		this.style = style;
		this.size = size;
		if(size.equals("LTL")) this.price = 2.79;
		else if (size.equals("REG")) this.price = 3.39;
		else this.price = 5.59;
		this.count = count; 
	}
	/*
	public void Little(String style){
		this.price = 2.79;
		this.style = style;
	}

	public void Regular(String style){
		this.price = 3.39;
		this.style = style;
	}

	public void Large(String style){
		this.price = 5.59;
		this.style = style;
	}

	*/

}