package Facade;

/**
 * Created by digibrose on 09/03/2016.
 */
public interface Server {

    void Boot();

    void ConfigInitialize();

    void Init();

    void InitContext();

    void InitListeners();

    void createSystemObjects();

    void releaseProcess();

    void destroy();

    void destroySystemObjects();

    void destroyListeners();

    void destroyContext();

    void shutdown();

}
