import java.io.IOException;
import java.net.MalformedURLException;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        Client client = new Client();
        client.createAcc("loll11");
       //client.infoGetter();
        //Calculations calculations = new Calculations();
        //calculations.calculate();

        MersenneTwisterPredictor mersenneTwisterPredictor = new MersenneTwisterPredictor();
        mersenneTwisterPredictor.predict();
    }
}
