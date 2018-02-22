public class StereoVolumeDown implements Command
{
	private Stereo stereo;

	public StereoVolumeDown(Stereo stereo)
	{
		this.stereo = stereo;
	}

	public void execute()
	{
		stereo.stereoVolumeDown();
	}
}

