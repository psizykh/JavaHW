package Lesson3;

import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;

public class HW3Sizykh {
    public static Scanner scanner = new Scanner(System.in);
    public static Random random = new Random();

    public static void main(String[] args) {

        int[] myArray = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        printMyArray(myArray);
        change(myArray);
        printMyArray(myArray);

        int[] myArray2 = new int[100];
        FillMyArray(myArray2);
        printMyArray(myArray2);

        int[] myArray3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        x2(myArray3);
        printMyArray(myArray3);

        int[][] myArray4 = new int[5][5];
        FillMyArraydv(myArray4);
        printMyArraydv(myArray4);

        int [] arrayBack = retArray (22,500);
        printMyArray(arrayBack);
    }

    //Задание 1
    public static void printMyArray(int[] inputArray) {
        System.out.println(" ");
        for (int i = 0; i < inputArray.length; i++) {
            System.out.print(inputArray[i] + " ");
        }

    }

    public static void change(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 1) {
                array[i] = 0;
            } else {
                array[i] = i;
            }
        }

    }

    //Задание 2
    public static void FillMyArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
        }
    }

    //Задание 3
    public static void x2(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 6) ;
            array[i] *= 2;

        }
    }

    //Задание 4

    public static void FillMyArraydv (int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i][i] = 1;
            arr[i][arr.length - 1 - i] = 1;
        }
    }


    public static void printMyArraydv (int[][] inputArray) {
        System.out.println(" ");
        for (int i = 0; i < inputArray.length; i++) {
            for (int j = 0; j < inputArray[i].length; j++) {
                System.out.print(inputArray[i][j] + " ");
            }
            System.out.println();
        }
    }


//Задание 5
    public static int[] retArray (int len, int initialValue) {
        int[] teArray = new int[len];
        for (int i = 0; i < teArray.length ; i++) {
            teArray[i]=initialValue;
        }
        return teArray;
    }

}


