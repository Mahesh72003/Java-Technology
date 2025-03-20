class Radio
{
    static boolean isOn;
    static int maxVolume = 10; 
    static int minVolume;  
    static int currentVolume; 
    static float minFrequency = 88.0f;  
    static float maxFrequency = 108.0f; 
    static float currentFrequency = 104.0f; 

    public static void onOrOff()
    {
        if(isOn)
        {
            isOn = false;
            System.out.println("The Radio is off");
        }
        else
        {
            isOn = true;
            System.out.println("The Radio is on");
        }
    }

    public static void increaseVolume()
    {
        if(isOn)
        {
            if(currentVolume < maxVolume)
            {
                currentVolume++;
                System.out.println("The current Volume is " + currentVolume);
            }
            else
            {
                System.out.println("The Volume is at maximum");
            }
        }
        else
        {
            System.out.println("Radio is off. Please turn it on first.");
        }
    }

    public static void decreaseVolume()
    {
        if(isOn)
        {
            if(currentVolume > minVolume)
            {
                currentVolume--;
                System.out.println("The current Volume is " + currentVolume);
            }
            else
            {
                System.out.println("The Volume is at minimum");
            }
        }
        else
        {
            System.out.println("Radio is off. Please turn it on first.");
        }
    }

    public static void tuneUp()
    {
        if(isOn)
        {
            if(currentFrequency < maxFrequency)
            {
                currentFrequency += 0.1f;
                System.out.println("Tuned to "+currentFrequency+" MHz");
            }
            else
            {
                System.out.println("You are already at the maximum frequency");
            }
        }
        else
        {
            System.out.println("Radio is off. Please turn it on first.");
        }
    }

    public static void tuneDown()
    {
        if(isOn)
        {
            if(currentFrequency > minFrequency)
            {
                currentFrequency = currentFrequency - 0.1f;
                System.out.println("Tuned to "+currentFrequency+" MHz");
            }
            else
            {
                System.out.println("You are already at the minimum frequency");
            }
        }
        else
        {
            System.out.println("Radio is off. Please turn it on first.");
        }
    }
}
