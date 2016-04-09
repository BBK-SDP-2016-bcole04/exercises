package Facade;

/**
 * Created by digibrose on 09/03/2016.
 */
public class ScheduleServerImpl implements ScheduleServer {


    Server server;


    public ScheduleServerImpl(){

        server = new ServerImpl();

    }

    @Override
    public void startBooting() {

        this.server.Boot();
        readSystemConfigFile();

    }

    @Override
    public void readSystemConfigFile() {

        this.server.ConfigInitialize();
        init();

    }

    @Override
    public void init() {

        this.server.Init();
        initializeContext();
    }

    @Override
    public void initializeContext() {

        this.server.InitContext();
        initializeListeners();

    }

    @Override
    public void initializeListeners() {

        this.server.destroyListeners();
        createSystemObjects();

    }

    @Override
    public void createSystemObjects() {

        this.server.createSystemObjects();
        System.out.println("Start working .....");

    }

    @Override
    public void releaseProcesses() {

        this.server.releaseProcess();
        destory();
    }

    @Override
    public void destory() {
        this.server.destroy();
        destroySystemObjects();
    }

    @Override
    public void destroySystemObjects() {
        this.server.destroySystemObjects();
        destoryListeners();
    }

    @Override
    public void destoryListeners() {
        this.server.destroyListeners();
        destoryContext();
    }

    @Override
    public void destoryContext() {
        this.server.destroyContext();
        shutdown();
    }

    @Override
    public void shutdown() {
        this.server.shutdown();
        System.out.println("After work done.........");
    }
}
