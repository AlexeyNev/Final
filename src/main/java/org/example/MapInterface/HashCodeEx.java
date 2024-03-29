package org.example.MapInterface;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class HashCodeEx {
    public static void main(String[] args) {
        Map<Student, Double> map = new HashMap<>();
        Student student1 = new Student("Alex", "Nev", 1);
        Student student2 = new Student("Alla", "Gor", 4);
        Student student3 = new Student("Mars", "Mar", 2);
        map.put(student1, 7.5);
        map.put(student2, 8.7);
        map.put(student3, 9.2);

        Student student4 = new Student("Zheka", "Katkov", 2);
        Student student5 = new Student("Igor", "Barakov", 4);

        System.out.println(student1.hashCode());
        System.out.println(student3.hashCode());

        for (Map.Entry<Student, Double> entry: map.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        Map<Integer, String> map2 = new HashMap<>(16, 0.75f);
        //loadFactor - это значение 16*0.75f=12, то есть когда кол-во элементов HashMap будет 12,
        //hashmap автоматически увеличиться в 2 раза
    }
}

class Student {
    String name;
    String surname;
    int course;

    public Student(String name, String surname, int course) {
        this.name = name;
        this.surname = surname;
        this.course = course;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return course == student.course && Objects.equals(name, student.name) && Objects.equals(surname, student.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, course);
    }
}