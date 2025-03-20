class Ott 
{
    static String hindiSeries[] = {"Sacred Games", "Mirzapur", "Paatal Lok", "The Family Man", "Made in Heaven", "Delhi Crime", "Kota Factory", "Criminal Justice", "Aspirants", "Breathe"};
    static String englishSeries[] = {"Breaking Bad", "The Crown", "Money Heist", "The Witcher", "Black Mirror", "Stranger Things", "The Office (US)", "The Mandalorian", "Chernobyl", "Dark"};
    static String kannadaSeries[] = {"Karm Yuddh", "Kavyanjali", "Kundalini", "Kaanana", "Kila", "Kshamisi", "Mooru", "Rakthakamal", "Tarak", "Deva"};
    static String malayalamMovies[] = {"The Great Father", "Ee. Ma. Yau", "Angamaly Diaries", "Take Off", "Moothon", "Virus", "Premam", "Bangalore Days", "Drishyam", "Kumbalangi Nights"};

    public static void main(String PrimeVideo[]) 
    {
        System.out.println("Main Started");
        //Arrays of Hindi Series
        System.out.println(" ");
        getHindiSeries();
		//Arrays of English Series
        System.out.println(" ");
        getEnglishSeries();
		//Arrays of Kannada Series
        System.out.println(" ");
        getKannadaSeries();
		//Arrays of Malayalam Movies
        System.out.println(" ");
        getMalayalamMovies();
        System.out.println(" ");
        
        System.out.println("Main Ended");
    }

    public static void getHindiSeries()
    {
        System.out.println("Inside the getHindiSeries()");
        System.out.println("Total Number of Hindi Series are: " + hindiSeries.length);
        System.out.println("The list of Hindi Series are:");
        for(String hindiSerie : hindiSeries)
        {
            System.out.println(hindiSerie);
        }
        System.out.println("Exiting the getHindiSeries()");
    }

    public static void getEnglishSeries()
    {
        System.out.println("Inside the getEnglishSeries()");
        System.out.println("Total Number of English Series are: " + englishSeries.length);
        System.out.println("The list of English Series are:");
        for(String englishSerie : englishSeries)
        {
            System.out.println(englishSerie);
        }
        System.out.println("Exiting the getEnglishSeries()");
    }

    public static void getKannadaSeries()
    {
        System.out.println("Inside the getKannadaSeries()");
        System.out.println("Total Number of Kannada Series are: " + kannadaSeries.length);
        System.out.println("The list of Kannada Series are:");
        for(String kannadaSerie : kannadaSeries)
        {
            System.out.println(kannadaSerie);
        }
        System.out.println("Exiting the getKannadaSeries()");
    }

    public static void getMalayalamMovies()
    {
        System.out.println("Inside the getMalayalamMovies()");
        System.out.println("Total Number of Malayalam Movies are: " + malayalamMovies.length);
        System.out.println("The list of Malayalam Movies are:");
        for(String malayalamMovie : malayalamMovies)
        {
            System.out.println(malayalamMovie);
        }
        System.out.println("Exiting the getMalayalamMovies()");
    }
}
