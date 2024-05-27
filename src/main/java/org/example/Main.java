package org.example;

public class Main {
    public static void main(String[] args) {

        System.out.println(calculate(Integer.parseInt(args[0]), Integer.parseInt(args[1]), args[2]));
    }

    public static int calculate(int a, int b, String operator) {
        return switch (operator) {
            case "+" -> a + b;
            case "-" -> a - b;
            case "*" -> a * b;
            case "/" -> {
                if (b == 0)
                    throw new IllegalArgumentException("Division by zero");
                yield a / b;
            }
            default -> throw new IllegalArgumentException("Unknown operator: " + operator);
        };
    }
}