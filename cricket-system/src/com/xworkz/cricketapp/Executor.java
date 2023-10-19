package com.xworkz.cricketapp;

import com.xworkz.cricketapp.application.Application;

public class Executor {

    public static void main(String[] args) {
        Application app = new Application();
        app.setAppId(1);
        app.getAppId();
        app.setAppName("CrickBuzz");
        app.getAppName();
        app.setSizeInMb(40.5d);
        app.getSizeInMb();
        app.setCompanyName("CrickBuzz");
        app.getCompanyName();
        app.setReleaseDate("2019");
        app.getReleaseDate();
        app.setAppType("Entertainment");
        app.getAppType();
        app.setAppVersion("v.00.95");
        app.getAppVersion();

        System.out.println("app id is: "+app.getAppId());
        System.out.println("app name is: "+app.getAppName());
        System.out.println("app size is: "+app.getSizeInMb());
        System.out.println("app company is: "+app.getCompanyName());
        System.out.println("app release date is: "+app.getReleaseDate());
        System.out.println("app type is: "+app.getAppType());
        System.out.println("app version is: "+app.getAppVersion());
    }
}
