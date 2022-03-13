package class24;

import jdk.nashorn.internal.runtime.regexp.joni.Syntax;

public class Task1Tester {
    public static void main(String[] args) {
        //in java we can store the object of a child classes
        // in a parent type variable
        // Every class in java can be treated as data type
        Student syntaxStudent = new SyntaxStudent();
        syntaxStudent.study();
        Student schoolStudent = new SchoolStudent();
        Student[] students = {new SyntaxStudent(), new SchoolStudent(),
                new CollegeStudent()};
        /*
        as we can store the object of a child class in a parent class
        we can also create an array of those students as show below
         */
        /*int [] arr={1,2,3};
        for(int number:arr){
            System.out.println(number);
        }*/
       // students[0].practice(); - to show all lines from each child class
        for (Student student : students) {
            //calling the methods from all the children classes
            student.study();
            student.doHomeWork();
            student.practice();
        }
    }
}
