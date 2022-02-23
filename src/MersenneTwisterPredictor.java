import java.io.IOException;
import java.net.MalformedURLException;
import java.time.ZoneOffset;

public class MersenneTwisterPredictor {
    public void predict() throws IOException, InterruptedException {
        Client client = new Client();
        MersenneTwister mersenneTwister = new MersenneTwister();
        long seed = (int) client.time(1).toEpochSecond(ZoneOffset.UTC);
        mersenneTwister.setSeed(seed);
        int mt = mersenneTwister.nextInt();
        mt = mersenneTwister.nextInt();
        long a = convertToUint(mt);
        System.out.println(a);
        client.mtinfoGetter(a);
    }
    public long convertToUint(int number) {
        long l = number;
        if (l < 0)
            l += 4294967296l;
        return l;
    }
}
