import java.io.*;
import java.lang.*;
import java.util.*;

public class Student {
	
	int rollno;
	String name, address;
	
	public Student(int rollno, String name, String address) { 
		this.rollno = rollno; 
		this.name = name; 
		this.address = address; 	
	}
	
	public int getRollno() {
        return rollno;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }
	
	@Override
	public String toString() { 
		return this.rollno + " " + this.name + " " + this.address; 
	}
	
	/*class sortByRoll implements Comparator<Student> { 
		public int compare(Student a, Student b) { 
			return a.rollno - b.rollno; 
		}
	} */
	
	/*class sortByName implements Comparator<Student> { 
		public int compare(Student a, Student b) { 
			return a.name.compareTo(b.name); 
		}
	}*/
	

}
