package entities;
	
public class Actor {
	
	public String actorName;
	public int actorId;
	
	public Actor(String n, int id)
	{
		actorName = n;
		actorId = id;
	}

	@Override
	public String toString() {
		return "Actor [actorName=" + actorName + ", actorId=" + actorId + "]";
	}
	
}
