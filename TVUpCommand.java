public class TVUpCommand implements Command
{
	private TV tv;

	public TVUpCommand(TV tv)
	{
		this.tv = tv;	
	}

	public void execute()
	{
		tv.setInputChannel(tv.channel + 1);
	}
}

