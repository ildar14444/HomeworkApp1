public class HomeWorkApp {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
            }

        void printThreeWords (String[]args){
            System.out.println(
                    "Orange + " +
                            "Banana + " +
                            "Apple")

        }


    void checkSumSign(String[] args) {
        int a = 5;
        int b = 2;
        int c = a + b;
        if (c >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }

    void printColor(String[] args) {
        int value = 2;
        if (value <= 0) {
            System.out.println("Красный");
        }
        if (value > 0 && value <= 100) {
            System.out.println("Желтый");
        }
        if (value > 100) {
            System.out.println("Зеленый");
        }
    }

    void compareNumbers(String[] args) {
        int a = 2;
        int b = 3;

        if (a >= b) {
            System.out.println("a >=b"); }
        else {
            System.out.println("a < b"); }
        }

}










