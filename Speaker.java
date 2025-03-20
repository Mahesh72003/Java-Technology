class Speaker
{
	static boolean isOn;
	static int maxVolume=5;
	static int minVolume;
	static int currentVolume;
	
	public static void onOrOff()
	{
		if(isOn)
			{
				isOn=false;
				System.out.println("The Speaker is off");
			}
		else
		{
			isOn=true;
			System.out.println("The Speaker is on");
		}
	}
	
	public static void increaseVolume()
	{
		if(isOn)
		{
			if(currentVolume<=maxVolume)
			{
				currentVolume++;
				System.out.println("The current Volume is "+currentVolume);			
			}
			else
			{
				System.out.println("The Volume is at maximum");
			}
		}
		else
		{
			System.out.println("Speaker is off. Please turn it on first.");
		}
	
	}
	public static void decreaseVolume()
	{
		if(isOn)
		{
			if(currentVolume>minVolume)
			{
				currentVolume--;
				System.out.println("The current Volume is "+currentVolume);			
			}
			else
			{
				System.out.println("The Volume is at minimum");
			}
		}
		else
		{
			System.out.println("Speaker is off. Please turn it on first.");
		}
	}
	
}