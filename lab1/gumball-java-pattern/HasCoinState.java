

public class HasCoinState implements State {
	 GumballMachine gumballMachine;
 
	public HasCoinState(GumballMachine gumballMachine) {
		this.gumballMachine = gumballMachine;
	}
  
	public void insertCoin(int coin) {
		if(this.gumballMachine.m == Model.Model25 || (this.gumballMachine.m == Model.Model50Quarter && this.gumballMachine.total == 50)) {
			System.out.println("You can't insert another quarter");
		}else {
			if(this.gumballMachine.m == Model.Model50Quarter) {
				if(coin != 25) {
					ejectCoin();
					System.out.println("You should insert another quarter");
				}else {
					this.gumballMachine.total += coin;
					System.out.println("You insert another quarter");
				} 
			}else {
				System.out.println("You insert a " +coin+ " cents coin");
				this.gumballMachine.total += coin;
			}			
		}		
	}
 
	public void ejectCoin() {
		System.out.println("Coin returned");
		gumballMachine.setState(gumballMachine.getNoQuarterState());
	}
 
	public void turnCrank() {
		System.out.println("You turned...");
		if(this.gumballMachine.m == Model.Model25 && this.gumballMachine.total >= 25 || this.gumballMachine.total >= 50) {
			gumballMachine.setState(gumballMachine.getSoldState());
		}
		
	}

    public void dispense() {
        System.out.println("No gumball dispensed");
    }
 
	public String toString() {
		return "waiting for turn of crank";
	}
}
