package tester;
//aug firstweek release
//this changes is done by amit kumar singh
//aug branch 
//aug branched again changed by amit
import inheritance2.Faculty;
import inheritance2.Student;

public class Test1 {

	public static void main(String[] args) {
		// create student object : with it's COMPLETE state
		Student s1=new Student("Anuja","Pathak",2020,"PG-DAC",123456,80);
		System.out.println(s1);// s1.toString() --uses inherited version (from Object)
		//create faculty object
		Faculty f1=new Faculty("Raj","Seth",10,"DBT,Java,JS");
		System.out.println(f1);
		System.out.println("amit youchanges first changes");
		/*
		use authentication of facebook authentication 
		 */
		
	}

}
