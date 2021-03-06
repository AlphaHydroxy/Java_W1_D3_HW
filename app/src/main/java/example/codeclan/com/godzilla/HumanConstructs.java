package example.codeclan.com.godzilla;

public abstract class HumanConstructs {

    private String type;
    private int healthValue;

    public HumanConstructs(String type, int healthValue) {
        this.type = type;
        this.healthValue = healthValue;
    }

    public String getType(){
        return this.type;
    }

    public int getHealthValue(){
        return this.healthValue;
    }

    public void subtractHealth(int amount){
        this.healthValue -= amount;
    }

    public String destroy(){
        return "Kabooooooooom";
    }
}
