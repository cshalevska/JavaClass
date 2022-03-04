package com.syntax.review07;

import java.util.Locale;

public class Practice05 {
    String weekDay(String day){
        day=day.toLowerCase();
        switch(day){
            case"monday":
                return "It is lazy day";
            case "tuesday":
                return " It is productive day";
            case " wednesday":
                return " It is gloomy day";
            case" thursday":
                return " It is exciting day";
            case " friday":
                return " No work day";
            default:
                return " No correct option found";

        }
    }

    public static void main(String[] args) {
        Practice05 p= new Practice05();
        p.weekDay("tuesday");
        String output= p.weekDay("tuesday");
        System.out.println(output);
    }
}

