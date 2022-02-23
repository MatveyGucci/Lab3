import java.math.BigInteger;

public class LCG {
    long m = (int) Math.pow(2,32);
    int a;
    int c;
    int prenum = 0;

    public int predict (int prenum){
        int finalnum;
         finalnum = (int) ((a * prenum + c) % m);
         return finalnum;

    }


    static int modInverse(int a, int m)
    {
        for (int x = 1; x < m; x++)
            if (((a%m) * (x%m)) % m == 1) {
                return x;
            }
        return 1;
    }

    public void countAC( int x0, int x1, int x2){
        int A1, C1;
        a = (int) (((x2 - x1) * modInverse(x1 -x0, (int) m))%m);
        c = (int) ((x1 - x0 * a)%m);
        System.out.println(a);
        System.out.println(c);

    }
}
