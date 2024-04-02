package org.example.MapInterface;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class HashCodeEx2 {
    public static void main(String[] args) {
        Student2 student1 = new Student2("Alex", "Nevred", 2);
        Student2 student2 = new Student2("Alla", "Nev", 3);
        Student2 student3 = new Student2("Mars", "N", 1);
        Student2 student4 = new Student2("Mars", "N", 1);

        Map<Student2, Double> map = new HashMap<>();
        map.put(student1, 7.5);
        map.put(student2, 8.7);
        map.put(student3, 9.2);
        System.out.println(map);


    }
}

class Student2 implements Comparable <Student2>{
    String name;
    String surname;
    int course;

    public Student2(String name, String surname, int course) {
        this.name = name;
        this.surname = surname;
        this.course = course;
    }

    @Override
    public String toString() {
        return "Student2{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", course=" + course +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student2 student2 = (Student2) o;
        return course == student2.course && Objects.equals(name, student2.name) && Objects.equals(surname, student2.surname);
    }


    @Override
    public int compareTo(Student2 o) {
        return this.name.compareTo(o.name);
    }

//    @Override
//    public int hashCode() {
//        return Objects.hash(name, surname, course);
//    }
}