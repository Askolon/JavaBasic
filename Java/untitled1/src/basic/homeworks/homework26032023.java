package basic.homeworks;

import java.util.Scanner;

public class homework26032023 {

    public static void main(String[] args) {
        double a = 152;
        double b = 1.25;
        Words();

        Summe();
        Sub();
        Multi();
        Div();
        Convert(a,b);

    }

    static void Words(){
        Scanner first = new Scanner(System.in);
        System.out.println("please first word");
        Scanner second = new Scanner(System.in);
        System.out.println("please second word");

        String word1 = first.nextLine();
        String word2 = second.nextLine();

        int numword1 = word1.length();
        int numword2 = word2.length();


        if(numword1%2 == 0 && numword2%2 ==0){
            System.out.println("New Word!");
            String newWord1 = word1.substring(0,(numword1/2));
            String newWord2 = word2.substring((numword2/2), numword2);
            String sumword = (String)(newWord1 + newWord2);
            System.out.println(sumword);


        }else{
            Words();
        }
    }

    static void Summe(){
        int a = 12;
        int b = 2;
        System.out.println(a + b);
    }

    static void Sub(){
        int a = 12;
        int b = 2;
        System.out.println(a - b);
    }
    static void Multi(){
        int a = 12;
        int b = 2;
        System.out.println(a * b);
    }


    static void Div(){
        int a = 12;
        int b = 2;
        System.out.println(a / b);
    }

    static double Convert(double a, double b){
        System.out.println(a*b);
        return (a * b);

    }


}




