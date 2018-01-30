package com.example.dianhuaben;

/**
 * Created by 智治 on 2018/1/30.
 */

public class People {
    private String name;
    private int imgId;


    public People(String name, int imgId) {
        this.name = name;
        this.imgId = imgId;
    }

    public String getName() {
        return name;
    }

    public int getImgId() {
        return imgId;
    }
}
