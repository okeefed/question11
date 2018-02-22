public class TV 
{
	String location;
	int channel;

	public TV(String location) 
	{
		this.location = location;
	}

	public void on() 
	{
		System.out.println("TV is on");
	}

	public void off() 
	{
		System.out.println("TV is off");
	}

	public void setInputChannel(int channel) 
	{
		if(channel == 3)
		{
			System.out.println("Channel is set for VCR");
		}
		else
		{
			System.out.println("Channel is set to " + channel);
		}
		this.channel = channel;
	}
}
