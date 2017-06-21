package example.codeclan.com.godzilla;

import example.codeclan.com.godzilla.Attack;
import example.codeclan.com.godzilla.Kaiju;

/**
 * Created by user on 21/06/2017.
 */

public class Godzilla extends Kaiju implements Attack {


    public Godzilla(String name, int healthValue, int destructiveForce) {
        super(name, healthValue);
    }

//    public String attack(HumanConstructs construct){
//        construct.subtractHealth(this.getDestructiveForce());
//        return "Tail Whip!";
//    }

    public int getDestructiveForce() {
        return 50;
    }

    public String roar() {
        return "Roooooaooooaaaaaaaaar!!!";
    }

    public String getName(){
        return this.name;
    }

    public int getHealthValue(){
        return this.healthValue;
    }
}
