package mainTask;

/**
 * Created by GVG on 15.08.2017.
 */
public class Orange extends Fruit {

    private final float weight = 1.5f;
    private final String TYPE = "Orange";

    @Override
    public float getWeight() {
        return this.weight;
    }

    @Override
    public String getType() {
        return TYPE;
    }

}
