// Реализовать простой калькулятор

import java.util.Scanner;

public class Task3 {

        public static void main(String[] args) {

        Scanner iScanner = new Scanner(System.in);
        System.out.print("Введите первое число: x = ");
        int x = iScanner.nextInt();
        System.out.print("Введите простую арифметическую операцию: ");
        String operation = iScanner.next();
        System.out.print("Введите второе число: y = ");
        int y = iScanner.nextInt();

        int result;
        switch (operation) {
            case "+" -> {
                result = x + y;
                System.out.printf("%d %s %d = %d", x, operation, y, result);
            }
            case "-" -> {
                result = x - y;
                System.out.printf("%d %s %d = %d", x, operation, y, result);
            }
            case "*" -> {
                result = x * y;
                System.out.printf("%d %s %d = %d", x, operation, y, result);
            }
            case "/" -> {
                float divide = (float) x / (float) y;
                System.out.printf("%d %s %d = %.2f", x, operation, y, divide);
            }
        }
        iScanner.close();
    }
}
    

