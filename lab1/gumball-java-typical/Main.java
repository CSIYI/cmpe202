
public class Main {

	public static void main(String[] args) {
		/*
		 * There are three types machines. Model25 is the machine only accepts one quarter.
		 * Model50quarter is the machine accepting two quarters,
		 * Model50coin is the machine accepting any coins.
		 */
		
		GumballMachine gumballMachine = new GumballMachine(5, Model.Model25);

		System.out.println(gumballMachine);

		gumballMachine.insertCoin( 25 );
		gumballMachine.turnCrank();

		System.out.println(gumballMachine);

		gumballMachine.insertCoin( 25 );
		gumballMachine.turnCrank();
		gumballMachine.insertCoin( 25 );
		gumballMachine.turnCrank();

		System.out.println(gumballMachine);
		
		//Test Case for machine that accepts two quarters
		GumballMachine gumballMachine1 = new GumballMachine(5, Model.Model50Quarter);

		System.out.println(gumballMachine1);

		gumballMachine1.insertCoin( 25 );
		gumballMachine1.turnCrank();

		System.out.println(gumballMachine1);

		gumballMachine1.insertCoin( 25 );
		gumballMachine1.insertCoin( 25 );
		gumballMachine1.turnCrank();
		
		gumballMachine1.insertCoin( 15 );		
		gumballMachine1.insertCoin( 35 );
		gumballMachine1.turnCrank();
		
		System.out.println(gumballMachine1); 
		
		
		//Test Case for machine that accepts any coins for total 50 cents
		GumballMachine gumballMachine2 = new GumballMachine(5, Model.Model50Coin);

		System.out.println(gumballMachine2);

		gumballMachine2.insertCoin( 25 );
		gumballMachine2.insertCoin( 25 );
		gumballMachine2.turnCrank();

		System.out.println(gumballMachine2);

		gumballMachine2.insertCoin( 25 );
		gumballMachine2.insertCoin( 5 );
		gumballMachine2.insertCoin( 5 );
		gumballMachine2.insertCoin( 5 );
		gumballMachine2.insertCoin( 10 );
		gumballMachine2.turnCrank();
				
		gumballMachine2.insertCoin( 15 );		
		gumballMachine2.insertCoin( 15 );
		gumballMachine2.turnCrank();
		
		gumballMachine2.insertCoin( 15 );		
		gumballMachine2.insertCoin( 15 );
		gumballMachine2.insertCoin( 15 );		
		gumballMachine2.insertCoin( 15 );
		gumballMachine2.turnCrank();
				
		System.out.println(gumballMachine2);
		
	}
}
