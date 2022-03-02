package entities;

public class Narrator {

	public String narratorName;
	public int narratorId;
	
	public Narrator(String n, int id)
	{
		narratorName = n;
		narratorId = id;
	}

	@Override
	public String toString() {
		return "Narrator [narratorName=" + narratorName + ", narratorId=" + narratorId + "]";
	}
	
}
