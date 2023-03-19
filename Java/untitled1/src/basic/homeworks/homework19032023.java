package basic.homeworks;

import org.jetbrains.annotations.NotNull;

import  java.util.Scanner;

public class homework19032023 {
    public static void main(String[] args) {
        // Work 1
        int x = 54;
        int y = 16;
        System.out.println(x + y);

        // Work 2

        int a = 50;
        int b = 3;
        System.out.println( a / b);

        // Work 3

        System.out.println(-5 + 8 * 6);
        System.out.println((55 + 9) % 9);

        Scanner scanner = new Scanner(System.in);

        tryScanner(scanner);
        summ();
        discout();

    }

    //work 4
    static void tryScanner(Scanner scanner){
        int num1 = scanner.nextInt();
        System.out.println(num1 * num1);
    }

    static void summ(){
        int a = 0;
        int b = 1;
        int c = 2;
        int d = 3;
        int f = 4;
        int g = 5;
        int h = 6;
        int i = 7;
        int j = 8;
        int k = 9;

        double summator = (a+b+c+d+f+g+h+i+j+k)/10.0;
        System.out.println(summator);
    }

    static void discout(){
        int a = 1000;
        int b = 500;
        int summe = a + b;

        float discount = 100f/ (summe / 100);
        System.out.println(discount);

    }

}