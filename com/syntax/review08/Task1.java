package com.syntax.review08;

public class Task1 {
    public void printSmallerDigit(int x,int y){

        if(x<y) {
            System.out.println(x+" X is smaller one");
        }else if (y<x) {
            System.out.println(y+" Y is smaller one");
        }else{
            System.out.println("Both the vlaue are same");
        }
    }

    public static void main(String[] args) {
        Task1 obj=new Task1();
        obj.printSmallerDigit(3,5);
        obj.printSmallerDigit(5,8);
    }
    }

