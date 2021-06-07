public class HomeWorkApp {

    public static void main (String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
    }

    public static void printThreeWords () {
        //можно было сделать проще, но в рамках обучения решил добавить переменные, чтоб можно было потом менять значение
        String fruit1 = "Orange"; //объявляю переменную 1
        String fruit2 = "Banana"; //объяваляю переменную 2
        String fruit3 = "Apple"; // объявляю переменную 3

        System.out.println(fruit1); //вызываю метод println для того чтоб значение следующаей переменной выводилась с новой строки
        System.out.println(fruit2);
        System.out.println(fruit3);
    }

    public static void checkSumSign() {
        int a = -1; //объявляю переменные
        int b = 1;

        //описываю ветвление с помощью оператора if else
        if (a + b >= 0) {
            System.out.println("Сумма положительная");
        }else {
            System.out.println("Сумма отрицательная");
        }
    }

    public static void printColor() {
        int value = 0;

        if (value <= 0){
            System.out.println("Красный");
        }else if(value >100) {
            System.out.println("Зеленый");
        }else if(value <=100) {
            System.out.println("Желтый");
        }
    }

    public static void compareNumbers() {
        int a = 10;
        int b = 30;

        if(a >= b){
            System.out.println(" a>= b")
        }else{
            System.out.println("a < b")
        }
    }

}
