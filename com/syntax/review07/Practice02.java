package com.syntax.review07;

public class Practice02 {

    String getRecord() {
        String department = "QA";
        String empName = " Cece";
        String details = " Worker " + empName + " Belongs to " + department;
        System.out.println(details);
        return details;
    }
    public static void main(String[]args){
        Practice02 p= new Practice02();
        p.getRecord();
    }
}
