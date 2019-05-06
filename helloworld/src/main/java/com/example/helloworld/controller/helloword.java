package com.example.helloworld.controller;

public class helloword {
    public static void main(String[] args){
        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(1000);
                String aa = "A";
                String bb = "B";
                System.out.println("aa:" + aa + "bb: " + bb); //alten + enter
                System.out.printf("aa:%sbb: %s%n", aa, bb);

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
