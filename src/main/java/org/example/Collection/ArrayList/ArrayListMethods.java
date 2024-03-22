package org.example.Collection.ArrayList;

import java.util.ArrayList;
import java.util.Objects;

public class ArrayListMethods {
    public static void main(String[] args) {
        Student student1 = new Student("Alex", 'm', 30, 2, 2.9);
        Student student2 = new Student("Alla", 'f', 26, 1, 3.9);
        Student student3 = new Student("Mars", 'm', 5, 3, 2.3);
        Student student4 = new Student("Zlata", 'f', 14, 3, 4.9);
        Student student5 = new Student("Zhuzzha", 'f', 2, 5, 4.2);
        Student student6 = new Student("Zhuzzha2", 'f', 2, 5, 4.2);

        ArrayList<Student> arrayList = new ArrayList<>();
        arrayList.add(student1);
        arrayList.add(student2);
        arrayList.add(student3);
        arrayList.add(student4);
        arrayList.add(student5);
        arrayList.add(student6);

        System.out.println(arrayList);
        arrayList.remove(student6);
        System.out.println(arrayList);
    }
}

class Student {
    private String name;
    private char sex;
    private int age;
    private int course;
    private double avgGrade;

    public Student(String name, char sex, int age, int course, double avgGrade) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.course = course;
        this.avgGrade = avgGrade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", sex=" + sex +
                ", age=" + age +
                ", course=" + course +
                ", avgGrade=" + avgGrade +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return sex == student.sex && age == student.age &
                course == student.course &&
                Double.compare(student.avgGrade, avgGrade) == 0
                && Objects.equals(name, student.name);
    }
}