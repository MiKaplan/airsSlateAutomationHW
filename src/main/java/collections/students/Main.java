package collections.students;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Misha", "Group 1", 1, new int[]{3, 3, 2, 3}));
        students.add(new Student("Anna", "Group 2", 2, new int[]{3, 2, 3, 4}));
        students.add(new Student("Leha", "Group 1", 1, new int[]{5, 4, 4, 5}));
        students.add(new Student("Oleg", "Group 2", 2, new int[]{3, 3, 3, 3}));
        students.add(new Student("Olga", "Group 2", 1, new int[]{5, 5, 5, 5}));

        System.out.println("List of students:");
        printStudents(students, 1);
        printStudents(students, 2);

        removeStudentsWithLowAverage(students);

        System.out.println("\nList of students after removal of students with a grade point average < 3:");
        printStudents(students, 1);
        printStudents(students, 2);
    }

    public static void removeStudentsWithLowAverage(List<Student> students) {
        Iterator<Student> iterator = students.iterator();
        while (iterator.hasNext()) {
            Student student = iterator.next();
            double average = calculateAverage(student.getMarks());
            if (average < 3) {
                iterator.remove();
            } else {
                student.incrementCourse();
            }
        }
    }

    public static void printStudents(List<Student> students, int course) {
        System.out.println("Students on " + course + " course:");
        for (Student student : students) {
            if (student.getCourse() == course) {
                System.out.println(student.getName());
            }
        }
    }

    public static double calculateAverage(int[] marks) {
        int sum = 0;
        for (int mark : marks) {
            sum += mark;
        }
        return (double) sum / marks.length;
    }

}

