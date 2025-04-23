package com.xworkz.youtubeapp.youtube;

import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class YouTubeDto {

    private String userEmail;
    private String channelName;
    private String password;
    private String confirmPassword;
    private long mobile;

    @Override
    public String toString() {
        return "YouTubeDto{" +
                "userEmail='" + userEmail + '\'' +
                ", channelName='" + channelName + '\'' +
                ", password='" + password + '\'' +
                ", confirmPassword='" + confirmPassword + '\'' +
                ", mobile=" + mobile +
                '}';
    }
}
