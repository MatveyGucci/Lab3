import java.io.IOException;
import java.net.MalformedURLException;
import java.time.ZoneOffset;

public class MersenneTwisterPredictor {
    public void predict() throws IOException, InterruptedException {
        Client client = new Client();
        MersenneTwister mersenneTwister = new MersenneTwister();
        int seed = (int) client.time(1).toEpochSecond(ZoneOffset.UTC);
        mersenneTwister.setSeed(seed);
    }
}
