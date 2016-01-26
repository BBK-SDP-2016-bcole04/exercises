import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;

/**
 * Created by digibrose on 25/01/2016.
 */
public class RandomCaseFilter extends Writer {


    PrintWriter printWriter;

    public RandomCaseFilter(PrintWriter printWriter) {

        this.printWriter = printWriter;

    }


    @Override
    public void write(char[] cbuf, int off, int len) throws IOException {
        printWriter.println("crap");
        printWriter.close ();
    }


    @Override
    public void flush() throws IOException {

    }

    @Override
    public void close() throws IOException {

    }
}
