package com.xworkz.spotifyapp;

import com.xworkz.spotifyapp.spotify.SpotifyDto;
import com.xworkz.spotifyapp.login.SpotifyLogIn;

public class SpotifyRunner {

    public static void main(String[] args) {

        SpotifyDto dto = new SpotifyDto();
        dto.setArtistName("Mahesh");
        dto.setEmail("mahesh.com");
        dto.setTrackKey("beat123456");
        dto.setReEnterKey("beat123456");
        dto.setPlaylistId(1234567890L);
        dto.setRegion("India");

        SpotifyLogIn login = new SpotifyLogIn();
        boolean result = login.tuneIn(dto);
        System.out.println("Final login result: " + result);

        System.out.println(dto.toString());
    }
}
