package _1_procedural;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число");
        int n =scanner.nextInt();
        int i =1;
        int f =1;
        for (i=1; i<=n; i++){
            f =f*i;
        }
        System.out.println(f);
    }
}