package hw5;

public class Job {
    String name;
    String surname;
    String middleName;
    String position;
    String email;
    int age;
    long phoneNumber;
    int pay;

    public Job(String name, String surname, String middleName, String position, String email, int age, long phoneNumber, int pay) {
        this.name = name;
        this.surname = surname;
        this.middleName = middleName;
        this.position = position;
        this.email = email;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.pay = pay;
    }

    public void info() {
        System.out.println(name + " " + surname + " " + middleName + " " + position + " " + email + " " + age + " " + phoneNumber + " " + pay + " руб.");
    }

    public int getAge () {
        return age;
    }

    public void printInfo() {
        System.out.println(name + " " + surname + " " + middleName + " " + position + " " + email + " " + age + " " + phoneNumber + " " + pay + " руб.");
    }
}
