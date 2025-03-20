class Book 
{
    static String name = "The Art of Being Alone";
    static int pages = 152;
    static String weight = "150 g";
    static String dimensions = "14 x 1.5 x 22 cm";
    static String language = "English";

    public static void main(String[] Amaryllis) 
	{
        System.out.println("The is Name: " + name);
        System.out.println("The is Pages: " + pages);
        System.out.println("The is Weight: " + weight);
        System.out.println("The is Dimensions: " + dimensions);
        System.out.println("The is Language: " + language);

        System.out.println("Re-init of Book (directly)");
        name = "The Power of Now";
        pages = 240;
        weight = "200 g";
        dimensions = "13 x 2 x 21 cm";
        language = "German";

        System.out.println("The is Name: " + name);
        System.out.println("The is Pages: " + pages);
        System.out.println("The is Weight: " + weight);
        System.out.println("The is Dimensions: " + dimensions);
        System.out.println("The is Language: " + language);

        System.out.println("Re-init using method");
        updateBook();
        System.out.println("The is Name: " + name);
        System.out.println("The is Pages: " + pages);
        System.out.println("The is Weight: " + weight);
        System.out.println("The is Dimensions: " + dimensions);
        System.out.println("The is Language: " + language);
    }

    public static void updateBook() 
	{
        name = "Sapiens: A Brief History of Humankind";
        pages = 498;
        weight = "500 g";
        dimensions = "15 x 3 x 23 cm";
        language = "Hebrew";
    }
}
