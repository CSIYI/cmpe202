public class GumballMachine
{

    private int num_gumballs;
    private boolean has_quarter;
    private int model;
    private int total;

    public GumballMachine( int size, int model )
    {
        // initialise instance variables
        this.num_gumballs = size;
        this.has_quarter = true;
        this.model = model;
        this.total = 0;
    }

    public void insertCoin(int coin)
    {
    		total += coin;
        if ( coin != 25 )
            this.has_quarter = false ;
    }
    
    public void turnCrank()
    {
	    	if ( this.has_quarter && model == 1 && this.total >= 25 || 
	    			this.total >= 50 && model == 3 || this.has_quarter && model == 2 && 
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
	    		if(model == 3)
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
