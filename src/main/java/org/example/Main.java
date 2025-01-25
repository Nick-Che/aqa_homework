package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");

        printThreeWords();                      // 1.
        checkSumSign();                         // 2.
        printColor();                           // 3.
        compareNumbers();                       // 4.
        betweenTenAndTwenty(12,5);        // 5.
        isPositiveToText(-9);                // 6.
        isPositive(5);                       // 7.
        printLineTimes("Строка", 6);     // 8.
        isLeapYear(4);                          // 9.
        createArray(10, 7);       // 14.

        int [] arrayBinary = {1,0,1,1,0,0,0,1,0};   // 10.
        for (int i =0; i < arrayBinary.length; i++){
            if (arrayBinary[i] == 1){
                arrayBinary[i] = 0;
            }
            else  arrayBinary[i] = 1;
        }

        int [] arrayHundred = new int[100];       // 11.
        for (int i =0; i < arrayHundred.length; i++) {
            arrayHundred[i] = i + 1;
        }

        int [] array = {1,5,3,2,11,4,5,2,4,8,9,1}; // 12.
        for (int i =0; i < array.length; i++){
            if (array[i]<6){
                array[i] = array[i] * 2;
            }
        }

        int n = 10;                             // 13.
        int[][] matrix = new int [n][n];
        for (int i = 0; i < n; i++){
           matrix[i][i] = 1;
           matrix[n-i-1][i] = 1;
        }

    }

    public static void printThreeWords(){
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    public static void checkSumSign(){
        int a = 5;
        int b = -7;
        if (a + b >= 0) {
            System.out.println("Сумма положительная");
        }
        else {
            System.out.println("Сумма отрицательная");
        }
    }

    public static void printColor(){
        int value = -2;

        if (value <= 0)
        {
            System.out.println("Красный");
        }
        else if (value > 0 && value <= 100){
            System.out.println("Желтый");
        }
        else {
            System.out.println("Зеленый");
        }
    }

    public static void  compareNumbers(){
        int a = 5;
        int b = -7;
        if (a >= b) {
            System.out.println("a >= b");
        }
        else {
            System.out.println("a < b");
        }
    }

    public static boolean betweenTenAndTwenty(int a, int b){
        return a + b >= 10 && a + b <= 20;
    }

    public static void isPositiveToText(int a){
       if (a >= 0) {
            System.out.println("Число положительное");
        }
        else {
            System.out.println("Число отрицательное");
        }
    }

    public static boolean isPositive(int a){
        return a >= 0;
    }

    public static void printLineTimes(String str, int a){
        for (int i = 0; i < a; i++){
            System.out.println(str);
        }
    }

    public static boolean isLeapYear(int year){
        if (year % 4 == 0){
            if (year % 100 == 0){
                return year %  400 == 0;
            }
            else return true;
        }
        else return false;
    }

    public static int[] createArray(int len, int initialValue){
        int []arr = new int[len];
        for (int i = 0; i < len; i++){
            arr[i] = initialValue;
        }

        return arr;
    }
}