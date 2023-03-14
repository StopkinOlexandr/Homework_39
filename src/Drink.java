import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Drink extends Food {
  boolean gas = false;
  boolean alcohol = false;

  public Drink(String name, int calorie) {
    super(name, calorie);
  }

  public Drink(String name, int calorie, boolean gas, boolean alcohol) {
    setName(name);
    setCalories(calorie);
    this.gas = gas;
    this.alcohol = alcohol;
  }

  public void open() throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    try {
      String sound;
      if (gas) {
        sound = "пшш";
      } else {
        sound = "скр";
      }
      if (alcohol) {
        System.out.println("Сколько вам лет? ");
        int age = Integer.parseInt(br.readLine());
        if (age <= 18) { // если НЕ больше 18
          return;
        }
      }
      System.out.println(sound);
    } catch (NumberFormatException e) {
      System.out.println("Incorrect input" + e.getMessage());
    }
  }
}
