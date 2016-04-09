package Facade;

/**
 * Created by digibrose on 09/03/2016.
 */
public class FacadeTest {

    public static void main(String[] args){

    ScheduleServer server = new ScheduleServerImpl();

            server.startBooting();
            server.releaseProcesses();


    }

}
