/*Написать программу, вычисляющую сумму цифр введённого пользователем целого числа.
 */

package _1_procedural;

import java.util.Scanner;

public class ex_1 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число");
        int n =scanner.nextInt(); //введённое число
        int s = 0;
        while(n != 0)
        {
            s =s + (n % 10);
            n = n / 10;
        }
        System.out.println("Сумма цифр в числе: " + s);

    }
}
