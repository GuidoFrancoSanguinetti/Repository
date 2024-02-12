package api.pages.Spotify;

import api.helpers.RequestsHelper;
import api.pages.ApiPageBase;
import io.cucumber.cienvironment.internal.com.eclipsesource.json.JsonObject;
import org.apache.hc.core5.http.HttpResponse;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class UsersPage extends ApiPageBase {

    RequestsHelper httpClientHelper = new RequestsHelper();

    private HttpResponse createPlaylistResponse;
    private String base_url = "https://api.spotify.com/v1/users/";
    private String userId = "59nwal3kt7sdp82igiqd9wgnn";
    public void createPlaylist() {
        String url = base_url + userId + "/playlists";
        Map<String, String> headers = new HashMap<>();
        headers.put("Content-Type", "application/json");

        String requestBody = createPlaylistBodyBuilder();

        try {
            createPlaylistResponse = httpClientHelper.get(url, headers, requestBody);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private String createPlaylistBodyBuilder() {
        JsonObject jsonObject = new JsonObject();
        jsonObject.add("name", "New Playlist");
        jsonObject.add("description", "New playlist description");
        jsonObject.add("public", "false");
        return jsonObject.toString();
    }
}
