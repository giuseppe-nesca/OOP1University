package university;

public class Studente {
		private String name;
		private String surname;
		private int ID;
		private int[] coursesList;
		protected final int MAX_COURSES=25;
		private int numCourses=0;		
		
		public Studente(String name, String surname, int ID){
			this.name=name; this.surname=surname; this.ID=ID;
			coursesList=new int[MAX_COURSES];
		}
		public String getName(){return name;}
		public String getSurname(){return surname;}
		public String getID(){return Integer.toString(ID);}
		public void tryAddingCourses()throws ArrayIndexOutOfBoundsException{
			if(numCourses>=MAX_COURSES) 
				throw new ArrayIndexOutOfBoundsException();
		}
		public void subcription(int sCode)throws ArrayIndexOutOfBoundsException{ //sCode == codice di insegnamento
			numCourses++;
			coursesList[numCourses-1]=sCode;
		}
		public int[] getCourses(){
			int[] ids= new int[numCourses];
			for(int i=0; i< numCourses; i++){
				ids[i]=coursesList[i];
			}
			return ids;
		}
}
