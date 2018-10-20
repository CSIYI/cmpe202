  

public class BuildOrder {

    public static Component getOrder()
    {
        Composite order = new Composite( "Order" ) ;

        CustomBurger customBurger = new CustomBurger( "Build Your Own Burger" ) ;
        //base price for 1/3 lb
        Burger b = new Burger( "Burger Options" ) ;
        String[] bo = { "Organic Bison*", "1/2lb.", "On A Bun" } ;
        b.setOptions( bo ) ;
        //1 cheese free, extra cheese +1.00
        Cheese c = new Cheese( "Cheese Options" ) ;
        String[] co = { "Yellow American", "Spicy Jalapeno Jack" } ;
        c.setOptions( co ) ;
        c.wrapDecorator( b ) ;

        // Premium Cheese, +1.5 each
        PremiumCheese pc = new PremiumCheese( "Cheese Options" ) ;
        String[] pco = { "Danish Blue Cheese"} ;
        pc.setOptions( pco ) ;
        pc.wrapDecorator( c ) ;

        // 4 toppings free, extra +.75
        Toppings t = new Toppings( "Toppings Options" ) ;
        String[] to = {"Dill Pickle Chip","Black Olives","Spicy Pickles" } ;
        t.setOptions( to ) ;
        t.wrapDecorator( pc ) ;
        
        // premium topping +1.50
        Premium p = new Premium( "Premium Options" ) ;
        String[] po = { "Marinated Tomatoes" } ;
        p.setOptions( po ) ;
        p.wrapDecorator( t ) ;
       

        //Bun
        Bun bun = new Bun("Bun");
        String [] bc = {"Ciabatta (Vegan)"};
        bun.setOptions( bc );
        bun.wrapDecorator( p );

        //Sides
        Side side = new Side ("Side");
        String [] sc = {"Shoestring Fries"};
        side.setOptions( sc );
        side.wrapDecorator(bun);
        
         // 1 sauce free, extra +.75
        Sauce s = new Sauce( "Sauce Options" ) ;
        String[] so = { "Thai Peanut Sauce", "Mayonnaise" } ;
        s.setOptions( so ) ;
        
        s.wrapDecorator( side ) ;


        //Setup Custom Burger Ingredients

        customBurger.setDecorator( s ) ;
        customBurger.addChild( b ) ;
        customBurger.addChild( c ) ;
        customBurger.addChild( pc );
        customBurger.addChild( s ) ;
        customBurger.addChild( t ) ;
        customBurger.addChild( p ) ;
        customBurger.addChild( bun );
        customBurger.addChild( side );

        //Second custome burger

        CustomBurger customBurger2 = new CustomBurger( "Build Your Own Burger" ) ;
        //base price for 1/3 lb
        Burger b2 = new Burger( "Burger Options" ) ;
        String[] bo2 = { "Hormone & Antibiotic Free Beef*", "1/3lb.", "On A Bun" } ;
        b2.setOptions( bo2 ) ;
        //1 cheese free, extra cheese +1.00
        Cheese c2 = new Cheese( "Cheese Options" ) ;
        String[] co2 = { "Smoked Gouda", "Greek Feta" } ;
        c2.setOptions( co2 ) ;
        c2.wrapDecorator( b2 ) ;

        // Premium Cheese, +1.5 each
        PremiumCheese pc2 = new PremiumCheese( "Cheese Options" ) ;
        String[] pco2 = { "Fresh Mozarella"} ;
        pc2.setOptions( pco2 ) ;
        pc2.wrapDecorator( c2 ) ;

        // 4 toppings free, extra +.75
        Toppings t2 = new Toppings( "Toppings Options" ) ;
        String[] to2 = {"Crushed Peanuts" } ;
        t2.setOptions( to2 ) ;
        t2.wrapDecorator( pc2 ) ;
        
        // premium topping +1.50
        Premium p2 = new Premium( "Premium Options" ) ;
        String[] po2 = { "Sunny Side Up egg*", "Marinated Tomatoes" } ;
        p2.setOptions( po2 ) ;
        p2.wrapDecorator( t2 ) ;
       

        //Bun
        Bun bun2 = new Bun("Bun");
        String [] bc2 = {"Gluten-Free Bun"};
        bun2.setOptions( bc2 );
        bun2.wrapDecorator( p2 );

        //Sides
        Side side2 = new Side ("Side");
        String [] sc2 = {"Shoestring Fries"};
        side2.setOptions( sc2 );
        side2.wrapDecorator(bun2);
        
         // 1 sauce free, extra +.75
        Sauce s2 = new Sauce( "Sauce Options" ) ;
        String[] so2 = { "Habanero Salsa" } ;
        s2.setOptions( so2 ) ;
        
        s2.wrapDecorator( side2 ) ;


        //Setup Custom Burger Ingredients

        customBurger2.setDecorator( s2 ) ;
        customBurger2.addChild( b2 ) ;
        customBurger2.addChild( c2 ) ;
        customBurger2.addChild( pc2 );
        customBurger2.addChild( s2 ) ;
        customBurger2.addChild( t2 ) ;
        customBurger2.addChild( p2 ) ;
        customBurger2.addChild( bun2 );
        customBurger2.addChild( side2 );
        
        
        // Add Custom Burger to the ORder
        order.addChild( customBurger );
        order.addChild( customBurger2 );
        return order ;
    }

}


/*

Counter Burger Menu:
https://thecounterburger.emn8.com/?store=Times%20Square

*/