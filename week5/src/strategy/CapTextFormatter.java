package strategy;

/**
 * Created by digibrose on 04/02/2016.
 */
public class CapTextFormatter implements TextFormatter {
    @Override
    public void format(String text) {
        System.out.println(text.toUpperCase());
    }
}
