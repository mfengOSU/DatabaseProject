package entities;

import java.util.List;

public class Audiobook {

	public int itemNum;
	public String itemStatus;
	public String type;
	public String title;
	public int year;
	public String genre;
	public String location;
	public String rating;
	
	public int chapters;
	public int pages;
	public Author author;
	public Narrator narrator;
	
    public Audiobook(List<Object> list)
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
        
        chapters = (int) list.get(8);
        pages = (int) list.get(9);
        author = new Author(list.get(10).toString(), (int) list.get(11));
        narrator = new Narrator(list.get(12).toString(), (int) list.get(13));
	}

	@Override
	public String toString() {
		return "Audiobook [itemNum=" + itemNum + ", itemStatus=" + itemStatus + ", type=" + type + ", title=" + title
				+ ", year=" + year + ", genre=" + genre + ", location=" + location + ", rating=" + rating
				+ ", chapters=" + chapters + ", pages=" + pages + ", author=" + author + ", narrator=" + narrator + "]";
	}
    

}
