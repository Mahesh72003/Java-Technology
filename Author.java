class Author
{
	public static void getPublisherName()
	{
		System.out.println("Iside the getPublisherName()");
		Publisher.getEditionName();
		System.out.println("Exiting the getPublisherName()");
	}
}