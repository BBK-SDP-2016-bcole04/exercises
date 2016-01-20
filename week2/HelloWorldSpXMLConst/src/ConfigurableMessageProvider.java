/**
 * Created by digibrose on 20/01/2016.
 */
public class ConfigurableMessageProvider implements MessageProvider{

    private String message;
    public ConfigurableMessageProvider(String message) {
        this.message = message;
    }
    public String getMessage() {
        return message;
    }

}
