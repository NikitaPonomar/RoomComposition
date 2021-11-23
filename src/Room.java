public class Room {
    // It is the concept of clever house, that includes windows, sofa, door, condition, lamp, draperies

    public int temperatureOutside;
    public int hour;
    public Draperies draperies;
    public Window windows;
    public Lamp lamp;
    public Condition condition;
    public Door door;
    public Sofa sofa;

    public Room(int temperatureOutside, int hour, Draperies draperies, Window windows, Lamp lamp, Condition condition, Door door, Sofa sofa) {
        this.temperatureOutside = temperatureOutside;
        this.hour = hour;
        this.draperies = draperies;
        this.windows = windows;
        this.lamp = lamp;
        this.condition = condition;
        this.door = door;
        this.sofa = sofa;
    }

    //Regulation the temperature in the room depends of the outside t and season of the year
    public void temperatureRegulation() {
        int season = condition.season();
        if (season == 1) {
            for (int i=1; i<=windows.countOfWindows;i++){
                windows.closeWindow(i);
            }
        } else if (season == 2) {
            if (temperatureOutside >= 10 && temperatureOutside <= 25) {
                windows.openWindow(1);
            } else if (temperatureOutside<10) {
                for (int i=1; i<=windows.countOfWindows;i++){
                    windows.closeWindow(i);
                }
            }
        } else if (season == 3) {
            if (temperatureOutside > 25) {
                for (int i=1; i<=windows.countOfWindows;i++){
                    windows.closeWindow(i);
                }
            } else {
                windows.openWindow(1);
                windows.openWindow(2);
            }
        } else if (season == 4) {
            if (temperatureOutside >= 10 && temperatureOutside <= 25) {
                windows.openWindow(1);
            } else {
                for (int i=1; i<=windows.countOfWindows;i++){
                    windows.closeWindow(i);
                }
            }
        }
    }

    // Changing lightning depends of day light
    public void lampAndDraperiesRegulation() {
        if (hour < 7 || hour > 22) {
            for (int i=1; i<=draperies.getDraperyOpened().length; i++){
                draperies.setDraperyClosed(i);
            }
            lamp.turnOffTheLight();
        } else if (hour >= 7 && hour <= 22) {
            for (int i=1; i<=draperies.getDraperyOpened().length; i++){
                draperies.setDraperyOpened(i);
            }
            if (windows.lightning(hour)) lamp.turnOffTheLight();
            else lamp.turnOnTheLight();
        }
    }

    //preparing room to sleep
    public void sleeping() {
        if (hour < 7 || hour > 22) {
            door.closeTheDoor();
            if (lamp.lampIsOn)  lamp.turnOffTheLight();
            sofa.sofaOccupied();
        } else if ((hour>=7 && hour<=8) || hour>=17) {
            door.openTheDoor();
            if (!lamp.lampIsOn) lamp.turnOnTheLight();
            sofa.sofaFree();
        } else {
            door.openTheDoor();
            if (lamp.lampIsOn) lamp.turnOffTheLight();
            sofa.sofaFree();
        }
    }

}
