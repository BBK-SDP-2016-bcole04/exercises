package Builder;

/**
 * Created by digibrose on 08/03/2016.
 */
public class CarDirector {

    private CarBuilder CarBuilder;

    public CarDirector(CarBuilder CarBuilder){

        this.CarBuilder = CarBuilder;

    }

    public Car getCar(){

        return this.CarBuilder.getCar();

    }

    public void build(){

        CarBuilder.BuildBodyStyle();
        CarBuilder.BuildBreaks();
        CarBuilder.BuildEngine();
        CarBuilder.BuildFuelType();
        CarBuilder.BuildPower();
        CarBuilder.BuildSeats();
        CarBuilder.BuildWindows();

    }


}
