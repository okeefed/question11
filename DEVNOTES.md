The source code for the Remote Control project in the textbook is available in a zip file in this 
section of our ASULearn course. If any file you need for the exercises belowhas a package statement, 
remove it. Make the following changes to the code.

        ◦ Write two command classes: StereoVolumeUp and StereoVolumeDown that use the incrementVolume 
		  and decrementVolume methods to change the volume. A call to either command when the stereo 
		  is off has no effect (but print that the stereo is off). Neither command should allow the 
		  volume to go outside the range 0 to 11.
        ◦ Create four commands: TVOffCommand, TVOnCommand, TVUpCommand, and TVDownCommand. TVUpCommand, 
		  and TVDownCommand change the channel.
        ◦ Modify the RemoteLoader class adding a 5thwith a pair of commands where the “on” button 
		  increments the volume and the “off” button decrements the volume. Add a 6th pair of commands 
		  that turn the TV on and off and a 7th apair of commands that change the channel up and down. 
		  Add some remoteControl commands to main that test all these new commands.

