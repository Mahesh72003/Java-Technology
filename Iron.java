class Iron
{
    static boolean isOn;
    static int maxTemperature = 10;  
    static int minTemperature;    
    static int currentTemperature;
    static boolean isSpraying;

    // Method to turn the iron on or off
    public static void onOrOff()
    {
        if(isOn)
        {
            isOn = false;
            System.out.println("The Iron is off");
        }
        else
        {
            isOn = true;
            System.out.println("The Iron is on");
        }
    }

    public static void increaseTemperature()
    {
        if(isOn)
        {
            if(currentTemperature < maxTemperature)
            {
                currentTemperature++;
                System.out.println("The current Temperature is " + currentTemperature + "°C");
            }
            else
            {
                System.out.println("The Iron is at maximum temperature");
            }
        }
        else
        {
            System.out.println("Iron is off. Please turn it on first.");
        }
    }

    public static void decreaseTemperature()
    {
        if(isOn)
        {
            if(currentTemperature > minTemperature)
            {
                currentTemperature--;
                System.out.println("The current Temperature is " + currentTemperature + "°C");
            }
            else
            {
                System.out.println("The Iron is at minimum temperature");
            }
        }
        else
        {
            System.out.println("Iron is off. Please turn it on first.");
        }
    }

    public static void Spray()
    {
        if(isOn)
        {
            if(isSpraying)
            {
                isSpraying = false;
                System.out.println("Spray function is off.");
            }
            else
            {
                isSpraying = true;
                System.out.println("Spray function is on.");
            }
        }
        else
        {
            System.out.println("Iron is off. Please turn it on first.");
        }
    }
}
