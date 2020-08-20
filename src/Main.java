import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * Assignment 8 P10.4 This program analyzes the distribution of the first digit of values
 * @author Sergei Chekhonin
 */
public class Main {

    static PrintWriter out = null;
    /***
     * Main - enter point to the program
     */
    public static void main(String[] args) {
        //This block initialize printWriter and dateFormatter

        try {
            out = new PrintWriter("Assignment8_P10.4output.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        out.println(dtf.format(now));

        FirstDigitDistribution dist1 = new FirstDigitDistribution(out);
        dist1.process(new SquareSequence(), 1000);
        dist1.display();
        out.println();

        FirstDigitDistribution dist2 = new FirstDigitDistribution(out);
        dist2.process(new RandomSequence(), 1000);
        dist2.display();
        out.println();

        FirstDigitDistribution dist3 = new FirstDigitDistribution(out);
        dist3.process(new PrimeSequence(), 1000);
        dist3.display();
        out.println();




        out.close();
        System.exit(0);


    }


}





