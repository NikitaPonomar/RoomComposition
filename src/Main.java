public class Main {
    public static void main(String[] args) {

        // This application is a simulation model of ROOM

        // Initialisation of fields and objects
        int temperatureOutside = 22;
        int hour = 9;
        int dayOfTheYear = 40;

        Room bedroom = new Room(temperatureOutside, hour, new Draperies(new boolean[] {false, true, true, false}),
                new Window(3, hour), new Lamp(),
                new Condition(dayOfTheYear, temperatureOutside), new Door(true),
                new Sofa(200, 200, true));

        System.out.println("Testing  is open for each drapery from  Drapery Array");
   boolean[] testValueOfDraperyArray = bedroom.draperies.getDraperyOpened();
        for (int i = 1; i <= testValueOfDraperyArray.length; i++) {
            System.out.println("Drapery " +i+ " is open? " + testValueOfDraperyArray[i - 1]);
        }

        System.out.println("Testing case 1");
        System.out.println("temperatureOutside = " + temperatureOutside);
        System.out.println("dayOfTheYear = " + dayOfTheYear);
        bedroom.temperatureRegulation();
        System.out.println("hour = " + hour);
        bedroom.lampAndDraperiesRegulation();
        bedroom.sleeping();

        System.out.println("********************");
        System.out.println("Testing case 2");
        bedroom.windows.countOfWindows = 2;
        hour = 23;
        bedroom.hour=hour;
        bedroom.windows.hour=hour;
        dayOfTheYear = 280;
        bedroom.condition.dayOfTheYear=dayOfTheYear;
        temperatureOutside = 30;
        bedroom.condition.temperatureOutside=temperatureOutside;
        bedroom.temperatureOutside=temperatureOutside;
        boolean[]  draperyOpened={false,false}; //another way to initialise Draperies
//         Draperies draperies = new Draperies(draperyOpened);
        bedroom.draperies= new Draperies(draperyOpened);
        System.out.println("temperatureOutside = " + temperatureOutside);
        System.out.println("dayOfTheYear = " + dayOfTheYear);
        bedroom.temperatureRegulation();
        System.out.println("hour = " + hour);
        bedroom.lampAndDraperiesRegulation();
        bedroom.sleeping();




    }
}
