package org.example.Lambda;

import java.util.ArrayList;

public class StudentInfo {
    void testStudents(ArrayList<Student> arr, StudentCheck sc) {
        for (Student s : arr) {
            if (sc.cheak(s)) {
                System.out.println(s);
            }
        }
    }


    public static void main(String[] args) {
        Student student1 = new Student("Alex", 'm', 30, 1, 4.0);
        Student student2 = new Student("Alla", 'f', 27, 4, 4.2);
        Student student3 = new Student("Mars", 'm', 5, 1, 3.5);
        Student student4 = new Student("Petr", 'm', 35, 5, 3.8);
        Student student5 = new Student("Zlata", 'f', 15, 1, 4.4);

        ArrayList<Student> arrayList = new ArrayList<>();
        arrayList.add(student1);
        arrayList.add(student2);
        arrayList.add(student3);
        arrayList.add(student4);
        arrayList.add(student5);



        StudentInfo info = new StudentInfo();

        info.testStudents(arrayList, new StudentCheck() {
            @Override
            public boolean cheak(Student s) {
                return s.age < 30;
            }
        });

        info.testStudents(arrayList, (Student s) -> {return s.course < 4;});
        info.testStudents(arrayList, s -> s.course < 4);





        info.testStudents(arrayList, (Student s) -> {
            return s.avgGrade > 8;
        });
        info.testStudents(arrayList, (Student s) -> {
            return s.age > 20 && s.avgGrade < 9 && s.sex == 'f';
        });


//        info.testStudents(arrayList, new CheckOverGrade());
//        info.testStudents(arrayList, new CheckOverAge());
//        info.testStudents(arrayList, new CheckMixCondition());
    }

//    void printStudentsGrade(ArrayList<Student> array, double grade) {
//        for (Student s : array) {
//            if (s.avgGrade > grade) {
//                System.out.println(s);
//            }
//        }
//    }
//
//    void printStudentsAge(ArrayList<Student> array, int age) {
//        for (Student s : array) {
//            if (s.age > age) {
//                System.out.println(s);
//            }
//        }
//    }
//
//    void printStudentsMixCondition(ArrayList<Student> array, int age, double grade, char sex) {
//        for (Student s : array) {
//            if (s.age > age && s.avgGrade > grade && s.sex == sex) {
//                System.out.println(s);
//            }
//        }
//    }
}

interface StudentCheck {
    boolean cheak(Student s);
}
//