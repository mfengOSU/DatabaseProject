package entities;

public class MovieActors {
	private Movie movie;
	private Actor actor;

	public Movie getMovie() {
		return movie;
	}

	public void setMovie(Movie movie) {
		this.movie = movie;
	}

	public Actor getActor() {
		return actor;
	}

	public void setActor(Actor actor) {
		this.actor = actor;
	}

	public MovieActors(Movie movie, Actor actor) {
		this.movie = movie;
		this.actor = actor;
	}

}
