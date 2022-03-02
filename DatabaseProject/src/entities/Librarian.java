package entities;

import java.util.List;

public class Librarian {

    public int librarianNum;
    public String name;
    public double salary;
	
	public Librarian(List<Object> list)
    {
        librarianNum = (int)list.get(0);
        name = list.get(1).toString();
        salary = (double)list.get(2);
    }

	@Override
	public String toString() {
		return "Librarian [librarianNum=" + librarianNum + ", name=" + name + ", salary=" + salary + "]";
	}

}