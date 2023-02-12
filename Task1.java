// Вычислить n-ое треугольного число(сумма чисел от 1 до n), 
// n! (произведение чисел от 1 до n)                                          

import java.util.Scanner;

public class Task1 {
    
    public static void main(String[] args) {

        Scanner iScanner = new Scanner(System.in);
        System.out.print("Введите число для вычисления треугольного числа: ");
        int triangle_num = iScanner.nextInt();
        int result = 0;
        System.out.printf("Треугольное число = ", triangle_num);
        for (int i = 1; i <= triangle_num; i++) {
            if (i == triangle_num) System.out.printf("%d", i);
            else System.out.printf("%d + ", i);
            result += i;
        }
        System.out.printf(" = %d", result);

        System.out.print("\nВведите число для вычисления факториала: ");
        int n = iScanner.nextInt();
        System.out.printf("Факториал = ", n);
        result = 1;
        for (int i = 1; i <= n; i++) {
            if (i == triangle_num) System.out.printf("%d", i);
            else System.out.printf("%d * ", i);
            result *= i;
        }
        System.out.printf(" = %d", result);

    }
}