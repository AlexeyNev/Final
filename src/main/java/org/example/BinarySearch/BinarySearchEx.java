package org.example.BinarySearch;

import java.util.*;

public class BinarySearchEx {
    public static void main(String[] args) {
//        ArrayList<Integer> arrayList = new ArrayList<>();
//        arrayList.add(-3);
//        arrayList.add(8);
//        arrayList.add(12);
//        arrayList.add(-8);
//        arrayList.add(0);
//        arrayList.add(5);
//        arrayList.add(10);
//        arrayList.add(1);
//        arrayList.add(150);
//        arrayList.add(-30);
//        arrayList.add(19);
//
//        Collections.sort(arrayList);
//        int index = Collections.binarySearch(arrayList, 12);
//        System.out.println(index);


        Employee employee1 = new Employee(100, "Alex", 12345);
        Employee employee2 = new Employee(15, "Petr", 6542);
        Employee employee3 = new Employee(123, "Ivan", 8542);
        Employee employee4 = new Employee(15, "Mariya", 5678);
        Employee employee5 = new Employee(182, "Kolya", 125);
        Employee employee6 = new Employee(15, "Sasha", 9874);
        Employee employee7 = new Employee(250, "Elena", 1579);
        ArrayList<Employee> arrayList  = new ArrayList<>();
        arrayList.add(employee1);
        arrayList.add(employee2);
        arrayList.add(employee3);
        arrayList.add(employee4);
        arrayList.add(employee5);
        arrayList.add(employee6);
        arrayList.add(employee7);

        System.out.println(arrayList);
        Collections.sort(arrayList);
        System.out.println(arrayList);
    }
}

class Employee implements Comparable<Employee>{
    int id;
    String name;
    int salary;

    public Employee(int id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }

    @Override
    public int compareTo(Employee o) {
        int result = this.id - o.id;
        if (result == 0) {
            result = this.name.compareTo(o.name);
        }
        return result;
    }
}
