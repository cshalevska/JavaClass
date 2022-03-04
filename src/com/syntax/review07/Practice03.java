package com.syntax.review07;

public class Practice03 {

    String studentName;
    String course;
    int studentID;
    int grades;

    void displayStudentRecord(){

        System.out.println("The student name is: "+studentName+" and the course student enrolled for is "+course);
        System.out.println("The student ID is: "+studentID+" and the grades students achieved are  "+grades);
    }

    public static void main(String[] args){
        Practice03 p1= new Practice03();
        p1.studentName= " Rogo";
        p1.course= " SDAT";
        p1.studentID=123;
        p1.grades=65;
        p1.displayStudentRecord();
        System.out.println("-----------------------------------------");

        Practice03 p2= new Practice03();
        p2.studentName=" Nasir";
        p2.course="science";
        p2.studentID=456;
        p2.grades=91;
        p2.displayStudentRecord();
    }
}
