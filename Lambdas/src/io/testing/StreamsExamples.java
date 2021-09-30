package io.testing;

import java.util.ArrayList;
import java.util.List;


public class StreamsExamples {

	public static void main(String[] args) {
		List <Student> studentList = createStudentList();
		
		studentList.stream()
				.filter(s->s.getName().startsWith("M"))
				.forEach(s-> System.out.println(s.getName()));
				
		
	}

	private static List createStudentList() {
		
		List studentList=new ArrayList();
        Student s1=new Student(1, "Arpit", "M", 19);
        Student s2=new Student(2, "John", "M", 17);
        Student s3=new Student(3, "Mary", "F", 14);
        Student s4=new Student(4, "Martin", "M", 21);
        Student s5=new Student(5, "Monica", "F", 16);
        Student s6=new Student(6, "Ally", "F", 20);
 
        studentList.add(s1);
        studentList.add(s2);
        studentList.add(s3);
        studentList.add(s4);
        studentList.add(s5);
        studentList.add(s6);
        
        return studentList;
	}

}
