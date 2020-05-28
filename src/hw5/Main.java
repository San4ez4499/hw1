package hw5;

public class Main {
    public static void main(String[] args) {
        Job[] jobArray = new Job[5];
        jobArray[0] = new Job ("Alexander", "Degtyarev", "Sergeevich", "SEO-specialist", "info@wow-armory.ru", 27,9772646300L, 10000);
        jobArray[1] = new Job ("Alexander", "Degtyarev", "Sergeevich", "SEO-specialist", "info@wow-armory.ru", 33,9772646300L, 20000);
        jobArray[2] = new Job ("Alexander", "Degtyarev", "Sergeevich", "SEO-specialist", "info@wow-armory.ru", 55,9772646300L, 30000);
        jobArray[3] = new Job ("Alexander", "Degtyarev", "Sergeevich", "SEO-specialist", "info@wow-armory.ru", 44,9772646300L, 40000);
        jobArray[4] = new Job ("Alexander", "Degtyarev", "Sergeevich", "SEO-specialist", "info@wow-armory.ru", 18,9772646300L, 50000);
        for (int i = 0; i < jobArray.length; i++) {
            if (jobArray[i].getAge() > 40){
                jobArray[i].printInfo();
            }
        }
    }
}
