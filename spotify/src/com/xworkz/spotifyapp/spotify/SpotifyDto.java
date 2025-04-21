package com.xworkz.spotifyapp.spotify;

public class SpotifyDto {

    private String artistName;
    private String email;
    private String trackKey;
    private String reEnterKey;
    private long playlistId;
    private String region;

    public void setArtistName(String artistName) {
        this.artistName = artistName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setTrackKey(String trackKey) {
        this.trackKey = trackKey;
    }

    public void setReEnterKey(String reEnterKey) {
        this.reEnterKey = reEnterKey;
    }

    public void setPlaylistId(long playlistId) {
        this.playlistId = playlistId;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getArtistName() {
        return artistName;
    }

    public String getEmail() {
        return email;
    }

    public String getTrackKey() {
        return trackKey;
    }

    public String getReEnterKey() {
        return reEnterKey;
    }

    public long getPlaylistId() {
        return playlistId;
    }

    public String getRegion() {
        return region;
    }
}
