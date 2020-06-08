package hw6;


abstract class Animal {
    String name;
    String color;
    int age;
    private final int MAX_RUN_LENGTH = 0;
    private final int MAX_SWIM_LENGTH = 0;

    public Animal(String name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;
    }

    public void info() {
        System.out.println(name + " " + color + " " + age);
    }

    abstract void run(int length);

    abstract void swim(int length);

}