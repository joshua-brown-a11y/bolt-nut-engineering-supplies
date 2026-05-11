package com.Bolt.Nut.engineering.Bolt.Nut.engineering;

public class Inquiry {
    private String name;
    private String email;
    private String phone;
    private String product;
    private String quantity;
    private String fulfillment;
    private String address;
    private String message;

    // Default Constructor
    public Inquiry() {}

    // Getters and Setters (Required for the form to work)
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
    public String getPhone() { return phone; }
    public void setPhone(String phone) { this.phone = phone; }
    public String getProduct() { return product; }
    public void setProduct(String product) { this.product = product; }
    public String getQuantity() { return quantity; }
    public void setQuantity(String quantity) { this.quantity = quantity; }
    public String getFulfillment() { return fulfillment; }
    public void setFulfillment(String fulfillment) { this.fulfillment = fulfillment; }
    public String getAddress() { return address; }
    public void setAddress(String address) { this.address = address; }
    public String getMessage() { return message; }
    public void setMessage(String message) { this.message = message; }
}