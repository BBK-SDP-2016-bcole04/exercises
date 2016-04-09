package Builder;

/**
 * Created by digibrose on 08/03/2016.
 */
public class SportsCarBuilder implements CarBuilder {


    private Car Car;


    public SportsCarBuilder(){

        this.Car = new Car("Sports");

    }


    @Override
    public void BuildBodyStyle() {
        Car.setBodyStyle("External dimensions: overall length (inches): 192.3,\n" +
                "   overall width (inches): 75.5, overall height (inches): 54.2,\n" +
                "   wheelbase (inches): 112.3, front track (inches): 63.7,\n" +
                "   rear track (inches): 64.1 and curb to curb turning circle (feet): 37.7");
    }

    @Override
    public void BuildPower() {
        Car.setPower("323 hp @ 6,800 rpm; 278 ft lb of torque @ 4,800 rpm");
    }

    @Override
    public void BuildEngine() {
        Car.setEngine("3.6L V 6 DOHC and variable valve timing");
    }

    @Override
    public void BuildBreaks() {
        Car.setBreaks("our-wheel disc brakes: two ventilated. Electronic brake distribution.\n" +
                "   Stability control");
    }

    @Override
    public void BuildSeats() {
        Car.setSeats("Driver sports front seat with one power adjustments manual height,\n" +
                "   front passenger seat sports front seat with one power adjustments");
    }

    @Override
    public void BuildWindows() {
        Car.setWindows("Front windows with one-touch on two windows");
    }

    @Override
    public void BuildFuelType() {
        Car.setFuelType("Petrol 17 MPG city, 28 MPG highway, 20 MPG combined and 380 mi. range");
    }

    @Override
    public Car getCar() {
        return Car;
    }
}