package HttpClient;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;

public class HTTP {
    public static ArrayList<String> download(ArrayList<String> url) throws IOException {
        CloseableHttpClient client = HttpClientBuilder.create().build();
        HttpGet request = new HttpGet(url);
        HttpResponse response = client.execute(request);
        HttpEntity entity = response.getEntity();
        int responseCode = response.getStatusLine().getStatusCode();

        if(responseCode == 200)
        {
            InputStream inputStream = entity.getContent();
            FileOutputStream fos = new FileOutputStream(filename);
            int bytee;
            while((bytee = inputStream.read()) != -1) {
                fos.write(bytee);
        }
            client.close();
            return responseCode;
        }
        client.close();
        return responseCode;
    }
}
