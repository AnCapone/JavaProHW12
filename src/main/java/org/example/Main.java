package org.example;

public class Main {
    public static void main(String[] args) {
        if (args.length != 0) {

            switch (args[2]) {
                case "+" -> System.out.println(Integer.parseInt(args[0]) + Integer.parseInt(args[1]));
                case "*" -> System.out.println(Integer.parseInt(args[0]) * Integer.parseInt(args[1]));
                case "-" -> System.out.println(Integer.parseInt(args[0]) - Integer.parseInt(args[1]));
                case "/" -> {
                    if (Integer.parseInt(args[1]) == 0) {
                        System.out.println("Division by 0!");
                    } else {
                        System.out.println(Integer.parseInt(args[0]) / Integer.parseInt(args[1]));
                    }
                }
                default -> {
                    System.out.println("Unknown operator");
                }
            };
        }

    }
}