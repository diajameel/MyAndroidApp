package com.example.myproject;

import java.util.Date;
import java.util.PrimitiveIterator;

public class Cars {
    private String Name;
    private String Status;
    private String expectedTime;
    private int image;

    public Cars(String name, String status, String expectedTime, int image) {
        Name = name;
        Status = status;
        this.expectedTime = expectedTime;
        this.image = image;
    }
    public static final Cars[] car = {
            new Cars("Volvo", "Done", "16/2/2025", R.drawable.volvo),
            new Cars("Mercedes", " Done", "17/2/2025", R.drawable.mercedes),
            new Cars("BMW", " Not finish", "19/2/2025", R.drawable.bmw),
            new Cars("Toyota", "finish ", "15/5/2025", R.drawable.toyoya),
            new Cars("Kia", " finish ", "15/7/2025", R.drawable.kia),

    };
    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String status) {
        Status = status;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getExpectedTime() {
        return expectedTime;
    }

    public void setExpectedTime(String expectedTime) {
        this.expectedTime = expectedTime;
    }


}