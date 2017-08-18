/**
 * Created by apple on 2017/6/15.
 */
public class OneTimes {

    public static void main(String args[]) {
       System.out.println(""+countOne(1000));
    }

    public static long countOne(long n) {
        long i = 0,j = 1;
        long count = 0;
        for (i = 0; i <= n; i++)
        {
            j = i;
            while (j != 0)
            {
                if (j % 10 == 1)
                    count++;
                j = j / 10;
            }
        }
        return count;
    }
}
