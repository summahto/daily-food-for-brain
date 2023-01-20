package io.testing;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class StreamsExamples {

	public static void main(String[] args) {
		List <Student> studentList = createStudentList();
		
		studentList.stream()
				.filter(s->s.getName().startsWith("M"))
				.forEach(s-> System.out.println(s.getName()));

        System.out.println("unsorted students by name");
        System.out.println(studentList);

        Comparator namingComparator = new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                return s1.getAge() - s2.getAge();
            }
        };

        studentList.sort(Comparator.comparing(Student::getName, Comparator.nullsFirst(Comparator.naturalOrder())));
        studentList.sort(Comparator.c);
        System.out.println("but sort does ");
        System.out.println(studentList);

        
        Optional<Student> match = studentList.stream().filter(s -> s.getName().equals("Arpit")).findFirst();

        //crio quiz
        String userDate = "2100-01-01";

        LocalDate userInputDate = LocalDate.parse(userDate);

        System.out.println(userInputDate.isLeapYear());

        int a =9;
        float b = a/2;
        System.out.println(b);

        LocalDate from = LocalDate.of(2020, 9, 9);
        LocalDate to = LocalDate.of(2020, 10, 10);

//        Duration duration = Duration.between(from, to);
        System.out.println(ChronoUnit.DAYS.between(from,to));
        // days between from and to
//        System.out.println(duration.toDays() + " days");
        LocalDate endDate = LocalDate.parse("2021-12-19");

        LocalDate currentDate = LocalDate.parse("2021-12-12");


        double year = currentDate.until(endDate, ChronoUnit.DAYS)/365.24;

        System.out.println(year);

        numberOfDays(currentDate, endDate);

        List<String> l = new ArrayList(Arrays.asList("one", "two"));

        Stream<String> sl = l.stream();

        l.add("three");

        String s = sl.collect(Collectors.joining(" "));

        System.out.println(s);


    }
    //10-12-2021 - 04-06-2025
    private static long numberOfDays(LocalDate currentDate, LocalDate endDate) {
        long totalDays = 0;
        totalDays += (endDate.getYear() - currentDate.getYear()) * 365;
        totalDays += (endDate.getMonth().getValue() - currentDate.getMonth().getValue()) * 30;
        totalDays += endDate.getDayOfMonth() - currentDate.getDayOfMonth();
        System.out.println(totalDays);
        return totalDays;
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
