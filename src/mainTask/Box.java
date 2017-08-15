package mainTask;

import java.util.ArrayList;

/**
 * Created by GVG on 15.08.2017.
 */
public class Box<T> {
    private ArrayList<T> content;
    private String name;
    private String type;

    public Box(String name) {
        this.name = name;
        this.content = new ArrayList<T>();
        this.type = "";
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public void addFruit(T fruit) {

        if (content.isEmpty()) {
            content.add(fruit);
            this.type = ((Fruit) fruit).getType();

        } else {
            if (type == ((Fruit) fruit).getType()) {
                content.add(fruit);
            } else {
                System.out.println("В коробке " + getName() + " лежат другие фрукты!");
                return;
            }
        }
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
        if (this.getWeight() == box1.getWeight()) {
            System.out.println("Коробки: " + getName() + " и " + box1.getName() + " равны по весу.");
        } else {
            System.out.println("Коробки: " + getName() + " и " + box1.getName() + " не равны по весу!");
        }
    }

    public void removeFruits(Box box) {
        if (type != box.getType()) {
            System.out.println("В коробке " + getName() + " другие фрукты! Нельзя пересыпать!");
            return;
        }
        for (int i = 0; i < content.size(); i++) {
            box.addFruit(content.get(i));
        }
        content.clear();
        System.out.println("Фрукты из коробки " + getName() + " перемещены в коробку " + box.getName());
    }
}
