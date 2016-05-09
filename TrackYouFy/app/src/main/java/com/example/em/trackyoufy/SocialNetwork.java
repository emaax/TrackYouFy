package com.example.em.trackyoufy;

/**
 * Created by emiliaaxen on 16-05-09.
 */
public class SocialNetwork {
    private int imageId;
    private int bigImageId;
    private String name;
    private String country;

    public SocialNetwork(int imageId, int bigImageId, String name) {
        this.bigImageId = bigImageId;
        this.imageId = imageId;
        this.name = name;
    }

    public int getImageId() {
        return imageId;
    }

    public int getBigImageId() {
        return bigImageId;
    }

    public String getCountry() {
        return country;
    }

    public String getName() {
        return name;
    }
}
