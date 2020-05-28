package hw4;

import java.util.Random;
import java.util.Scanner;

public class XOGame {
    static final int SIZE = 3;
    //    static final int DOTS_TO_WIN = 3;
    static final char DOT_X = 'X';
    static final char DOT_O = 'O';
    static final char DOT_EMPTY = '.';
    public static final int SIZE_X = 6;
    public static final int SIZE_Y = 5;
    public static final int TO_WIN = 3;
    public static char[][] map;
    public static char[][] field = new char[SIZE_Y][SIZE_X];

    static Scanner sc = new Scanner(System.in);
    static Random random = new Random();

    public static void main(String[] args) {
        initMap();
        printMap();

        while (true) {
            humanTurn();
            printMap();

            if (isFull()) {
                System.out.println("Ничья!");
                break;
            }

            if (checkWin(DOT_X)) {
                System.out.println("Ты победил! Поздравляю!");
                break;
            }

            if (checkWin(DOT_O)) {
                System.out.println("Компьютер победил!");
                break;
            }

            aiTurn();
            printMap();

            if (isFull()) {
                System.out.println("Ничья!");
                break;
            }
        }
    }

    public static void initMap() {
        map = new char[SIZE][SIZE];
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                map[i][j] = DOT_EMPTY;
            }

        }

    }

    public static void printMap() {
        System.out.print("  ");
        for (int i = 0; i < SIZE; i++) {
            System.out.print(i + 1 + " ");
        }
        System.out.println();
        for (int i = 0; i < SIZE; i++) {
            System.out.print(i + 1 + " ");
            for (int j = 0; j < SIZE; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void humanTurn() {
        int x, y;

        do {
            System.out.println("Введите координаты вашего хода X Y");
            x = sc.nextInt() - 1;
            y = sc.nextInt() - 1;
        } while (!isCellValid(y, x));
        map[y][x] = DOT_X;

    }

    public static boolean isCellValid(int y, int x) {
        if (x < 0 || y < 0 || x >= SIZE || y >= SIZE) {
            return false;
        }
        return map[y][x] == DOT_EMPTY;

    }

    public static void aiTurn() {
        int x, y;

        do {
            x = random.nextInt(SIZE);
            y = random.nextInt(SIZE);
        } while (!isCellValid(y, x));
        map[y][x] = DOT_O;
    }

    public static boolean isFull() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (map[i][j] == DOT_EMPTY) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean checkWin(char c) {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (checkLine(i, j, 0, 1, c)) {
                    return true;
                }
                if (checkLine(i, j, 1, 1, c)) {
                    return true;
                }
                if (checkLine(i, j, 1, 0, c)) {
                    return true;
                }
                if (checkLine(i, j, -1, 1, c)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void initFields() {
        for (int i = 0; i < SIZE_Y; i++) {
            for (int j = 0; j < SIZE_X; j++) {
                field[i][j] = DOT_EMPTY;
            }
        }
    }

    public static void printField() {
        System.out.println("-------");
        for (int i = 0; i < SIZE_Y; i++) {
            System.out.print("|");
            for (int j = 0; j < SIZE_X; j++) {
                System.out.print(field[i][j] + "|");
            }
            System.out.println();
        }
        System.out.println("-------");
    }

    public static boolean checkLine(int y, int x, int vy, int vx, char sym) {
        int wayX = x + (TO_WIN - 1) * vx;
        int wayY = y + (TO_WIN - 1) * vy;
        if (wayX < 0 || wayY < 0 || wayX > SIZE_X - 1 || wayY > SIZE_Y - 1) return false;
        for (int i = 0; i < TO_WIN; i++) {
            int itemY = y + i * vy;
            int itemX = x + i * vx;
            if (field[itemY][itemX] != sym) return false;
        }
        return true;
    }
//    public static boolean checkWin(char c) {
//        if (map[0][0] == c && map[0][1] == c && map[0][2] == c){
//            return true;
//        }
//        if (map[1][0] == c && map[1][1] == c && map[1][2] == c){
//            return true;
//        }
//        if (map[2][0] == c && map[2][1] == c && map[2][2] == c){
//            return true;
//        }
//        if (map[0][0] == c && map[1][0] == c && map[2][0] == c){
//            return true;
//        }
//        if (map[0][1] == c && map[1][1] == c && map[2][1] == c){
//            return true;
//        }
//        if (map[0][2] == c && map[1][2] == c && map[2][2] == c){
//            return true;
//        }
//        if (map[0][0] == c && map[1][1] == c && map[2][2] == c){
//            return true;
//        }
//        if (map[0][2] == c && map[1][1] == c && map[2][0] == c){
//            return true;
//        }
//        return false;
//    }

}
