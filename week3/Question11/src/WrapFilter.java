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

    public void print(String S) {
        int j=0;
        chararr = new char[S.length()];
        for (int i = 0; i < S.length(); i++) {
            chararr[j] = S.charAt(i);
            //   System.out.print(chararr[i]);
            try {
                bufferedWriter.write(chararr[j]);
            } catch (IOException e) {
                e.printStackTrace();
            }
            if (j==15) {
            j=0;
            try     {
            bufferedWriter.flush();
            } catch (IOException e) {
            e.printStackTrace();
            }
        }
        j++;
    }

       try {
            bufferedWriter.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
