public class Door {
    // it is the model of sofa in clever house
    public String colour = "white";
    public boolean doorOpened;

    public Door(boolean doorOpened) {
        this.doorOpened = doorOpened;
    }

    public boolean openTheDoor(){
        doorOpened=true;
        System.out.println("Door is open");
        return doorOpened;
    }

    public boolean closeTheDoor(){
        doorOpened=false;
        System.out.println("Door is closed");
        return doorOpened;
    }

}

