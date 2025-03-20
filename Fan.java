class Fan
{
    static boolean isOn;
    static int maxSpeed = 5; 
    static int minSpeed;
    static int currentSpeed;

    public static void onOrOff()
    {
        if(isOn)
        {
            isOn = false;
            currentSpeed = 0;
            System.out.println("The Fan is off");
        }
        else
        {
            isOn = true;
            System.out.println("The Fan is on");
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
                System.out.println("The Fan is at maximum speed");
            }
        }
        else
        {
            System.out.println("Fan is off. Please turn it on first.");
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
                System.out.println("The Fan is at minimum speed");
            }
        }
        else
        {
            System.out.println("Fan is off. Please turn it on first.");
        }
    }
}
