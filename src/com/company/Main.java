package com.company;

public class Main {

    public static void main(String[] args) {
        String childrenOfMyClass;
        final int NUM = 7;
        String word = "Hello children";

        if (NUM < 0){
            System.out.println("Вы сохранили отрицательное число");
        }

        if (NUM > 0){
            System.out.println("Вы сохранили положительное число");
        } else {
            System.out.println("Вы сохранили нуль!!!");
        }
        // дз на сообразиетльность
        String name = "Nuskaiym";
        System.out.println( "Hello" + " " + name);
    }
}
