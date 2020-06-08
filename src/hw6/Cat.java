package hw6;

public class Cat extends Animal {
    private final int MAX_RUN_LENGTH = 200;

    public Cat(String name, String color, int age) {
        super(name, color, age);
    }

    @Override
    void run(int length) {
        if ((length >= 0) && (length <= MAX_RUN_LENGTH)) System.out.println(name + " пробежал " + MAX_RUN_LENGTH + " метров");
        else System.out.println("run: false");
    }

    @Override
    void swim(int length) {
        System.out.println("Коты не умеют плавать");
    }

}