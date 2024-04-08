package org.example.Stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Test2 {
    public static void main(String[] args) {
        Student student1 = new Student("Alex", 'm', 30, 1, 8.3);
        Student student2 = new Student("Alla", 'f', 27, 5, 6.4);
        Student student3 = new Student("Mars", 'm', 6, 0, 8.9);
        Student student4 = new Student("Petr", 'm', 24, 2, 7.0);
        Student student5 = new Student("Zlata", 'f', 15, 3, 7.4);

        List<Student> list = new ArrayList<>();
        list.add(student1);
        list.add(student2);
        list.add(student3);
        list.add(student4);
        list.add(student5);
        System.out.println(list);

        List<Student> list1 = list.stream().filter(s ->
                s.getAge() > 25 && s.getAvGrade() < 9.0).collect(Collectors.toList());
        System.out.println(list1);
    }

}

class Student {
    private String name;
    private char sex;
    private int age;
    private int course;
    private double avGrade;

    public Student(String name, char sex, int age, int course, double avGrade) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.course = course;
        this.avGrade = avGrade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public double getAvGrade() {
        return avGrade;
    }

    public void setAvGrade(double avGrade) {
        this.avGrade = avGrade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", sex=" + sex +
                ", age=" + age +
                ", course=" + course +
                ", avGrade=" + avGrade +
                '}';
    }
}