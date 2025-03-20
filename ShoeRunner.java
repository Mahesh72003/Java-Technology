class ShoeRunner 
{
    public static void main(String shoeDetail[]) 
	{

        Shoe shoe = new Shoe();
        shoe.id = 1;
        shoe.brand = "Nike";
        shoe.type = "sports";
        shoe.size = 6.0;
        shoe.material = "Mesh";
        shoe.price = 650.50;
        System.out.println("The id of the shoe is " + shoe.id);
        System.out.println("The brand of the shoe is " + shoe.brand);
        System.out.println("The type of the shoe is " + shoe.type);
        System.out.println("The size of the shoe is " + shoe.size);
        System.out.println("The material of the shoe is " + shoe.material);
        System.out.println("The price of the shoe is " + shoe.price);

        Shoe anotherShoe = new Shoe();
        anotherShoe.id = 2;
        anotherShoe.brand = "Adidas";
        anotherShoe.type = "Casual";
        anotherShoe.size = 8.0;
        anotherShoe.material = "Leather";
        anotherShoe.price = 1053.75;
        System.out.println("");
        System.out.println("The id of the shoe is " + anotherShoe.id);
        System.out.println("The brand of the shoe is " + anotherShoe.brand);
        System.out.println("The type of the shoe is " + anotherShoe.type);
        System.out.println("The size of the shoe is " + anotherShoe.size);
        System.out.println("The material of the shoe is " + anotherShoe.material);
        System.out.println("The price of the shoe is " + anotherShoe.price);
    }
}
