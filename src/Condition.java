public class Condition {
    // it is the model of condition in clever house
    public int dayOfTheYear;
    public int temperatureOutside;

    public Condition(int dayOfTheYear, int temperatureOutside) {
        this.dayOfTheYear = dayOfTheYear;
        this.temperatureOutside = temperatureOutside;
    }

    public void hitting (){
        System.out.println("Hitting is ON");
    }

    public void cooling (){
        System.out.println("Conditioning is ON");
    }

    // finding season of the year regarding calendar day
    // temperature control regarding season and outside t
    public int season () {
        if ((dayOfTheYear>=0 && dayOfTheYear<=90) || (dayOfTheYear>=335 & dayOfTheYear<=366)) {
            System.out.println("It is winter");
            if (temperatureOutside<10) hitting();
            return 1;
        } else if (dayOfTheYear<0 || dayOfTheYear >366) {
            System.out.println("Incorrect day");
            return -1;
        } else if (dayOfTheYear>90 && dayOfTheYear<=180) {
            System.out.println("It is spring");
            if (temperatureOutside<10) hitting();
            else if (temperatureOutside>25) cooling();
            return 2;
        } else if (dayOfTheYear>180 && dayOfTheYear<270) {
            System.out.println("It is summer");
            if (temperatureOutside>25) cooling();
            return 3;
        } else {
            System.out.println("It is autumn");
            if (temperatureOutside>25) cooling();
            if (temperatureOutside<10) hitting();
            return 4;
        }

    }
}
