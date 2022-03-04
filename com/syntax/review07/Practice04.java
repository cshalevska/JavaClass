package com.syntax.review07;

public class Practice04 {
    void verifyBatch12IsGoodEnough(boolean isGood){
        if(isGood) {
            System.out.println("Yessss!!!");
        }else {
            System.out.println("No!!!");
        }
    }

    public static void main(String[] args) {
        Practice04 p3= new Practice04();
        p3.verifyBatch12IsGoodEnough(false);
    }
}
