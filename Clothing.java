public class Clothing extends lists {

    private String size;

    // Constructor
    Clothing(String type, double price, String size) {
        setType(type);
        setPrice(price);
        this.size = size;
    }


    // Overloaded Constructor (adds brand)
    Clothing(String type, double price, String size, String brand) {
        setType(type);
        setPrice(price);
        this.size = size;
        System.out.println("Brand: " + brand);
    }

    public String getSize()            { return size; }
    public void setSize(String size)   { this.size = size; }

    // Override display()
    @Override
    public String display() {
        return getType() + " - $" + getPrice() + " / Size=" + size;
    }
}