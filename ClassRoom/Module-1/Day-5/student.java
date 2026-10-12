
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class student implements Comparable<student> {

    String name;
    int rno;
    int age;
    int marks;

    public student(String name, int rno, int age, int marks) {
        this.name = name;
        this.rno = rno;
        this.age = age;
        this.marks = marks;
    }

    // Default sorting: by age in ascending order
    @Override
    public int compareTo(student o) {
        return Integer.compare(this.age, o.age);
    }

    @Override
    public String toString() {
        return "Student {Name: " + name
                + ", Rno: " + rno
                + ", Age: " + age
                + ", Marks: " + marks + "}";
    }
}

class StudentMain {
    public static void main(String[] args) {

        ArrayList<student> students = new ArrayList<>();

        students.add(new student("nikhil", 126, 21, 99));
        students.add(new student("anshul", 123, 22, 90));
        students.add(new student("nitin", 122, 23, 99));
        students.add(new student("sarthak", 121, 20, 94));

        System.out.println("Before sorting:");
        for (student s : students) {
            System.out.println(s);
        }

        // 1. Comparable: uses compareTo(), sorts by age
        Collections.sort(students);

        System.out.println("\nAfter Comparable sorting by age:");
        for (student s : students) {
            System.out.println(s);
        }

        // 2. Comparator with lambda: sorts by age
        students.sort(Comparator.comparingInt(s -> s.age));

        // 3. Custom Comparator: sorts by roll number
        Collections.sort(students, new MyComparator());

        System.out.println("\nAfter Comparator sorting by roll number:");
        for (student s : students) {
            System.out.println(s);
        }
    }
}
