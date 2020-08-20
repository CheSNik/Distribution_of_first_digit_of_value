import java.io.PrintWriter;

/**
 This class analyzes the distribution of the last digit of values
 from a sequence.
 */
public class FirstDigitDistribution
{
    private int[] counters;
    private PrintWriter out;
    /**
     Constructs a distribution whose counters are set to zero.
     */
    public FirstDigitDistribution(PrintWriter out)
    {
        this.out = out;
        counters = new int[10];
    }

    /**
     Processes values from this sequence.
     @param seq the sequence from which to obtain the values
     @param valuesToProcess the number of values to process
     */
    public void process(Sequence seq, int valuesToProcess)
    {
        int firstDigit;
        for (int i = 1; i <= valuesToProcess; i++)
        {

            int value = seq.next();
            if (value>=100){
                while (value>=10) {
                    value = value / 10;
                }
                firstDigit = value;
            }
            else if (value>=10){
                firstDigit = value / 10;
            }
            else
                firstDigit = value;
            counters[firstDigit]++;

        }
    }

    /**
     Displays the counter values of this distribution.
     */
    public void display()
    {
        for (int i = 0; i < counters.length; i++)
        {
            out.println(i + ": " + counters[i]);
        }
    }
}
