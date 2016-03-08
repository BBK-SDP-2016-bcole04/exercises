package Builder;

/**
 * Created by digibrose on 08/03/2016.
 */
public interface CarBuilder {

    void BuildBodyStyle();

    void BuildPower();

    void BuildEngine();

    void BuildBreaks();

    void BuildSeats();

    void BuildWindows();

    void BuildFuelType();

    Car getCar();

}
