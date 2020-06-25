package petGame;

public class Peinguine extends Pet {
  private String sex;
  public String getSex(){
      return sex;
  } 
  public void setSex(String sex) {
      this.sex = sex;
  } 
  @Override
  public void print() {
      // TODO Auto-generated method stub
      super.print();
      System.out.println("I am a "+this.sex);
  }
}