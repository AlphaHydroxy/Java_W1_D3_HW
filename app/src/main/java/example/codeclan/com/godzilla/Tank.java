package example.codeclan.com.godzilla;

/**
 * Created by user on 21/06/2017.
 */

public class Tank extends HumanConstructs implements Destroyable {

    public Tank(String type, int healthValue) {
        super(type, healthValue);
    }

    public String assaultBreacher() {
        return "The tank is under attack!";
    }

    public int healthValue() {
        return 1500;
    }

    public String die(){
        return "Tank exploded";
    }

    public String attack(){
        return "attack";
    }
}
