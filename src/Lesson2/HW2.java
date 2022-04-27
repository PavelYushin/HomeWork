package Lesson2;

public class HW2 {
    public static void main(String[] args) {
        System.out.println(doTask1(2, 8));
        doTask2(10);
        System.out.println(doTask3(-5));
        doTask4("Ivan", 5);

        System.out.println(doTask5(1983)); // Task 5*
    }

    public static boolean doTask1(int a, int b) {
        int sum = a + b;
        if (sum >= 10 && sum <=20) {
            return true;
        }
        return false;
    }

    public static void doTask2(int x) {
        if (x >= 0) {
            System.out.println("positive");
        }
        else {
            System.out.println("negative");
        }
    }

    public static boolean doTask3(int x) {
        if (x >= 0) {
            return true;
        }
        else {
            return false;
        }
    }

    public static void doTask4(String str, int n) {
        for (int i = 1; i <= n; i++) {
            System.out.println("[" + i + "]" + " " + str);
        }
    }

    public static boolean doTask5(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            return true;
        }
        else {
            return false;
        }

    }
}
