import java.io.IOException;
import java.net.MalformedURLException;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        Client client = new Client();
        //client.createAcc();
       //client.infoGetter();
        Calculations calculations = new Calculations();
        calculations.calculate();
    }
}
