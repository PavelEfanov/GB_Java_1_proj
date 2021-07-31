public class FirstLesson {

    public static void main(String[] args) {  //Задание 1
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
    }
    public static void printThreeWords() {  //Задание 2
        String fruits = "Orange"
                + System.lineSeparator() + "Banana"
                + System.lineSeparator() + "Apple";
        System.out.println(fruits);
    }

    public static void checkSumSign() {  //Задание 3
        int a = 12;
        int b = 34;
        if ((a + b) >= 0) {
            System.out.println("Сумма положительная");
        } else System.out.println("Сумма отрицательная");
    }

    public static void printColor() {  //Задание 4
        int value = 100;
        if (value <= 0) {
            System.out.println("Красный");
        } else if (value > 0 && value <= 100) {
            System.out.println("Желтый");
        } else System.out.println("Зеленый");
    }

    public static void compareNumbers() {  //Задание 5
        int a = 57;
        int b = -34;
        if (a >= b) {
            System.out.println("a >= b");
        } else System.out.println("a < b");
    }
}
