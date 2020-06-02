package hw6;

public class Dog extends Animal {
    private final int MAX_RUN_LENGTH = 500;
    private final int MAX_SWIM_LENGTH = 10;

    public Dog(String name, String color, int age) {
        super(name, color, age);
    }

    @Override
    void run(int length) {
        if ((length >= 0) && (length <= MAX_RUN_LENGTH)) {
            System.out.println(name + " пробежал " + MAX_RUN_LENGTH + " метров");
        }
    }

    @Override
    void swim(int length) {
        if ((length >= 0) && (length <= MAX_SWIM_LENGTH)) {
            System.out.println(name + " проплыл " + MAX_SWIM_LENGTH + " метров");
        }
    }

}