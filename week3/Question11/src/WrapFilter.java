import java.io.BufferedWriter;
import java.io.IOException;

/**
 * Created by digibrose on 25/01/2016.
 */
public class WrapFilter {

    private boolean Center;
    private char[] chararr;

    BufferedWriter bufferedWriter;

    public WrapFilter(BufferedWriter bufferedWriter, int i) {

        this.bufferedWriter = bufferedWriter;

    }

    public void setCenter(boolean T){
        this.Center = T;

    }

    public void print(String S){

        for(int i=0;i<S.length();i++){
            chararr = new char[S.length()];
            chararr[i]= S.charAt(i);
        }


        try {
            bufferedWriter.write(chararr);
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            bufferedWriter.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
