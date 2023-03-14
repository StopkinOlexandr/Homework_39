//  Задача 1
//Создать класс Food (еда). В классе должны быть:
//
//поле "название"
//поле "калорийность"
//конструктор, геттеры, сеттеры
//метод "употребить еду" с каким-нибудь выводом
//Создать класс Drink (напиток) - наследника класса Food. В классе должны быть дополнительно:
//
//поле "газированный" (да/нет)
//поле "алкогольный" (да/нет)
//метод "открыть", который:
//для газированного напитка печатает "пшш",
//для негазированного - "скр",
//а для алкогольного сначала спрашивает возраст и издаёт звук, только если возраст больше 18.
public class Food {
  private String name;
  private int calories;

  public void setName(String name) {
    this.name = name;
  }

  public String getName() {
    return this.name;
  }

  public void setCalories(int calories) {
    this.calories = calories;
  }

  public int getCalories() {
    return this.calories;
  }

  public Food(String name, int calories) {
    this.name = name;
    this.calories = calories;
  }

  public void eatFood(String name) {
    System.out.println("You have eat " + this.name + " and get " + this.calories + " calories");
  }
}
