import java.io.ObjectStreamException;
import java.io.Serializable;
public class SingletonProtected implements Serializable {
    private static final long serialVersionUID = -1;


    private static SingletonProtected sc = new SingletonProtected();

    //Do not allow the constructor to be rerun

    private SingletonProtected() {
        if (sc != null) {
            throw new IllegalStateException("Already created.");
        }
    }

    //Normal getInstance Call

    public static SingletonProtected getInstance() {
        return sc;
    }

    //reflection???

    private static Class getClass(String classname) throws ClassNotFoundException {
        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
        if (classLoader == null)
            classLoader = SingletonProtected.class.getClassLoader();
        return (classLoader.loadClass(classname));
    }


    //Dealing with serializeable

    private Object readResolve() throws ObjectStreamException {
        return sc;
    }
    private Object writeReplace() throws ObjectStreamException {
        return sc;
    }

    //Block cloning

    public Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException("Singleton, cannot be clonned");
    } }