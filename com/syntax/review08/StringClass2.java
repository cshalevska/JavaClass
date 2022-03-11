package com.syntax.review08;

import java.util.Locale;

public class StringClass2 {
    public static void main(String[] args) {
        String student= "Teyfur";
        System.out.println(student.startsWith("T"));
        System.out.println(student.toLowerCase().startsWith("T"));
        System.out.println(student.endsWith("r"));

        String name="habib";
        char output = name.charAt(2);
        System.out.println(output);
    }
}
