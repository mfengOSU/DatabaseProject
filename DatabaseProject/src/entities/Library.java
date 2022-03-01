package entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Library {
	private String state;
	private String city;
	private List<Order> orders;
	private List<Movie> movies;
	private List<Album> albums;
	private List<Audiobook> audiobooks;
	
	public Library(String city, String state) {
		this.state = state;
		this.city = city;
		this.orders = new ArrayList<>();
		this.movies = new ArrayList<>();
		this.albums = new ArrayList<>();
		this.audiobooks = new ArrayList<>();
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}
	
	public void makeOrder(Date date, double price, int copies) {
		
	}
	
	public void transferOrder(long orderId) {
		
	}
	
	public void addMovie(Movie movie) {
		this.movies.add(movie);
	}
	
	public void addAlbum(Album album) {
		this.albums.add(album);
	}
	
	public void addAudiobook(Audiobook audiobook) {
		this.audiobooks.add(audiobook);
	}
	
	public List<Order> getAllOrders() {
		return this.orders;
	}
	
	public List<Movie> getAllMovies() {
		return this.movies;
	}
	
	public List<Album> getAllAlbums() {
		return this.albums;
	}
	
	public List<Audiobook> getAllAudiobooks() {
		return this.audiobooks;
	}
	
	

}
