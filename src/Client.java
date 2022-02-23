import com.google.gson.Gson;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class Client {
    String link = "http://95.217.177.249/casino/playlcg?id=%s&bet=%d&number=%d";

    public Client() throws MalformedURLException {
    }

    public void createAcc() throws IOException {
        URL url = new URL("http://95.217.177.249/casino/createacc?id=lol");
        url.openConnection();
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.connect();
    }


    public message infoGetter (int number) throws IOException, InterruptedException {
        URL url = new URL (String.format(link, "lol", 1,number));
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.connect();
        BufferedReader reader = new BufferedReader(new InputStreamReader(conn.getInputStream()));
        String string = reader.readLine();
        System.out.println(string);
        Gson gson = new Gson();
        message message = gson.fromJson(string, message.class);
        //System.out.println(message.message + message.realNumber + message.account);
        return message;
    }
}
