package basic.homeworks;
import org.jetbrains.annotations.NotNull;

import java.util.HashMap;
import java.util.Scanner;



public class homework11042023 {
    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        //String string = new String(System.in.toString());
        String string = "VII";
        romanToDecimal(string);
    }


    private static int romanToDecimal(String romanNumeral) {
        HashMap<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 100);


        int end = romanNumeral.length()- 1;
        char[] arr = romanNumeral.toCharArray();
        int decimal;
        int result = map.get(arr[end]);
        System.out.println(result);
        for (int i = end - 1; i >= 0; i--) { //цикл идет справа на лево
            decimal = map.get(arr[i]);

            if (decimal >= map.get(arr[i + 1])) { //сравниваем больше или меньше число числа которое слева, если меньше то вычитаем
                result = result + decimal;
            } else {
                result -= decimal;
            }

        }
        return result;
    }
}





