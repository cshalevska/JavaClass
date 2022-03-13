package com.syntax.review08;

public class Class2 {

    String generalUserName( String firstName,String lastName){
        return firstName+"123"+lastName+".com";
    }
static void moreedDemand(){
    System.out.println("This is moreed's function");
}
    public static void main(String[] args) {
        moreedDemand();
        Class2 obj=new Class2();
        System.out.println(obj.generalUserName("Emilia","Gulnar"));
    }
}
