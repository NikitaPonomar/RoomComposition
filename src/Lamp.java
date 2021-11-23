public class Lamp {
    // it the model of lamp in clever house
    private int countOfLamps=3;
    private String model = "noname";
    public boolean lampIsOn;


    public boolean turnOnTheLight () {
        System.out.println("Lamp is ON");
        lampIsOn=true;
        return true;
    }

    public boolean turnOffTheLight () {
        System.out.println("Lamp is OFF");
        lampIsOn=false;
        return false;
    }


}
