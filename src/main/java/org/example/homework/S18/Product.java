package org.example.homework.S18;
// Create a Product class with nane, price and id fields. Implement the equals() method to check only the id field. Implement the hashCode() method to use the id field to calculate the hash code. Test that two instances with the same id return true for equals() and have the same hash code. Then change the id of one instance and test that they are no longer equal and have different hash codes.
public class Product {
    private String name;
    private double price;
    private String id;

    public Product(String name, double price, String id) {
        this.name = name;
        this.price = price;
        this.id = id;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Product)) return false;
        Product product = (Product) obj;
        return id.equals(product.id);
    }
    @Override
    public int hashCode() {
        return id.hashCode();
    }

    // Getters and setters can be added here if needed
}
