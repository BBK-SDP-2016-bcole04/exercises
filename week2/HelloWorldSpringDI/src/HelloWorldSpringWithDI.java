import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.support.PropertiesBeanDefinitionReader;

import java.io.FileInputStream;
import java.util.Properties;

/**
 * Created by digibrose on 20/01/2016.
 */
public class HelloWorldSpringWithDI {
    public static void main(String[] args) throws Exception {
        // get the bean factory
        BeanFactory factory = getBeanFactory();
        MessageRenderer mr = (MessageRenderer) factory.getBean("renderer");
        mr.render();
    }
    private static BeanFactory getBeanFactory() throws Exception {
        // get the bean factory
        DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
        // create a definition reader
        PropertiesBeanDefinitionReader rdr = new PropertiesBeanDefinitionReader(
                factory);
        // load the configuration options
        Properties props = new Properties();
        props.load(new FileInputStream("/Users/digibrose/LTMSc/SDP/exercises/week2/HelloWorldSpringDI/beans.properties"));
        rdr.registerBeanDefinitions(props);
        return factory;
    }

}
