package entities;

public class Track {

	public String trackName;
	public double tracklength;
	
	public Track(String n, double l)
	{
		trackName = n;
		tracklength = l;
	}

	@Override
	public String toString() {
		return "Track [trackName=" + trackName + ", tracklength=" + tracklength + "]";
	}

}
