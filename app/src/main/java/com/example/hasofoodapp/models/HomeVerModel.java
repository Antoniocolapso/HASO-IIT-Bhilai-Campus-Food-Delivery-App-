package com.example.hasofoodapp.models;

public class HomeVerModel {

    int image;
    String name;
//    String timing;
    String rating;
    int price;

    public HomeVerModel(int image, String name, String timing, String rating, int price) {
        this.image = image;
        this.name = name;
//        this.timing = timing;
        this.rating = rating;
        this.price = price;
    }



    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

//    public String getTiming() {
//        return timing;
//    }
//
//    public void setTiming(String timing) {
//        this.timing = timing;
//    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
