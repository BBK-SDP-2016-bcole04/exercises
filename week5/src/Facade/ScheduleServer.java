package Facade;

/**
 * Created by digibrose on 09/03/2016.
 */
public interface ScheduleServer {

    void startBooting();
    void readSystemConfigFile();
    void init();
    void initializeContext();
    void initializeListeners();
    void createSystemObjects();
    void releaseProcesses();
    void destory();
    void destroySystemObjects();
    void destoryListeners();
    void destoryContext();
    void shutdown();

}
