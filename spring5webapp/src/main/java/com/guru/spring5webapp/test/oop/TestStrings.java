package com.guru.spring5webapp.test.oop;

public class TestStrings {

    public static void main(String[] args) {

        String s1 = "Ahmed";
        String s2 = "Ahmed";
        s1.concat(" Hamdy");
        System.out.println(s1.equals(s2));
        System.out.println(s1);

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Ahmed");
        stringBuilder.append(123);
        System.out.println(stringBuilder);

        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("Ahmed");
        stringBuffer.append(123);
        System.out.println(stringBuffer);
    }
}
