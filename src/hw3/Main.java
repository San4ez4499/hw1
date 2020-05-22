package hw3;

import java.util.Random;
import java.util.Scanner;

public class Main {
    private static Random random = new Random();

    public static void main(String[] args) {
        guessNumber();
    }
    public static void guessNumber() {

        Scanner scanner = new Scanner(System.in);
        do {
            int randomNumber = random.nextInt(10);
            System.out.println("Добро пожаловать в игру \"Угадай число\"");
            System.out.println("Угадай число с 3 попыток от 0 до 9");
            for (int i = 3; i > 0; i--) {
                System.out.println("Введите число:");
                int quesNumber = scanner.nextInt();
                if (quesNumber == randomNumber) {
                    System.out.println("Вы угадали!");
                    break;
                }
                System.out.println(quesNumber > randomNumber ? "Не угадали! Число меньше ;)" : "Не угадали! Число больше =)");
                System.out.println((i-1) > 0 ? " у вас осталось " + (i-1) + " попыток." : "У вас не осталось попыток!");
            }
            System.out.println("Чтобы сыграть еще раз, введите 1.");
        }
        while (scanner.nextInt() == 1);
    }
}
