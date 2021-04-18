package com.example.software_patterns;

public class Products {
    String title, manufacturer;
    int price;
    String category;
    String image;
    String details;

    public Products() {
    }

    public Products(String manufacturer, String title, String category, String image, int price, String details) {
        this.manufacturer = manufacturer;
        this.title = title;
        this.category = category;
        this.image = image;
        this.price = price;
        this.details = details;
    }

    public Products(String trim, String toString, String toString1, String toString2, String toString3, int finalValue, String toString4) {
    }


    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
