import java.io.IOException;
import java.net.MalformedURLException;

public class Calculations {
    Client client = new Client();
    LCG lcg = new LCG();

    public void calculate () throws IOException, InterruptedException {
        int [] xs = new int[3];
        for (int i =0; i <3; i++) {
            xs[i] = (int) client.infoGetter(1).realNumber;
        }
        lcg.countAC(xs[0],xs[1],xs[2]);
        int winnum = lcg.predict((int) client.infoGetter(1).realNumber);
        client.infoGetter(winnum);
    }


    public Calculations() throws MalformedURLException {
    }
}
