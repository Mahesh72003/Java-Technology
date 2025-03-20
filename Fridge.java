class Fridge
{
    static boolean isOn;
    static int maxTemperature = 10; 
    static int minTemperature = -10;
    static int currentTemperature; 

    public static void onOrOff()
    {
        if(isOn)
        {
            isOn = false;
            System.out.println("The Fridge is off");
        }
        else
        {
            isOn = true;
            System.out.println("The Fridge is on");
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
                System.out.println("The Temperature is at maximum");
            }
        }
        else
        {
            System.out.println("Fridge is off. Please turn it on first.");
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
                System.out.println("The Temperature is at minimum");
            }
        }
        else
        {
            System.out.println("Fridge is off. Please turn it on first.");
        }
    }
}
