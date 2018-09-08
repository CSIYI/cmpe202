

public class NoQuarterState implements State {
    GumballMachine gumballMachine;
 
    public NoQuarterState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }
 
	public void insertCoin(int coin) {
		
		if((this.gumballMachine.m == Model.Model25 || this.gumballMachine.m == Model.Model50Quarter )&&coin != 25) {
			ejectCoin();
			System.out.println("You should insert a quarter");
		} else {
			System.out.println("You insert a " +coin+ " cents coin");
			this.gumballMachine.total += coin;
			gumballMachine.setState(gumballMachine.getHasQuarterState());
		}
	}
 
	public void ejectCoin() {
		System.out.println("You haven't inserted a quarter");
	}
 
	public void turnCrank() {
		System.out.println("You turned, but there's no quarter");
	 }
 
	public void dispense() {
		System.out.println("You need to pay first");
	} 
 
	public String toString() {
		return "waiting for quarter";
	}
}
