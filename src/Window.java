public class Window {
    // it is the model of window in clever house
    public int countOfWindows;
    public int hour;


    public Window(int countOfWindows, int hour) {
        this.countOfWindows = countOfWindows;
        this.hour = hour;
    }

    public void openWindow (int numberWindow){
        if (numberWindow<=0 || numberWindow>countOfWindows) System.out.println("Invalid number of window");
        else System.out.println("You opened window # "+numberWindow);
    }

    public void closeWindow (int numberWindow){
        if (numberWindow<=0 || numberWindow>countOfWindows) System.out.println("Invalid number of window");
        else System.out.println("You closed window # "+numberWindow);
    }

    // checking day light regarding the hour
    public boolean lightning (int hour){
        if (hour<0 || hour>24) {
            System.out.println("Invalid hour");
            return false;
        }
        else if (hour < 7 || hour>=18) {
            System.out.println("It is dark");
            return false;
        }
        else System.out.println("it is bright as a day");
        return true;

    }

}
