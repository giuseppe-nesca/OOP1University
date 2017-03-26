package university;

public class Studente {
		private String name;
		private String surname;
		private int ID;
		private int[] coursesList;
		private final int MAX_COURSES=25;
		private int numCourses=-1;		
		
		public Studente(String name, String surname, int ID){
			this.name=name; this.surname=surname; this.ID=ID;
		}
		public String getName(){return name;}
		public String getSurname(){return surname;}
		public String getID(){return Integer.toString(ID);}
}
