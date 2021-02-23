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
        ArrayList<String> filename = new ArrayList<String>();
        String baseFileName="src/main/java/file";
        int i = 1;
        for (String u : url)
        {
            CloseableHttpClient client = HttpClientBuilder.create().build();
            HttpGet request = new HttpGet(u);
            System.out.println("[-] GETTING " + u);
            HttpResponse response = client.execute(request);
            HttpEntity entity = response.getEntity();
            int responseCode = response.getStatusLine().getStatusCode();

            if(responseCode == 200)
            {
                System.out.println("[-] Response 200 ");
                i++;
                String add = baseFileName+ i +".pdf";
                InputStream inputStream = entity.getContent();
                FileOutputStream fos = new FileOutputStream(add);
                filename.add(add);
                int bytee;
                while((bytee = inputStream.read()) != -1) {
                    fos.write(bytee);
                }
            }
            else{
                System.out.println("[-] Invalid URL ");
            }
            client.close();
        }
        return filename;
    }
}
