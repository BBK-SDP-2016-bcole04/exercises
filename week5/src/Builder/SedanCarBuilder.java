package Builder;

/**
 * Created by digibrose on 08/03/2016.
 */
public class SedanCarBuilder implements CarBuilder {

    private Car Car;


    public SedanCarBuilder(){

        this.Car = new Car("Sedan");

    }

    @Override
    public void BuildBodyStyle() {

       this.Car.setBodyStyle("External dimensions: overall length (inches): 202.9,\n" +
               "   overall width (inches): 76.2, overall height (inches): 60.7,\n" +
               "   wheelbase (inches): 112.9, front track (inches): 65.3,\n" +
               "   rear track (inches): 65.5 and curb to curb turning circle (feet): 39.5");

    }

    @Override
    public void BuildPower() {

        this.Car.setPower("285 hp @ 6,500 rpm; 253 ft lb of torque @ 4,000 rpm");
    }

    @Override
    public void BuildEngine() {

        this.Car.setEngine("3.5L Duramax V 6 DOHC");
    }

    @Override
    public void BuildBreaks() {

        this.Car.setBreaks("Four-wheel disc brakes: two ventilated. Electronic brake distribution");
    }

    @Override
    public void BuildSeats() {

        this.Car.setSeats("Front seat centre armrest.Rear seat centre armrest.Split-folding rear seats");
    }

    @Override
    public void BuildWindows() {

        this.Car.setWindows("Laminated side windows.Fixed rear window with defroster");
    }

    @Override
    public void BuildFuelType() {

        this.Car.setFuelType("Diesel 19 MPG city, 29 MPG highway, 23 MPG combined and 437 mi. range");
    }

    @Override
    public Car getCar() {
        return Car;
    }
}
