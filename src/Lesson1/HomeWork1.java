package Lesson1;

public class HomeWork1 {
    public static void main (String[] args){

        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();


    }
    public static void printThreeWords(){
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");

    }
    public static void checkSumSign(){
        int a = 25;
        int b = 30;
        int sum = a + b;

        if (sum >= 0) {
            System.out.println("The sum is positive");
        }  else{
            System.out.println("The sum is negative");
        }

    }
    public static void printColor(){
        int value = 100;

        if(value <= 0){
            System.out.println("Red");
        } else if (value > 0 & value <= 100) {
            System.out.println("Yellow");
        } else{
            System.out.println("Green");
        }

    }

    public static void compareNumbers() {
        int a = 100;
        int b = 20;

        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }


}
