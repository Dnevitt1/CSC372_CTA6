import java.util.ArrayList;

public class StudentSorter {
	
	public static void sortByRollNo(ArrayList<Student> students) { 
		for (int i = 0; i < students.size() - 1; i++) {
			int min = i;
		for (int j = i + 1; j < students.size(); j++) { 
			if(students.get(j).rollno < students.get(min).rollno) {
				min = j;
				}
			}
		if(min != i) {
		Student temp = students.get(i);
		students.set(i, students.get(min));
		students.set(min, temp);
			}
		}
	}
	
	public static void sortByName(ArrayList<Student> students) { 
		for (int i = 0; i < students.size() - 1; i++) {
			int min = i;
		for (int j = i + 1; j < students.size(); j++) { 
			if(students.get(j).getName().compareToIgnoreCase(students.get(min).getName()) < 0) {
				min = j;
				}
			}
		if(min != i) {
		Student temp = students.get(i);
		students.set(i, students.get(min));
		students.set(min, temp);
			}
		}
	}
	
}
