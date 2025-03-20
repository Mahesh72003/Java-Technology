class ZooRunner 
{
    public static void main(String zooDetail[]) 
	{

        Zoo zoo = new Zoo();
        zoo.id = 1;
        zoo.name = "Bannerghatta zoo";
        zoo.place = "Karnataka ";
        zoo.county = "India";
        zoo.noOfAnimals = 150;
        zoo.priceForAdult = 20.00;
        zoo.priceForKids = 10.00;
        System.out.println("The id of the zoo is " + zoo.id);
        System.out.println("The name of the zoo is " + zoo.name);
        System.out.println("The place of the zoo is " + zoo.place);
        System.out.println("The county of the zoo is " + zoo.county);
        System.out.println("The number of animals in the zoo is " + zoo.noOfAnimals);
        System.out.println("The price for an adult ticket is " + zoo.priceForAdult);
        System.out.println("The price for a kids ticket is " + zoo.priceForKids);

       
        Zoo anotherZoo = new Zoo();
        anotherZoo.id = 2;
        anotherZoo.name = "Sri Chamarajendra Zoological Gardens";
        anotherZoo.place = "Mysore ";
        anotherZoo.county = "India";
        anotherZoo.noOfAnimals = 500;
        anotherZoo.priceForAdult = 25.00;
        anotherZoo.priceForKids = 12.00;
        System.out.println("");
        System.out.println("The id of the zoo is " + anotherZoo.id);
        System.out.println("The name of the zoo is " + anotherZoo.name);
        System.out.println("The place of the zoo is " + anotherZoo.place);
        System.out.println("The county of the zoo is " + anotherZoo.county);
        System.out.println("The number of animals in the zoo is " + anotherZoo.noOfAnimals);
        System.out.println("The price for an adult ticket is " + anotherZoo.priceForAdult);
        System.out.println("The price for a kids ticket is " + anotherZoo.priceForKids);
    }
}
