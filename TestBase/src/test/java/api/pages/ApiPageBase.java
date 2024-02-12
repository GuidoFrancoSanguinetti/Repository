package api.pages;

import java.net.http.HttpResponse;

public class ApiPageBase {

    private HttpResponse lastResponse;

    protected void setLastResponse(org.apache.hc.core5.http.HttpResponse tokenResponse) {
        this.lastResponse = (HttpResponse) tokenResponse;
    }

    public void checkLastResponseCode(String code) {
        if (lastResponse.statusCode() != Integer.parseInt(code)) {
            throw new RuntimeException("Last response code is not " + code + ". It is " + lastResponse.statusCode());
        }
    }
}
