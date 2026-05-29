public class Shoes extends lists {

    private int number;

    // Constructor
    Shoes(String type, double price, int number) {
        setType(type);
        setPrice(price);
        this.number = number;
    }

    // Overloaded Constructor (adds brand)
    Shoes(String type, double price, int number, String brand) {
        setType(type);
        setPrice(price);
        this.number = number;
        System.out.println("Brand: " + brand);
    }

    public int getNumber()           { return number; }
    public void setNumber(int number){ this.number = number; }

    // Override display()
    @Override
    public String display() {
        return getType() + " - $" + getPrice() + " / Number=" + number;
    }
}
