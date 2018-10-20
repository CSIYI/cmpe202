  

public class Client {

    //public static void runTest()
    public static void main(String [] args)
    {
        Component theOrder = BuildOrder.getOrder() ;
        theOrder.printDescription();

    }
}
 
