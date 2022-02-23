import com.google.gson.Gson;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.LocalDateTime;

public class Client {
    String link = "http://95.217.177.249/casino/playlcg?id=%s&bet=%d&number=%d";
    String mtlink = "http://95.217.177.249/casino/playmt?id=%s&bet=%d&number=%d";

    public Client() throws MalformedURLException {
    }

    public void createAcc(String string) throws IOException {
        String urll = "http://95.217.177.249/casino/createacc?id=%s";
        URL url = new URL(String.format(urll, string));
        url.openConnection();
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.getResponseCode();
        System.out.println(conn.getInputStream());

    }

    public LocalDateTime time(int num) throws IOException, InterruptedException {
        String buffertime = mtinfoGetter(num).account.deletionTime;
        buffertime = buffertime.replaceAll("Z","");
        LocalDateTime time = LocalDateTime.parse(buffertime);
        time = time.minusHours(1);

        System.out.println(time);

        return time;
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
    public message mtinfoGetter (long number) throws IOException, InterruptedException {
        URL url = new URL (String.format(mtlink, "loll11", 1,number));
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.connect();
        BufferedReader reader = new BufferedReader(new InputStreamReader(conn.getInputStream()));
        String string = reader.readLine();
        System.out.println(string);
        Gson gson = new Gson();
        message message = gson.fromJson(string, message.class);
        System.out.println(message.message + message.realNumber + message.account);
        return message;
    }
}
