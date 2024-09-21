import java.util.*;
public class Main {

	public static void main(String[] args) {
		ArrayList<Student> students = new ArrayList<Student>(); 
		
		students.add(new Student(110, "James", "Seattle"));
		students.add(new Student(111, "Tyler", "San Francisco"));
		students.add(new Student(131, "Macie", "London"));
		students.add(new Student(112, "Perry", "Chicago"));
		students.add(new Student(212, "Hyde", "New york"));
		students.add(new Student(311, "Speed Racer", "Monaco"));
		students.add(new Student(666, "Scooby", "Yonkers"));
		students.add(new Student(420, "Shaggy", "Atlanta"));
		students.add(new Student(916, "Mozzy", "Sacramento"));
		students.add(new Student(123, "Takumi", "Shibukawa"));
		
		System.out.println("Unsorted");
		for (Student student : students) {
			System.out.println(student);
		}
		
		StudentSorter.sortByRollNo(students); 
		System.out.println("\nSorted by Roll No:");
        for (Student student : students) {
            System.out.println(student);
            }
        
        StudentSorter.sortByName(students); 
        System.out.println("\nSorted by Name:");
        for (Student student1 : students) {
        	System.out.println(student1);    
        	}   
	}	
}
