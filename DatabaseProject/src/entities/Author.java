package entities;


public class Author {

	public String authorName;
	public int authorId;
	
	public Author(String n, int id)
	{
		authorName = n;
		authorId = id;
	}
	
	@Override
	public String toString() {
		return "Author [authorName=" + authorName + ", authorId=" + authorId + "]";
	}
}
