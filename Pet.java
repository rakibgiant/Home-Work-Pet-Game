package petGame;

public class Pet {
   String name;
   int health;
   int love;
   public void print() {
    System.out.println(
      "Hi my name is " +
      this.name +
      " my healgth is " +
      this.health +
      " intemence owner is " +
      this.love
    );
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getHealth() {
    return health;
  }

  public void setHealth(int health) {
    this.health = health;
  }

  public int getLove() {
    return love;
  }

  public void setLove(int love) {
    this.love = love;
  }

 
}
