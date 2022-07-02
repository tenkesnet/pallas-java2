import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.ArrayList;

import org.json.JSONException;
import org.json.JSONObject;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

public class pelda3 {
    private static String readAll(Reader rd) throws IOException {
        StringBuilder sb = new StringBuilder();
        int cp;
        while ((cp = rd.read()) != -1) {
            sb.append((char) cp);
        }
        return sb.toString();
    }

    public static JSONObject readJsonFromUrl(String url) throws IOException, JSONException {
        InputStream is = new URL(url).openStream();
        try {
            BufferedReader rd = new BufferedReader(new InputStreamReader(is, Charset.forName("UTF-8")));
            String jsonText = readAll(rd);
            JSONObject json = new JSONObject(jsonText);
            return json;
        } finally {
            is.close();
        }
    }

    public static String readStringFromUrl(String url) throws IOException, JSONException {
        InputStream is = new URL(url).openStream();
        try {
            BufferedReader rd = new BufferedReader(new InputStreamReader(is, Charset.forName("UTF-8")));
            String jsonText = readAll(rd);
            return jsonText;
        } finally {
            is.close();
        }
    }

    public static void main(String[] args) throws IOException, JSONException {
        pelda3 p = new pelda3();
        String jsonText = "";
        try {
            jsonText = p.readStringFromUrl("https://jsonplaceholder.typicode.com/users");
        } catch (IOException e) {
            jsonText = "";
        }

        // System.out.println(jsonText);
        ArrayList<User> users = null;
        ObjectMapper teve = new ObjectMapper();

        try {
            users = teve.readValue(jsonText,
                    new TypeReference<ArrayList<User>>() {
                    });

        } catch (IOException e) {
            e.printStackTrace();
            users = new ArrayList<User>();
        }
        int i = 1;
        try {
            for (User u : users) {
                int j = i++;
                System.out.println(j + ". user: " + u);

            }
        } catch (Exception e) {
            // TODO: handle exception
        }

    }
}
