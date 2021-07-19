package Lesson1;

public class HW1Sizykh {

        public static void main(String[] args) {
            printThreeWords();
            checkSumSign(5, -10);
            System.out.println(printColor(990));
            CompareNumbers(10, 0);
        }

        public static void printThreeWords() {
            System.out.println("_Orange");
            System.out.println("_Banana");
            System.out.println("_Apple");

        }

        public static void checkSumSign(int a, int b) {
            if ((a + b) >= 0) {
                System.out.println("Сумма положительная (или 0)");
            } else {
                System.out.println("Сумма отрицательная");
            }
        }

        public static String printColor(int value1) {
            if (value1 <= 0)
                return "Красный";
            else if (value1 > 0 && value1<= 100)
                return "Жёлтый";
            else
                return "Зелёный";
        }

        public static void CompareNumbers(int a, int b) {
            if (a >= b) {
                System.out.println("a >= b");
            } else {
                System.out.println("a < b");
            }
        }
    }


