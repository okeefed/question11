/*
Change the Stereo class so that the volume can actually be controlled.
Add two methods to the Stereo class, incrementVolume() and decrementVolume(), that change 
the volume by one. In the methods, place a println that outputs that method was called and 
the current stereo volume. Let the range values for volume be 0 to 11.
*/

public class Stereo {
	String location;

	public Stereo(String location) {
		this.location = location;
	}

	public void on() {
		System.out.println(location + " stereo is on");
	}

	public void off() {
		System.out.println(location + " stereo is off");
	}

	public void setCD() {
		System.out.println(location + " stereo is set for CD input");
	}

	public void setDVD() {
		System.out.println(location + " stereo is set for DVD input");
	}

	public void setRadio() {
		System.out.println(location + " stereo is set for Radio");
	}

	public void setVolume(int volume) {
		// code to set the volume
		// valid range: 1-11 (after all 11 is better than 10, right?)
		System.out.println(location + " Stereo volume set to " + volume);
	}
}
