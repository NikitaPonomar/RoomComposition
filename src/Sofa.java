public class Sofa {
    // it is the model of sofa in clever house
    public int length;
    public int width;
    public boolean isOccupied;


    public Sofa(int length, int width, boolean isOccupied) {
        this.length = length;
        this.width = width;
        this.isOccupied = isOccupied;
    }

    public boolean sofaOccupied() {
        isOccupied = true;
        System.out.println("Sofa is occupied");
        return isOccupied;
    }

    public boolean sofaFree() {
        isOccupied = false;
        System.out.println("Sofa is free");
        return isOccupied;
    }

}
