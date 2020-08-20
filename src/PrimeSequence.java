import java.io.PrintWriter;

public class PrimeSequence implements Sequence {

    private int nextPrime=2;

    /**
     * Each call of method computes next prime number
     * @return next prime number
     */
    public int next()
    {
        if (nextPrime!=2 && nextPrime!=3) {
            while (nextPrime % 2 == 0 || nextPrime % 3 == 0) {
                ++nextPrime;
            }
        }
        return nextPrime++;
    }
}

