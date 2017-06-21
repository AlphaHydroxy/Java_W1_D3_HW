package example.codeclan.com.godzilla;

/**
 * Created by user on 21/06/2017.
 */

public class Skyscraper extends HumanConstructs implements Destroyable{

    public Skyscraper(String type, int healthValue){
        super(type, healthValue);
    }

    public String skyscraper(){
        return "Under attack!";
    }

    public int healthValue(){
        return 30;
    }

    public String die(){
        return "Skyscraper has collapsed";
    }

    public String attack(){
        return "attack";
    }
}
