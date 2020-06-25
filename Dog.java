package petGame;

public class Dog extends Pet {
   private String breed;
   public String getBreed(){
       return breed;
   }
   public void setBreed(String breed) {
       this.breed = breed;
   }
   @Override
   public void print() {
       super.print();
       System.out.println("I am a "+this.breed);
   } 
}