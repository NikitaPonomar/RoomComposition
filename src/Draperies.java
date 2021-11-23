public class Draperies {
    // it is the model of draperies in clever house
    private boolean[]  draperyOpened;

    public Draperies(boolean[] draperyOpened) {
        this.draperyOpened = draperyOpened;
    }

    public void setDraperyOpened(int draperyNumber) {
        if (draperyNumber<1 || draperyNumber>draperyOpened.length) System.out.println("Invalid drapery number");
        else {
            draperyOpened[draperyNumber-1]=true;
            System.out.println("Drapery # " + draperyNumber + " opened");
        }
    }
    public void setDraperyClosed(int draperyNumber) {
        if (draperyNumber<1 || draperyNumber>draperyOpened.length) System.out.println("Invalid drapery number");
        else {
            draperyOpened[draperyNumber-1]=false;
            System.out.println("Drapery # " + draperyNumber + " closed");
        }
    }

    public boolean[] getDraperyOpened() {
        return draperyOpened;
    }
}
