package hw2;

public class Main {
    public static void main(String[] args) {
        System.out.println("1. Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью цикла и условия заменить 0 на 1, 1 на 0;");
        System.out.println("2. Задать пустой целочисленный массив размером 8. С помощью цикла заполнить его значениями 0 3 6 9 12 15 18 21;");
        System.out.println("3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2;");
        System.out.println("4. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое), и с помощью цикла(-ов) заполнить его диагональные элементы единицами;");
        System.out.println("5. ** Задать одномерный массив и найти в нем минимальный и максимальный элементы (без помощи интернета);");
        System.out.println("6. ** Написать метод, в который передается не пустой одномерный целочисленный массив, метод должен вернуть true, если в массиве есть место, в котором сумма левой и правой части массива равны. Примеры: checkBalance([2, 2, 2, 1, 2, 2, || 10, 1]) → true, checkBalance([1, 1, 1, || 2, 1]) → true, граница показана символами ||, эти символы в массив не входят.");
        System.out.println("7. **** Написать метод, которому на вход подается одномерный массив и число n (может быть положительным, или отрицательным), при этом метод должен сместить все элементымассива на n позиций. Для усложнения задачи нельзя пользоваться вспомогательными массивами.");


        System.out.println("Задание №1.");
        int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] == 1 ? 0 : 1;
            System.out.printf(arr[i] + " ");
        }

        System.out.println("\n\nЗадание №2.");
        int[] arr2 = new int[8];
        for (int i = 1, j = 0; i < arr2.length; i++) arr2[i] = j += 3;
        {
            for (int a : arr2) {
                System.out.printf(a + " ");
            }
        }

        System.out.println("\n\nЗадание №3.");
        int[] arr3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr3.length; i++) {
            if (arr3[i] < 6) {
                arr3[i] *= 2;
            }
            System.out.printf(arr3[i] + " ");
        }

        System.out.println("\n\nЗадание №4.");
        int[][] arr4 = new int[5][5];
        for (int i = 0; i < arr4.length; i++) {
            for (int j = 0, j2 = arr4[i].length; j < arr4[i].length; j++, j2--) {
                if (i == j || i == (j2 - 1)) arr4[i][j] = 1;
                System.out.print(arr4[i][j] + " ");
            }
            System.out.printf("\r\n");
        }

        System.out.println("\r\nЗадача №5.");
        int[] arr5 = {5, 23, 3, 4, 11, 6, 7, 58, 9, 10};
        int max = arr5[0];
        int min = arr5[0];
        for (int i = 0; i < arr5.length; i++) {
            if (max < arr5[i]) {
                max = arr5[i];
            }
            if (arr5[i] < min) {
                min = arr5[i];
            }
        }
        System.out.println("Максимальное значение: " + max);
        System.out.println("Минимальное значение: " + min);

    }
}
