package entities;

import java.util.List;

public class Album {

	public int itemNum;
	public String itemStatus;
	public String type;
	public String title;
	public int year;
	public String genre;
	public String location;
	public String rating;
	
	public Artist artist;
	public Track track;
	
    public Album(List<Object> list)
    {
        init(list);
        
    }

	public void init(List<Object> list) {
		itemNum = (int) list.get(0);
        itemStatus = list.get(1).toString();
        type = list.get(2).toString();
        title = list.get(3).toString();
        year = (int) list.get(4);
        genre = list.get(5).toString();
        location = list.get(6).toString();
        rating = list.get(7).toString();
        
        artist = new Artist(list.get(8).toString(), (int)list.get(9));
        track = new Track(list.get(10).toString(), (double)list.get(11));
	}

	@Override
	public String toString() {
		return "Album [itemNum=" + itemNum + ", itemStatus=" + itemStatus + ", type=" + type + ", title=" + title
				+ ", year=" + year + ", genre=" + genre + ", location=" + location + ", rating=" + rating + ", artist="
				+ artist + ", track=" + track + "]";
	}
    

}
