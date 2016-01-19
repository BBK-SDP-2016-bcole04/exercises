package HelloWorldDecoupledInterfaceWithFactory;
import java.io.FileInputStream;
import java.util.Properties;
/**
 * Created by digibrose on 19/01/2016.
 */

    public class MessageSupportFactory {
        private static MessageSupportFactory instance = null;
        private Properties props = null;
        private MessageRenderer renderer = null;
        private MessageProvider provider = null;
        private MessageSupportFactory() {
            props = new Properties();
            try {
                props.load(new FileInputStream("/Users/digibrose/LTMSc/SDP/exercises/week2/src/HelloWorldDecoupledInterfaceWithFactory/bean.properties"));
                // get the implementation classes
                String rendererClass = props.getProperty("renderer.class");
                String providerClass = props.getProperty("provider.class");
                renderer = (MessageRenderer) Class.forName(rendererClass)
                        .newInstance();
                provider = (MessageProvider) Class.forName(providerClass)
                        .newInstance();
            } catch (Exception ex) {
                ex.printStackTrace();
            } }
        static {
            instance = new MessageSupportFactory();
        }
        public static MessageSupportFactory getInstance() {
            return instance;
        }
        public MessageRenderer getMessageRenderer() {
            return renderer;
        }
        public MessageProvider getMessageProvider() {
            return provider;
        }

}
