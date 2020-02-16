package com.example.birdcounter;

/*
 * This bird object stores the name, count, and picture for each bird so that they can be accessed in
 * the main activity
 */
public class Bird {
    private String name;
    private String count;
    private String picture;

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
