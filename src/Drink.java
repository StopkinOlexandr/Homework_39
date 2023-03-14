public class Drink extends Food{
  boolean gas;
  boolean alcohol;

  public Drink (String name, int calorie) {
   super(name, calorie);
  }

  public Drink (String name, int calorie, boolean gas, boolean alcohol) {
    setName(name);
    setCalories(calorie);
    this.gas = gas;
    this.alcohol = alcohol;
  }


}
