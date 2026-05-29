public class lists {
    private String type;
    private double price;

    public String getType()  {
        return type; }
    public double getPrice() { return price; }

    public void setType(String type)   { this.type = type; }
    public void setPrice(double price) { this.price = price; }

    public String display() {
        return type + " - $" + price;
    }
}
