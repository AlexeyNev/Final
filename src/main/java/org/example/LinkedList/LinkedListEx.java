package org.example.LinkedList;

import java.util.LinkedList;

public class LinkedListEx {
    public static void main(String[] args) {
        Student student1 = new Student("Alex", 2);
        Student student2 = new Student("Alla", 4);
        Student student3 = new Student("Mars", 1);
        Student student4 = new Student("Petr", 3);
        Student student5 = new Student("Ilya", 1);
        Student student6 = new Student("Fedor", 2);

        LinkedList<Student> list = new LinkedList<>();
        list.add(student1);
        list.add(student2);
        list.add(student3);
        list.add(student4);
        list.add(student5);

        System.out.println(list);

        list.add(1, student6);
        System.out.println(list);

        System.out.println(list.get(2));

        list.remove(2);
        System.out.println(list);
    }
}

class Student {
    String name;
    int course;

    public Student(String name, int course) {
        this.name = name;
        this.course = course;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", course=" + course +
                '}';
    }
}