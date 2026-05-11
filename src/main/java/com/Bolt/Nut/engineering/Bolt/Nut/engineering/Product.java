package com.Bolt.Nut.engineering.Bolt.Nut.engineering;

public class Product {
    private String name;
    private String category;
    private double price;
    private String description;
    private String image; // store ONLY filename

    public Product() {}

    // Default constructor (with default image)
    public Product(String name, String category, double price, String description) {
        this.name = name;
        this.category = category;
        this.price = price;
        this.description = description;
        this.image = "bnelogo.png"; // default image (just filename)
    }

    // Main constructor (with image)
    public Product(String name, String category, double price, String description, String image) {
        this.name = name;
        this.category = category;
        this.price = price;
        this.description = description;
        this.image = image;
    }

    // Getters
    public String getName() { return name; }
    public String getCategory() { return category; }
    public double getPrice() { return price; }
    public String getDescription() { return description; }
    public String getImage() { return image; }

    // Setters
    public void setName(String name) { this.name = name; }
    public void setCategory(String category) { this.category = category; }
    public void setPrice(double price) { this.price = price; }
    public void setDescription(String description) { this.description = description; }
    public void setImage(String image) { this.image = image; }
}