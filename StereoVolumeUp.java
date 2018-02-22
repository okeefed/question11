public class StereoVolumeUp implements Command
{
	private Stereo stereo;

	public StereoVolumeUp(Stereo stereo)
	{
		this.stereo = stereo;
	}

	public void execute()
	{
		stereo.stereoVolumeUp();
	}
}

