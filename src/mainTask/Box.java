package mainTask;

import java.util.ArrayList;

/**
 * Created by GVG on 15.08.2017.
 */
public class Box<T> {
    private ArrayList<T> content;
    private String name;

    public Box(String name) {
        this.name = name;
        this.content = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addFruit(T fruit) {
        content.add(fruit);
    }

    public float getWeight() {
        float boxWeight = 0;
        for (int i = 0; i < content.size(); i++) {
            T elem = content.get(i);
            boxWeight += ((Fruit) elem).getWeight();
        }
        return boxWeight;
    }

    public void compare(Box box1) {
        if (Math.abs(this.getWeight() - box1.getWeight()) < 0.0000001) {
            System.out.println("Коробки: " + getName() + " и " + box1.getName() + " равны по весу.");
        } else {
            System.out.println("Коробки: " + getName() + " и " + box1.getName() + " не равны по весу!");
        }
    }

    public void removeFruits(Box<T> box) {
        for (int i = 0; i < content.size(); i++) {
            box.addFruit(content.get(i));
        }
        content.clear();
        System.out.println("Фрукты из коробки " + getName() + " перемещены в коробку " + box.getName());
    }
}
