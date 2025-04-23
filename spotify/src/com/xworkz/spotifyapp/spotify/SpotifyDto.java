package com.xworkz.spotifyapp.spotify;

import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class SpotifyDto {

    private String artistName;
    private String email;
    private String trackKey;
    private String reEnterKey;
    private long playlistId;
    private String region;

    @Override
    public String toString() {
        return "SpotifyDto: " +
                "\nartistName :- " + this.artistName + "," +
                "\nemail :- " + this.email + "," +
                "\ntrackKey :- " + this.trackKey + "," +
                "\nreEnterKey :- " + this.reEnterKey + "," +
                "\nplaylistId :- " + this.playlistId + "," +
                "\nregion :- " + this.region + ",";
    }
}
