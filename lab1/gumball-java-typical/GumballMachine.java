enum Model 
{ 
    Model25, Model50Quarter, Model50Coin; 
} 
public class GumballMachine
{

    private int num_gumballs;
    private boolean has_quarter;
    private Model m;
    private int total;

    public GumballMachine( int size, Model m )
    {
        // initialise instance variables
        this.num_gumballs = size;
        this.has_quarter = true;
        this.m = m;
        this.total = 0;
    }

    public void insertCoin(int coin)
    {
    		this.total += coin;
        if ( coin != 25 )
            this.has_quarter = false ;
    }
    
    public void turnCrank()
    {

	    	if ( this.has_quarter && m == Model.Model25 && this.total >= 25 || 
	    			this.total >= 50 && m == Model.Model50Coin || this.has_quarter && m == Model.Model50Quarter && 
	    			this.total >= 50 )
	    	{
	    		if ( this.num_gumballs > 0 )
	    		{
	    			this.num_gumballs-- ;
	    			System.out.println( "Thanks for your coin.  Gumball Ejected!" ) ;
	    		}
	    		else
	    		{
	    			System.out.println( "No More Gumballs!  Sorry, can't return your coin." ) ;
	    		}
	    		
	    	}
	    	else 
	    	{
	    		if( m == Model.Model50Coin)
	    		{
	    			System.out.println( "Please insert a coin" ) ;
	    		}
	    		else
	    		{
	    			System.out.println( "Please insert a quarter" ) ;
	    		}
	    	} 
	    	this.has_quarter = true ;
	    	this.total = 0;
    }
}
