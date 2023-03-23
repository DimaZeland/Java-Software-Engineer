package printf4;

import java.io.*;

/**
 * @author Cay Horstmann
 * @version 1.11 2018-05-01
 */
class Printf4Test {
    public static void main(String[] args) {
        double price = 44.95;
        double tax = 7.75;
        double amountDue = price * (1 + tax / 100);
        var out = new PrintWriter(System.out);
        /* This call will throw an exception--note the %% */
        Printf4.fprint(out, "Amount due = %%8.2f\n", amountDue);
        out.flush();
    }
}
