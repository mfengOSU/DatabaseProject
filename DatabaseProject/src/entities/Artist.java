package entities;


public class Artist {

	public String artistName;
	public int artistId;
	
	public Artist(String n, int id) 
	{
		artistName = n;
		artistId = id;
	}

	@Override
	public String toString() {
		return "Artist [artistName=" + artistName + ", artistId=" + artistId + "]";
	}
	
}
