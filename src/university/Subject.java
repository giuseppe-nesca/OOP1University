package university;

public class Subject {
	private String title;
	private String teacher;
	private int ID;
	private int[] studentsList;
	private final int MAX_STUDENTS=100; //massimo studenti iscrivibili al corso
	private int numStudents=0; //studenti effettivamente iscritti al corso
	
	public Subject(String title, String teacher, int ID){
		this.title=title; this.teacher=teacher; this.ID=ID;
		studentsList = new int[MAX_STUDENTS];
	}
	public String getTitle(){return title;}
	public String getTeacher(){return teacher;}
	public String getID(){ return Integer.toString(ID);}
	public void subscription(int studentID)throws ArrayIndexOutOfBoundsException{
		numStudents++;
		studentsList[numStudents-1]=studentID;
	}
	public int[] getStudents(){
		/*StringBuilder s= new StringBuilder();
		for(int i=0; i< numStudents; i++){
			if(i!=0) s.append('\n');
			s.append(studentsList[i]);
		}
		return s.toString();*/
		int[] ids= new int[numStudents];
		for(int i=0; i< numStudents; i++){
			ids[i]=studentsList[i];
		}
		return ids;
	}
}
