package com.company;

import java.util.Scanner;

public class NumberWriter {
    public static final String[] BELOW_TWENTY = { "ноль", "один", "два", "три", "четыре", "пять", "шесть", "семь", "восемь", "девять", "десять", "одинадцать", "двенадцадь", "тринадцать", "четырнадцать", "пятнадцать", "шестнадцать", "семнадцать", "восемнадцать", "девятнадцать" };
    public static final String[] TENS = { "сто", "десять", "двадцать", "тридцать", "сорок", "пятьдесят", "шестьдесят", "семьдесят", "восемьдесят", "девяносто" };

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while ( true ) {
            System.out.print("Число от 0 до 100: ");
            if ( ! scanner.hasNextInt() )
                break;
            int number = scanner.nextInt();
            if ( number < 0 || number > 100 ) {
                System.out.println("Попробуй ещё раз...");
                continue;
            }

            if ( number < 20 )
                System.out.println(BELOW_TWENTY[number]);
            else if ( number < 100 ) {
                int high = number / 10;
                int low = number % 10;
                String text = TENS[high];
                if ( low != 0 )
                    text = text + " " + BELOW_TWENTY[low];
                System.out.println(text);
            }
            else
                System.out.println(TENS[0]);
        }

        scanner.close();
    }
}
