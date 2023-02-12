// Вывести все простые числа от 1 до 1000

import java.util.Scanner;

public class Task2{

    public static void main(String[] args){

        // Cчетчик для подсчета количества простых чисел
        int count =0;

        // Ввести значение верхнего предела
        System.out.println("Пожалуйста, введите число больше 2 в качестве верхнего предела интервала: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i = 1;i < n; i++){
            if(isPrime1(i)){
                System.out.print(i+"\t");
                count++;
                if(count%10==0){
                        System.out.println();
                }
            }
        }
        System.out.println("\r"+"От 1 до " +n + " количество простых чисел равняется \t" + count);
    }
    // Метод, определяющий, является ли число простым
    public static boolean isPrime1(int i){
        // Простое ли число
        boolean t = false;

        // Возвращаем, когда простое число равно 2
        if(i==2){
                t = true;
            }
        // Если простое число не 2
        for(int j = 2;j < i;j++){   
            if(j==(i-1)){
                t = true;
                }
            if((i % j)==0){
                break;
                }
            }
        return t;
    }
}