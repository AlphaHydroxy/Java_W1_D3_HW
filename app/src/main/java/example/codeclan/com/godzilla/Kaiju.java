package example.codeclan.com.godzilla;

import static android.R.attr.value;

public abstract class Kaiju {

    public String name;
    public int healthValue;

    public Kaiju(String name, int healthValue) {
        this.name = name;
        this.healthValue = healthValue;
    }
}