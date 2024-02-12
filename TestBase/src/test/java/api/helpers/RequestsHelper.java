package api.helpers;

import org.apache.hc.client5.http.classic.HttpClient;
import org.apache.hc.client5.http.classic.methods.HttpDelete;
import org.apache.hc.client5.http.classic.methods.HttpGet;
import org.apache.hc.client5.http.classic.methods.HttpPost;
import org.apache.hc.client5.http.impl.classic.HttpClients;
import org.apache.hc.core5.http.HttpResponse;
import org.apache.hc.core5.http.io.entity.StringEntity;

import java.io.IOException;
import java.util.Map;

public class RequestsHelper {



    private final HttpClient httpClient;

    public RequestsHelper() {
        this.httpClient = HttpClients.createDefault();
    }

    public HttpResponse get(String url) throws IOException {
        HttpGet request = new HttpGet(url);
        return httpClient.execute(request);
    }

    public HttpResponse get(String url, Map<String, String> headers, String requestBody) throws IOException {
        HttpGet request = new HttpGet(url);
        addHeaders(request, headers);
        return httpClient.execute(request);
    }

    public HttpResponse post(String url, Map<String, String> headers, String body) throws IOException {
        HttpPost request = new HttpPost(url);
        addHeaders(request, headers);
        addRequestBody(request, body);
        return httpClient.execute(request);
    }

    public HttpResponse delete(String url, Map<String, String> headers, String requestBody) throws IOException {
        HttpDelete request = new HttpDelete(url);
        addHeaders(request, headers);
        return httpClient.execute(request);
    }

    private void addHeaders(HttpGet request, Map<String, String> headers) {
        if (headers != null) {
            for (Map.Entry<String, String> entry : headers.entrySet()) {
                request.addHeader(entry.getKey(), entry.getValue());
            }
        }
    }

    private void addHeaders(HttpPost request, Map<String, String> headers) {
        if (headers != null) {
            for (Map.Entry<String, String> entry : headers.entrySet()) {
                request.addHeader(entry.getKey(), entry.getValue());
            }
        }
    }

    private void addHeaders(HttpDelete request, Map<String, String> headers) {
        if (headers != null) {
            for (Map.Entry<String, String> entry : headers.entrySet()) {
                request.addHeader(entry.getKey(), entry.getValue());
            }
        }
    }

    private void addRequestBody(HttpPost request, String body) throws IOException {
        if (body != null) {
            StringEntity entity = new StringEntity(body);
            request.setEntity(entity);
        }
    }
}
