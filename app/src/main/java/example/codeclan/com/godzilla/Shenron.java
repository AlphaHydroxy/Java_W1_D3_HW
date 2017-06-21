package example.codeclan.com.godzilla;

/**
 * Created by user on 21/06/2017.
 */

public class Shenron extends Kaiju implements Attack{

    public Shenron(String name, int healthValue, int destructiveForce) {
        super(name, healthValue);
    }

    public String attack(){
        return "Ki Blast!";
    }

    public String roar() {
        return "Prepare to die!";
    }

    public int getDestructiveForce() {
        return 50;
    }

}
