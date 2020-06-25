package petGame;

public class PetTest {
    public static void main(String[] args) {
        Peinguine pet1 = new Peinguine();
        pet1.setName("Bikki");
        pet1.setHealth(90);
        pet1.setLove(87);
        pet1.setSex("Boy");
        pet1.print();
        Dog pet2 = new Dog();
        pet2.setName("Jack");
        pet2.setHealth(95);
        pet2.setLove(80);
        pet2.setBreed("Cool Booldog");
        pet2.print();
    }
}