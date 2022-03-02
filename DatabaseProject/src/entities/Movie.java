package entities;

import java.util.List;

public class Movie {

	public int itemNum;
	public String itemStatus;
	public String type;
	public String title;
	public int year;
	public String genre;
	public String location;
	public String rating;
	
	public String directorName;
	public double movieLength;
	public Actor actor;
	
    public Movie(List<Object> list)
    {
    	itemNum = (int) list.get(0);
        itemStatus = list.get(1).toString();
        type = list.get(2).toString();
        title = list.get(3).toString();
        year = (int) list.get(4);
        genre = list.get(5).toString();
        location = list.get(6).toString();
        rating = list.get(7).toString();
        
        directorName = list.get(8).toString();
        movieLength = (double) list.get(9);
        actor = new Actor(list.get(10).toString(), (int) list.get(11));
    }

}