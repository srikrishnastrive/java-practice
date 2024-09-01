import java.util.*;

class Student implements Comparable<Student> {
    String name;
    int rollNumber;

    Student(String name, int rollNumber) {
        this.name = name;
        this.rollNumber = rollNumber;
    }

    @Override
    public int compareTo(Student other) {
        // Natural ordering based on rollNumber
        return Integer.compare(this.rollNumber, other.rollNumber);
    }

    @Override
    public String toString() {
        return "Student{" + "name='" + name + '\'' + ", rollNumber=" + rollNumber + '}';
    }
}

public class ComparableExample {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Alice", 3));
        students.add(new Student("Bob", 1));
        students.add(new Student("Charlie", 2));

        Collections.sort(students); // Sorts using the compareTo method

        students.forEach(System.out::println);
    }
}
