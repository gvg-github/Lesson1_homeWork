package mainTask;

/**
 * Created by GVG on 15.08.2017.
 */
public class Apple extends Fruit {

    private final float weight = 1.0f;
    private final String TYPE = "Apple";

    @Override
    public float getWeight() {
        return this.weight;
    }

    @Override
    public String getType() {
        return TYPE;
    }

}
