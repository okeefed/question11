public class TVDownCommand implements Command
{
	private TV tv;

	public TVDownCommand(TV tv)
	{
		this.tv = tv;	
	}

	public void execute()
	{
		tv.setInputChannel(tv.channel - 1);
	}
}

