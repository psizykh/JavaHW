package Lesson2;


    public class HW2Sizykh {

        public static void main(String[] args) {
            method1(10, 2); // Задание 1 через void
            System.out.println(method1a(10,5)); // Задание 1 через return
            method2(0);
            System.out.println(method3(-5));
            method4(8, "Pavel");

        }

        public static void method1(int a, int b) {
            if (a + b >= 10 && a + b <= 20) {
                System.out.println("true");
            } else {
                System.out.println("false");
            }
        }
        public static boolean method1a(int a, int b) {
            return (a + b >= 10 && a + b <= 20);
        }
        public static void method2(int a) {
            if (a >= 0) {
                System.out.println("Positive");
            } else {
                System.out.println("Negative");
            }
        }

        public static boolean method3(int a) {
            return  (a <= 0);

        }
        public static void method4(int a, String stringMethod4) {

            for (int i = 0; i < a; i ++) {
                System.out.println(stringMethod4 + "" + i);

            }

        }
}



