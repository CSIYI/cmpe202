enum Model {
	Model25, Model50Quarter, Model50Coin;
}

public class GumballMachine {
 
	State soldOutState;
	State noQuarterState;
	State hasCoinState;
	State soldState;
 
	State state = soldOutState;
	int count = 0;
	
	
	Model m;
	int total;
	
	public GumballMachine(int numberGumballs, Model m) {
		soldOutState = new SoldOutState(this);
		noQuarterState = new NoQuarterState(this);
		hasCoinState = new HasCoinState(this);
		soldState = new SoldState(this);
		
		this.m = m;
		this.total = 0;
		
		this.count = numberGumballs;
 		if (numberGumballs > 0) {
			state = noQuarterState;
		} 
	}
 
	public void insertCoin(int coin) {
		state.insertCoin(coin);
	}
 
	public void ejectCoin() {
		state.ejectCoin();
	}
 
	public void turnCrank() {
		state.turnCrank();
		state.dispense();
	}

	void setState(State state) {
		this.state = state;
	}
 
	void releaseBall() {
		System.out.println("A gumball comes rolling out the slot...");
		if (count != 0) {
			count = count - 1;
		}
		this.total = 0;
	}
 
	int getCount() {
		return count;
	}
 
	void refill(int count) {
		this.count = count;
		state = noQuarterState;
	}

    public State getState() {
        return state;
    }

    public State getSoldOutState() {
        return soldOutState;
    }

    public State getNoQuarterState() {
        return noQuarterState;
    }

    public State getHasQuarterState() {
        return hasCoinState;
    }

    public State getSoldState() {
        return soldState;
    }
 
	public String toString() {
		StringBuffer result = new StringBuffer();
		result.append("\nMighty Gumball, Inc.");
		result.append("\nJava-enabled Standing Gumball Model #2004");
		result.append("\nInventory: " + count + " gumball");
		if (count != 1) {
			result.append("s");
		}
		result.append("\n");
		result.append("Machine is " + state + "\n");
		return result.toString();
	}
}
