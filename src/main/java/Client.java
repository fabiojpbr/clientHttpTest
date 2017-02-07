import java.io.IOException;
import java.io.InputStream;

import org.apache.commons.io.IOUtils;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClientBuilder;

public class Client {
    public static void main(String[] args) throws ClientProtocolException, IOException {
        HttpClient httpClient = HttpClientBuilder.create().build();
        HttpResponse response = httpClient.execute(new HttpGet("http://ip.jsontest.com/"));
        InputStream content = response.getEntity().getContent();
        String json = IOUtils.toString(content, "UTF-8");
        System.out.println(json);   
    }
}
