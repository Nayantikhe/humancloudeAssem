package org.example;

public class Main {
    public static void main(String[] args) {
        StringCalculator calculator = new StringCalculator();

        System.out.println(calculator.add(""));
        System.out.println(calculator.add("1"));
        System.out.println(calculator.add("1,5"));
        System.out.println(calculator.add("1\n2,3"));
        System.out.println(calculator.add("//;\n1;2;3"));

        try {
            System.out.println(calculator.add("1,-2,3,-4"));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}