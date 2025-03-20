class ClothesRunner
{
    public static void main(String clothesDetail[]) 
	{

        Clothes clothes = new Clothes();
        clothes.id = 1;
        clothes.name = "Casual Shirt";
        clothes.brand = "Levi's";
        clothes.type = "Shirt";
        clothes.size = "Medium";
        clothes.price = 799.99;
        clothes.colors = "Red";
        clothes.material = "Cotton"; 
        System.out.println("The id of the clothing item is " + clothes.id);
        System.out.println("The name of the clothing item is " + clothes.name);
        System.out.println("The brand of the clothing item is " + clothes.brand);
        System.out.println("The type of the clothing item is " + clothes.type);
        System.out.println("The size of the clothing item is " + clothes.size);
        System.out.println("The price of the clothing item is " + clothes.price);
        System.out.println("Colors available: " + clothes.colors);
        System.out.println("Material of the clothing item is " + clothes.material);


        Clothes anotherCloth = new Clothes();
        anotherCloth.id = 2;
        anotherCloth.name = "Winter Jacket";
        anotherCloth.brand = "Puma";
        anotherCloth.type = "Jacket";
        anotherCloth.size = "Large";
        anotherCloth.price = 1999.49;
        anotherCloth.colors = "Black";  
        anotherCloth.material = "Leather";  
        System.out.println("");
        System.out.println("The id of the clothing item is " + anotherCloth.id);
        System.out.println("The name of the clothing item is " + anotherCloth.name);
        System.out.println("The brand of the clothing item is " + anotherCloth.brand);
        System.out.println("The type of the clothing item is " + anotherCloth.type);
        System.out.println("The size of the clothing item is " + anotherCloth.size);
        System.out.println("The price of the clothing item is " + anotherCloth.price);
        System.out.println("Colors available: " + anotherCloth.colors);
        System.out.println("Material of the clothing item is " + anotherCloth.material);
    }
}
