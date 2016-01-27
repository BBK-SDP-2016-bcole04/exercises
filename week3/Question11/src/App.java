//import java.io.BufferedWriter;
//import java.io.PrintWriter;

import java.io.BufferedWriter;
import java.io.PrintWriter;

/**
 * Created by digibrose on 25/01/2016.
 */
public class App {

    public static void main(String[] args) {



      //  PrintWriter printWriter = new PrintWriter(System.out);
      //  printWriter.println ("hello");
      //  printWriter.close ();

      //  Test T = new Test();
      //  T.T2();





        //  BufferedWriter BS = new BufferedWriter()

//    WrapFilter out = new WrapFilter(new BufferedWriter(

 //     RandomCaseFilter RC =  new RandomCaseFilter(new PrintWriter(System.out));


        char[] CA = {'A', 'B', 'C'};

  //      try {
    //        RC.write(CA);
      //  } catch (IOException e) {
        //    e.printStackTrace();
       // }


  /*      BufferedWriter BS = new BufferedWriter(new RandomCaseFilter(new PrintWriter(System.out)));

        try {
            BS.write(CA);
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            BS.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
*/

        WrapFilter WF = new WrapFilter(new BufferedWriter(new RandomCaseFilter(new PrintWriter(System.out))),15);

        try {
            WF.print("This should be centered");
        } catch (Exception e) {
            e.printStackTrace();
        }

        //       out.setCenter(true);

  //  out.print("This test should be formatted and central");




    }



}
