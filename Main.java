public class Main{
    public static void main(String[] args){

        Clothing Tshirt = new Clothing("Tshirt", 500, "large");
        Clothing Jacket = new Clothing("Jacket", 600, "Medium");
        Shoes Heels = new Shoes("Heels", 700, 36);
        Shoes Boots = new Shoes("Boots", 800, 40);

        Tshirt.setPrice(450);

        System.out.println("Welcome to Our Store...");
        System.out.println("This is our store Items Dear customers");
        System.out.println("-----");
        System.out.println(Tshirt.getType() + "-$" + Tshirt.getPrice() + " / Size=" + Tshirt.getSize());
        System.out.println(Jacket.getType() + "-$" + Jacket.getPrice() + " / Size=" + Jacket.getSize());
        System.out.println(Heels.getType()  + "-$" + Heels.getPrice()  + " / Number=" + Heels.getNumber());
        System.out.println(Boots.getType()  + "-$" + Boots.getPrice()  + " / Number=" + Boots.getNumber());

        System.out.println("Thank you!!");
        System.out.println("-----");



    }
}
