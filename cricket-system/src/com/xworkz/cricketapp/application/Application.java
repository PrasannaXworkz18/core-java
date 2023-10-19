package com.xworkz.cricketapp.application;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
public class Application {

    private int appId;
    private String appName;
    private double sizeInMb;
    private String companyName;
    private String releaseDate;
    private String appType;
    private String appVersion;
}
