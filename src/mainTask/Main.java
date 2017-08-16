package mainTask;

/**
 * Created by GVG on 15.08.2017.
 */
public class Main {
    public static void main(String[] args) {
        Box<Apple> boxAp1 = new Box("Apple box 1");
        Box<Apple> boxAp2 = new Box("Apple box 2");
        Box<Orange> boxOr1 = new Box("Orange box 1");
        Box<Orange> boxOr2 = new Box("Orange box 2");

        for (int i = 0; i < 12; i++) {
            boxAp1.addFruit(new Apple());
        }
        System.out.println("Вес коробки " + boxAp1.getName() + " - " + boxAp1.getWeight());

        for (int i = 0; i < 5; i++) {
            boxAp2.addFruit(new Apple());
        }
        System.out.println("Вес коробки " + boxAp2.getName() + " - " + boxAp2.getWeight());

        for (int i = 0; i < 8; i++) {
            boxOr1.addFruit(new Orange());
        }
        System.out.println("Вес коробки " + boxOr1.getName() + " - " + boxOr1.getWeight());

        for (int i = 0; i < 10; i++) {
            boxOr2.addFruit(new Orange());
        }
        System.out.println("Вес коробки " + boxOr2.getName() + " - " + boxOr2.getWeight());

//        boxAp1.addFruit(new Orange());

        boxAp1.compare(boxOr1);
        boxAp2.compare(boxAp1);

//        boxOr2.removeFruits(boxAp1);
        boxOr2.removeFruits(boxOr1);
        System.out.println("Вес коробки " + boxOr2.getName() + " - " + boxOr2.getWeight());
        System.out.println("Вес коробки " + boxOr1.getName() + " - " + boxOr1.getWeight());

    }

}
