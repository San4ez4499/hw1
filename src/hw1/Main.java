package hw1;

public class Main {

    public static void main(String[] args) {
        System.out.println("2. Создать переменные всех пройденных типов данных, и инициализировать их значения;");
        System.out.println("3. Написать метод вычисляющий выражение a * (b + (c / d)) и возвращающий результат,где a, b, c, d – входные параметры этого метода;");
        System.out.println("4. Написать метод, принимающий на вход два числа, и проверяющий что их сумма лежит в пределах от 10 до 20 (включительно), если да вернуть true, в противном случае - false;");
        System.out.println("5. Написать метод, которому в качестве параметра передается целое число, метод должен напечатать в консоль положительное ли число передали, или отрицательное; Замечание: ноль считаем положительным числом;");
        System.out.println("6. Написать метод, которому в качестве параметра передается целое число, метод должен вернуть true, если число отрицательное;");
        System.out.println("7. Написать метод, которому в качестве параметра передается строка, обозначающая имя, метод должен вывести в консоль сообщение «Привет, указанное_имя!»;");


        System.out.println("\nЗадание №2.");
        byte bt = 0;
        short s = 200;
        int i = 1000;
        long l = 123456L;
        float f = 12.34f;
        double d = 123.456;
        char c = '\u0488';
        boolean b = false;
        System.out.println("Значение для типа byte = " + bt);
        System.out.println("Значение для типа short = " + s);
        System.out.println("Значение для типа int = " + i);
        System.out.println("Значение для типа long = " + l);
        System.out.println("Значение для типа float = " + f);
        System.out.println("Значение для типа double = " + d);
        System.out.println("Значение для типа char = " + c);
        System.out.println("Значение для типа boolean = " + b);

        System.out.println("\nЗадание №3.");
        System.out.println(exampleThree(1, 2, 3, 4));

        System.out.println("\nЗадание №4.");
        if (exampleFour(10, 15)) {
            System.out.println("Сумма чисел в пределах от 10 до 20");
        } else {
            System.out.println("Сумма чисел за пределами чисел 10 и 20");
        }


        System.out.println("\nЗадание №5.");
        int a = 0;
        if (exampleFive(a)) {
            System.out.println("Число " + a + " положительное");
        } else {
            System.out.println("Число " + a + " отрицательное");
        }

        System.out.println("\nЗадание №6.");
        System.out.println(exampleSix(5));

        System.out.println("\nЗадание №7.");
        exampleSeven("Фанзиль");
    }

    public static double exampleThree(double a, double b, double c, double d) {
        return a * (b + (c / d));
    }

    public static boolean exampleFour(int a, int b) {
        int c = a + b;
        return (10 <= c) && (c <= 20);
    }

    public static boolean exampleFive(int a) {
        return a >= 0;
    }

    public static boolean exampleSix(int a) {
        if (a < 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void exampleSeven(String word) {
        System.out.println("Привет, " + word + "!");
    }
}
