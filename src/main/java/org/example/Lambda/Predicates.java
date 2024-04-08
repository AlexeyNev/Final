package org.example.Lambda;

import java.util.ArrayList;
import java.util.function.Predicate;

public class Predicates {
    void testStudents(ArrayList<Student> a1, Predicate<Student> predicate) {
        for (Student s : a1) {
            if (predicate.test(s)) {
                System.out.println(s);
            }
        }
    }
}

    class Test {
        public static void main(String[] args) {
            Student student1 = new Student("Alex", 'm', 30, 1, 4.0);
            Student student2 = new Student("Alla", 'f', 27, 4, 4.2);
            Student student3 = new Student("Mars", 'm', 5, 1, 3.5);
            Student student4 = new Student("Petr", 'm', 35, 5, 3.8);
            Student student5 = new Student("Zlata", 'f', 15, 1, 4.4);

            ArrayList<Student> arrayList2 = new ArrayList<>();
            arrayList2.add(student1);
            arrayList2.add(student2);
            arrayList2.add(student3);
            arrayList2.add(student4);
            arrayList2.add(student5);

            StudentInfo info = new StudentInfo();
            info.testStudents(arrayList2, s -> s.age < 20);
        }
}
