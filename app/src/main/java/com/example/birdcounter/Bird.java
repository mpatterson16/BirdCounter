package com.example.birdcounter;

public class Bird {
    String name;
    String count;
    String picture;

    Bird(String name, String picture) {
        this.name = name;
        this.picture = picture;
        this.count = "0";
    }

    public String getName() {
        return name;
    }

    public String getPicture() {
        return picture;
    }

    public String getCount() {
        return count;
    }

    public void setCount(String count) {
        this.count = count;
    }

    @Override
    public String toString() {
        return name;
    }
}
