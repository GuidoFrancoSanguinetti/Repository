package api.pages.Spotify;

import api.helpers.RequestsHelper;
import api.pages.ApiPageBase;
import org.apache.hc.core5.http.HttpResponse;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class GetTokenPage extends ApiPageBase {
    RequestsHelper httpClientHelper = new RequestsHelper();

    private HttpResponse tokenResponse;
    private String clientId = "cfe78484c010407cb48587d7797ca5fe";
    private String clientSecret = "3eb3a625945c4bdfb06bce42e4f12983";
    private String userid = "59nwal3kt7sdp82igiqd9wgnn";

    public void getToken() {
        String url = "https://accounts.spotify.com/api/token";
        Map<String, String> headers = new HashMap<>();
        headers.put("Content-Type", "application/x-www-form-urlencoded");

        String requestBody = getTokenBodyBuilder();

        try {
            tokenResponse = httpClientHelper.get(url, headers, requestBody);
            super.setLastResponse(tokenResponse);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private String getTokenBodyBuilder() {
        return "grant_type=client_credentials&client_id=" + clientId + "&client_secret=" + clientSecret;
    }

    public HttpResponse getSavedTokenResponse() {
        return tokenResponse;
    }
}
