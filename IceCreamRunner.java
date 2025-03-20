class IceCreamRunner 
{
    public static void main(String iceCreamDetail[]) 
	{

        
        IceCream iceCream = new IceCream();
        iceCream.id = 1;
        iceCream.name = "Chocolate Delight";
        iceCream.brand = "Amul";
        iceCream.type = "Cup Ice";
        iceCream.price = 50.75;
        iceCream.flavours = "Chocolate";        
        System.out.println("The id of the ice cream is " + iceCream.id);
        System.out.println("The name of the ice cream is " + iceCream.name);
        System.out.println("The brand of the ice cream is " + iceCream.brand);
        System.out.println("The type of the ice cream is " + iceCream.type);
        System.out.println("The price of the ice cream is " + iceCream.price);
        System.out.println("Flavours available: " + iceCream.flavours);


        IceCream anotherIceCream = new IceCream();
        anotherIceCream.id = 2;
        anotherIceCream.name = "Fruity Blast";
        anotherIceCream.brand = "Nandini";
        anotherIceCream.type = "Cone Ice";
        anotherIceCream.price = 30.50;
        anotherIceCream.flavours = "Mango";
        System.out.println("");
        System.out.println("The id of the ice cream is " + anotherIceCream.id);
        System.out.println("The name of the ice cream is " + anotherIceCream.name);
        System.out.println("The brand of the ice cream is " + anotherIceCream.brand);
        System.out.println("The type of the ice cream is " + anotherIceCream.type);
        System.out.println("The price of the ice cream is " + anotherIceCream.price);
        System.out.println("Flavours available: " + anotherIceCream.flavours);
    }
}
