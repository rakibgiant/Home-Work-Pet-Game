package petGame;

import java.util.Scanner;

public class PetTest {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    Dog pet2 = new Dog();
    Peinguine pet1 = new Peinguine();
    System.out.println("Welcome to MY Hablu pet store.");
    // 1、 Enter pet name
    System.out.print("Please enter the name of the pet u wanna adopt：");
    String name = input.next();
    // 2、 select the type of pet
    System.out.print(
      "Please select the type of pet u wannna adopt :((1) dog (2) penguin):"
    );
    switch (input.nextInt()) {
      case 1:
        //If it's a dog, choose a dog breed
        System.out.print(
          "Please select a dog breed :((1) smart poodle " +
          " (2) cool bulldog):"
        );
        String breed = null;
        if (input.nextInt() == 1) {
          breed = "smart poodle";
        } else {
          breed = "Cool bulldog";
        }
        System.out.println("Please set the health condition valu of pet: ");
        int health = input.nextInt();
        //if (health < 0 && health > 100) {
          //System.out.println("Please Set the valu between 0 to 100 !!");
        //} else {
          pet2.setHealth(health);
        //}
        System.out.println("Please set the valu of love to pet : ");
        int love = input.nextInt();
        pet2.setLove(love);
        /*if (love < 0 && health > 100) {
          System.out.println("Please Set the valu between 0 to 100 !!");
        } else {
          pet2.setLove(love);
        }*/
        //  assign values
        pet2.setName(name);
        pet2.setBreed(breed);
        // Print dog's information
        pet2.print();
        break;
        case 2:
          // 2.select the sex of penguin
          System.out.print("Please choose the sex of the penguin:（1、Boy 2、Girl）:");
          String sex = null;
          if (input.nextInt() == 1) {
              sex = "Boy";
          } else {
              sex = "Girl";
          }
          pet1.setSex(sex);
          System.out.println("Please set the health condition valu of pet: ");
           health = input.nextInt();
           pet1.setHealth(health);
          /*if (health < 0 && health > 100) {
            System.out.println("Please Set the valu between 0 to 100 !!");
          } else {
            pet1.setHealth(health);
          }*/
          System.out.println("Please set the valu of love to pet : ");
           love = input.nextInt();
           pet1.setLove(love);
          /*if (love < 0 && health > 100) {
            System.out.println("Please Set the valu between 0 to 100 !!");
          } else {
            pet1.setLove(love);
          }*/
          pet1.setName(name);
          pet1.print();
    }
  }
}
