class Projector
{
    static boolean isOn;
    static int maxVolume = 10;
    static int minVolume;
    static int currentVolume;
    static int maxBrightness = 10;
    static int minBrightness;
    static int currentBrightness;
    static boolean hdmiConnected;

    public static void onOrOff()
    {
        if(isOn)
        {
            isOn = false;
            System.out.println("The Projector is off");
        }
        else
        {
            isOn = true;
            System.out.println("The Projector is on");
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
            System.out.println("Projector is off. Please turn it on first.");
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
            System.out.println("Projector is off. Please turn it on first.");
        }
    }

    public static void increaseBrightness()
    {
        if(isOn)
        {
            if(currentBrightness < maxBrightness)
            {
                currentBrightness++;
                System.out.println("The current Brightness is " + currentBrightness);
            }
            else
            {
                System.out.println("The Brightness is at maximum");
            }
        }
        else
        {
            System.out.println("Projector is off. Please turn it on first.");
        }
    }

    public static void decreaseBrightness()
    {
        if(isOn)
        {
            if(currentBrightness > minBrightness)
            {
                currentBrightness--;
                System.out.println("The current Brightness is " + currentBrightness);
            }
            else
            {
                System.out.println("The Brightness is at minimum");
            }
        }
        else
        {
            System.out.println("Projector is off. Please turn it on first.");
        }
    }

    public static void HDMIConnection()
    {
        if(isOn)
        {
            if (hdmiConnected)
			{
				System.out.println("HDMI connection is disconnected");
				hdmiConnected=false;
			}
            else
            {   
				System.out.println("HDMI connection is connected");
				hdmiConnected=true;
			}
				
        }
        else
        {
            System.out.println("Projector is off. Please turn it on first.");
        }
    }
}
