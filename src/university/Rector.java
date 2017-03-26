package university;

public class Rector {
	private String name;
	private String surname;
	
	Rector(String name , String surname){ setName(name); setSurname(surname); }
	
	public String getName(){return this.name;}
	public String getSurname(){return this.surname;}
	public void setName(String name){ this.name=name; return;	}
	public void setSurname(String surname){ this.surname=surname; return;}
}
