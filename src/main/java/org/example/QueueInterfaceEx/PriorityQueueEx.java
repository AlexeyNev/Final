package org.example.QueueInterfaceEx;

import java.util.Objects;
import java.util.PriorityQueue;
import java.util.TreeSet;

public class PriorityQueueEx {
    public static void main(String[] args) {
        Student student1 = new Student("Mark",  2);
        Student student2 = new Student("Alice",  3);
        Student student3 = new Student("Marsic", 1);
        Student student4 = new Student("Popik",  4);
        Student student5 = new Student("Petr", 6);

        PriorityQueue<Student> priorityQueue = new PriorityQueue<>();

        priorityQueue.add(student1);
        priorityQueue.add(student2);
        priorityQueue.add(student3);
        priorityQueue.add(student4);
        priorityQueue.add(student5);
        priorityQueue.add(null);
        System.out.println(priorityQueue);

        System.out.println(priorityQueue.poll());
        System.out.println(priorityQueue.poll());
        System.out.println(priorityQueue.poll());
        System.out.println(priorityQueue.poll());
        System.out.println(priorityQueue.poll());

    }
}

class Student implements Comparable<Student> {
    String name;
    int course;



    public Student(String name, int course) {
        this.name = name;
        this.course = course;
    }

    @Override
    public int compareTo(Student other) {
        return this.course - other.course;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return course == student.course && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, course);
    }


    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", course=" + course +
                '}';
    }
}