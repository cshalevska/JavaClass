package com.syntax.review07;

public class ObjectsAndClassPractice {


        String empName=" Cece";
        int empID;
String group;
        void employeeDetails(){
        System.out.println("This method show the details of the employee");
    }

    void employeeGroup() {
        System.out.println("This method show the group of the employee");
    }
            public static void main(String[]args){
            ObjectsAndClassPractice obj= new ObjectsAndClassPractice();
            obj.employeeGroup();
            obj.employeeDetails();

    }
}
