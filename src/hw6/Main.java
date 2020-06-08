package hw6;

public class Main {
    //private package-private protected public
    public static void main(String[] args) {

        Cat cat = new Cat("Barsik", "Black", 2);
        cat.run(200);
        cat.swim(1);


        Dog dog = new Dog("Tuzik", "white", 5);
        dog.run(500);
        dog.swim(10);
    }
}