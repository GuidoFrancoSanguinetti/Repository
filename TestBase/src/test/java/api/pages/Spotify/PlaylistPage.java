package api.pages.Spotify;

import api.helpers.RequestsHelper;
import api.pages.ApiPageBase;
import io.cucumber.cienvironment.internal.com.eclipsesource.json.JsonObject;
import org.apache.hc.core5.http.HttpResponse;

import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class PlaylistPage extends ApiPageBase {

    RequestsHelper httpClientHelper = new RequestsHelper();

    private HttpResponse createPlaylistResponse;
    private String base_url = "https://api.spotify.com/v1/playlists/";
    private String playlistId = "3cEYpjA9oz9GiPac4AsH4n";

    public void addItemsToPlaylist(String[] stringArrayOfUris) {
        String url = base_url + playlistId + "/tracks";
        Map<String, String> headers = new HashMap<>();
        headers.put("Content-Type", "application/json");

        String requestBody = addItemsToPlaylistBodyBuilder(stringArrayOfUris);

        try {
            createPlaylistResponse = httpClientHelper.get(url, headers, requestBody);
            super.setLastResponse(createPlaylistResponse);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void addItemsToPlaylist(String playlistId, String[] stringArrayOfUris) {
        String url = base_url + playlistId + "/tracks";
        Map<String, String> headers = new HashMap<>();
        headers.put("Content-Type", "application/json");

        String requestBody = addItemsToPlaylistBodyBuilder(stringArrayOfUris);

        try {
            super.setLastResponse(httpClientHelper.post(url, headers, requestBody));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private String addItemsToPlaylistBodyBuilder(String[] stringArrayOfUris) {
        JsonObject jsonObject = new JsonObject();
        jsonObject.add("uris", Arrays.toString(stringArrayOfUris));
        jsonObject.add("position", 0);
        return jsonObject.toString();
    }

    public void removeItemsFromPlaylist(String[] stringArrayOfTracksIds, String snapshotId) {
        String url = base_url + playlistId + "/tracks";
        Map<String, String> headers = new HashMap<>();
        headers.put("Content-Type", "application/json");

        String requestBody = removeItemsFromPlaylistBodyBuilder(stringArrayOfTracksIds, snapshotId);

        try {
            super.setLastResponse(httpClientHelper.delete(url, headers, requestBody));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private String removeItemsFromPlaylistBodyBuilder(String[] stringArrayOfTracksIds, String snapshotId) {
        JsonObject jsonObject = new JsonObject();
        jsonObject.add("uris", Arrays.toString(stringArrayOfTracksIds));
        jsonObject.add("snapshot_id", snapshotId);
        return jsonObject.toString();
    }

    public HttpResponse getPlaylistItems() {
        String url = base_url + playlistId + "/tracks";

        try {
            return httpClientHelper.get(url);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
