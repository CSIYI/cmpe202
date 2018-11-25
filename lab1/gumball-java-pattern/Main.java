//dummy test

public class Main {

	public static void main(String[] args) {
		GumballMachine gumballMachine1 = new GumballMachine(5, Model.Model25);

		//testcase for mode1
		System.out.println("Mode 1");
		System.out.println(gumballMachine1);
		System.out.println("Test 1-------------");

		gumballMachine1.insertCoin(25);
		gumballMachine1.turnCrank();

		System.out.println(gumballMachine1);

		System.out.println("Test 2-------------");

		gumballMachine1.insertCoin(15);
		gumballMachine1.turnCrank();

		System.out.println(gumballMachine1);


		//testcase for mode2

		System.out.println("Mode 2");
		GumballMachine gumballMachine2 = new GumballMachine(5, Model.Model50Quarter);

		System.out.println("Test 1-------------");
		
		gumballMachine2.insertCoin(25);
		gumballMachine2.insertCoin(25);

		gumballMachine2.turnCrank();

		System.out.println("Test 2-------------");
		gumballMachine2.insertCoin(25);
		gumballMachine2.insertCoin(15);

		gumballMachine2.turnCrank();

		System.out.println("Test 3-------------");

		gumballMachine2.insertCoin(15);
		gumballMachine2.insertCoin(25);

		gumballMachine2.turnCrank();

		System.out.println(gumballMachine2);


		//testcase for mode2

		System.out.println("Mode 3");
		GumballMachine gumballMachine3 = new GumballMachine(5, Model.Model50Coin);
		

		System.out.println("Test 1-------------");

		gumballMachine3.insertCoin(25);
		gumballMachine3.insertCoin(25);

		gumballMachine3.turnCrank();

		System.out.println("Test 2-------------");
		gumballMachine3.insertCoin(25);
		gumballMachine3.insertCoin(5);

		gumballMachine3.turnCrank();

		System.out.println("Test 3-------------");
		gumballMachine3.insertCoin(15);
		gumballMachine3.insertCoin(15);
		gumballMachine3.insertCoin(15);
		gumballMachine3.insertCoin(15);

		gumballMachine3.turnCrank();

		System.out.println(gumballMachine3);




		// //gumballMachine.turnCrank();
		// gumballMachine.insertCoin(25);
		// gumballMachine.turnCrank();

		//System.out.println(gumballMachine);
	}
}
