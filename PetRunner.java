class PetRunner
{
	public static void main(String petDetile[])
	{
	
	Pet pet=new Pet();
	pet.id=1;
	pet.name="Tom";
	pet.gender="Male";
	pet.breed="Pub";
	pet.age=5;
	pet.price=100.00;
	pet.color="Black";
	System.out.println("the id of pet is "+pet.id);
	System.out.println("the name of the pet is "+pet.name);
	System.out.println("the gender of te pet is "+pet.gender);
	System.out.println("the pet breed is "+pet.breed);
	System.out.println("the age of the pet is "+pet.age);
	System.out.println("the color of the pet is "+pet.color);
	System.out.println("the price of the pet is "+pet.price);	
	
	Pet anotherPet=new Pet();
	anotherPet.id=2;
	anotherPet.name="Buddy";
	anotherPet.gender="Female";
	anotherPet.breed="Dachshund";
	anotherPet.age=8;
	anotherPet.price=5092.09;
	anotherPet.color="white";
	System.out.println("");
	System.out.println("the id of pet is "+anotherPet.id);
	System.out.println("the name of the pet is "+anotherPet.name);
	System.out.println("the gender of te pet is "+anotherPet.gender);
	System.out.println("the pet breed is "+anotherPet.breed);
	System.out.println("the age of the pet is "+anotherPet.age);
	System.out.println("the color of the pet is "+anotherPet.color);
	System.out.println("the price of the pet is "+anotherPet.price);	
	}


}