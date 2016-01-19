package decoupledInterface;

/**
 * Created by digibrose on 19/01/2016.
 */
public interface MessageRenderer {

    public void render();
    public void setMessageProvider(MessageProvider provider);
    public MessageProvider getMessageProvider();
}

