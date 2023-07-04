package com.guru.spring5webapp.test.oop;

public class StaticInJava {

    static int x = 10;
    static int y = 50;
    StaticInJava(){
        x++;
    }

    void display(){
        System.out.println(x);
    }

    static int increment(){
       return y++;
    }

    static {
        System.out.println("Static Block class");
    }

    public static void main(String[] args) {

        StaticInJava a = new StaticInJava();
        StaticInJava b = new StaticInJava();
        StaticInJava c = new StaticInJava();
        a.display();
        b.display();
        c.display();
    }
}
