package autoscan;

import org.springframework.stereotype.Component;

/**
 * Created by digibrose on 19/01/2016.
 */
@Component
public class HelloWorldMessageProvider implements MessageProvider {

    @Override
        public String getMessage() {
            return "Hello World!";
        }
}


