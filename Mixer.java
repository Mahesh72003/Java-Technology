class Mixer
{
    static boolean isOn;
    static int maxSpeed = 3;
    static int minSpeed;
    static int currentSpeed; 

    public static void onOrOff()
    {
        if(isOn)
        {
            isOn = false;
            currentSpeed = 0;
            System.out.println("The Mixer is off");
        }
        else
        {
            isOn = true;
            System.out.println("The Mixer is on");
        }
    }

    public static void increaseSpeed()
    {
        if(isOn)
        {
            if(currentSpeed < maxSpeed)
            {
                currentSpeed++;
                System.out.println("The current Speed is " + currentSpeed);
            }
            else
            {
                System.out.println("The Mixer is at maximum speed");
            }
        }
        else
        {
            System.out.println("Mixer is off. Please turn it on first.");
        }
    }

    public static void decreaseSpeed()
    {
        if(isOn)
        {
            if(currentSpeed > minSpeed)
            {
                currentSpeed--;
                System.out.println("The current Speed is " + currentSpeed);
            }
            else
            {
                System.out.println("The Mixer is at minimum speed");
            }
        }
        else
        {
            System.out.println("Mixer is off. Please turn it on first.");
        }
    }
}
